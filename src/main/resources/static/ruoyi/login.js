
var baseUrl = "http://10.6.30.140:8081";

var module = angular.module('indexModule',[]);
module.controller('loginCtrl',['$scope','$ionicLoading',function ($scope,$ionicLoading) {
    $scope.loginInfo = {
        username: null,
        password: null
    };
    $scope.loginErr = null;
    $scope.loginButtonText = "登录";
    var location = (window.location + '').split('/');
    var basePath = location[0] + '//' + location[2] + '/' + location[3];
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
            password: $scope.loginInfo.password,
        };
        isLoginSuccess = false;
        $ionicLoading.show({
            template:'正在验证...'
        });
        $http.post( baseUrl + "/login", $scope.newLoginFormObj)
            .success(function (data) {
                $ionicLoading.hide();
                isLoginSuccess = true;
                $scope.loginButtonText = "登录";
                if (data.status == 0 || data.status == 1003) {
                    $window.location.href = baseUrl
                        + "/mobile/tuition/index.html";
                } else {
                    $scope.loginErr = data.message;
                }
            })
            .error(function () {
                $ionicLoading.hide();
                isLoginSuccess = true;
                $scope.loginButtonText = "登录";
            });
    };


}]);

