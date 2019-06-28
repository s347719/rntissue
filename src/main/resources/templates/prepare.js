

angular
    .module('starter', ['ui.router'])
    .run(run)
    .config(config)
    .factory('prepayService', prepayService);

var baseUrl = "http://10.6.30.140:8081";
var openid ="";

run.$inject = ['$rootScope', '$state', '$stateParams'];

function run($rootScope, $state, $stateParams) {
    $rootScope.$state = $state;
    $rootScope.$stateParams = $stateParams;
}

layer.config({
    extend: 'moon/style.css',
    skin: 'layer-ext-moon'
});

config.$inject = ['$stateProvider', '$urlRouterProvider', '$locationProvider'];

function config($stateProvider, $urlRouterProvider, $locationProvider) {
    $locationProvider.hashPrefix('');
    $urlRouterProvider.otherwise('/');
    $stateProvider
        .state("splash", {
            url: "/",
            templateUrl: 'login/login.html',
            controller:loginCtrl,
            resolve: {
                isUserExits: isUserExits
            }
        })
        .state("home",{
            url:"/home",
            templateUrl:'home/home.html',
            controller:"homeController"
        })
    ;
    isUserExits.$inject = ['prepayService', '$location'];

    // 是否支持微信预缴费
    function isUserExits(prepayService, $location) {
        if ($location.search().openid) {
            openid = $location.search().openid;
            // 查询是否支持微信预缴费
            return prepayService.isUserExits(openid).then(
                function (isExits) {
                    if (isExits === 1) {
                        // 支持 跳转到主页
                        $location.path('/home').search($location.search());
                    } else {
                        // 不支持 将去绑定
                        return 0;
                    }
                },
                function (isExitsErr) {
                    // 接口调用失败
                    return isExitsErr;
                }
            );
        } else {
            // 不支持
            return 0
        }
    }

}


// 首页
loginCtrl.$inject = ['$scope', '$state', '$location', '$prepayService', '$timeout'];

function loginCtrl($scope, $state, $location, $prepayService, $timeout) {
    $("body").addClass("signin");

    $scope.loginInfo = {
        username: null,
        password: null
    };
    $scope.loginErr = null;
    $scope.loginButtonText = "登录";
    var location = (window.location + '').split('/');
    // var basePath = location[0] + '//' + location[2] + '/' + location[3];
    var isLoginSuccess = true;
    $scope.login = function () {
        if (!isLoginSuccess) {
            return;
        }
        isLoginSuccess = false;
        $scope.loginErr = null;
        if (!$scope.loginInfo.username && !$scope.loginInfo.password) {
            $scope.loginErr = "请输入登录账号和密码！";
            isLoginSuccess = true;
            return;
        }
        if (!$scope.loginInfo.username) {
            $scope.loginErr = "请输入登录账号！";
            isLoginSuccess = true;
            return;
        }
        if (!$scope.loginInfo.password) {
            $scope.loginErr = "请输入密码！";
            isLoginSuccess = true;
            return;
        }
        $scope.loginButtonText = "登录...";
        // luoq 2019年3月21日17:20:17 更新密码传输方式
        $scope.loginInfo.password = rsaEncrypt($scope.loginInfo.password);
        $scope.newLoginFormObj = {
            username: $scope.loginInfo.username,
            password: $scope.loginInfo.password
        };
        isLoginSuccess = false;
        // $ionicLoading.show({
        //     template:'正在验证...'
        // });
        $http.post( baseUrl + "/login", $scope.newLoginFormObj)
            .success(function (data) {
                // $ionicLoading.hide();
                isLoginSuccess = true;
                $scope.loginButtonText = "登录";
                if (data.status === 200 || data.status === 1003) {
                    $window.location.href = baseUrl
                        + "/mobile/tuition/index.html";
                } else {
                    $scope.loginErr = data.message;
                }
            })
            .error(function () {
                // $ionicLoading.hide();
                isLoginSuccess = true;
                $scope.loginButtonText = "登录";
            });
    };
}


function prepayService($http, $q) {
    return {
        isUserExits: isUserExits
    };

    // 是否存在这个人
    function isUserExits(data) {
        var deferred = $q.defer();
        $http
            .get(baseUrl + "/user",{params:{openid:data}})
            .then(
                function (value) {
                    if (value.code==="200") {
                        // 支持
                        deferred.resolve(1);
                    } else {
                        // 不支持
                        deferred.resolve(0);
                    }
                },
                function (reason) {
                    deferred.reject(reason)
                }
            );
        return deferred.promise;
    }
}

