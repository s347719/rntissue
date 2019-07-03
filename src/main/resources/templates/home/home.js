angular.module('starter')
    .config(config)
    .controller('homeController', ['$scope', '$location', 'prepayService', '$http', '$timeout', function ($scope, $location, prepayService, $http, $timeout) {

        $("body").removeAttrs("class");
        $scope.headurl = "./static/img/profile.jpg";
        $scope.userName = "";

        $(function () {
            $('.sidebar-collapse').css({
                background: '#2f4050',
                height: '100%'
            });
        });

        // $.modal.loading("加载中");
        //
        // setTimeout(function () {
        //     $.modal.closeLoading();
        // },10000);
        $scope.logout = function () {

        };

        $scope.resetPwd = function () {

        };
        $scope.fullscreen = function () {
            $('#homecontent').fullScreen();
        };


        $(".menuItem").each(function (index) {
            if (!$(this).attr('data-index')) {
                $(this).attr('data-index', index);
            }
        });


        $('.menuItem').on('click', menuItem);

        function menuItem() {
            var dataIndex = $(this).data('index');

            alert(dataIndex);

            $(".menuItem").each(function (index) {
                if (dataIndex === index) {
                    $(this).hasClass('active') === true ? $(this).removeClass('active') : $(this).addClass('active');
                } else {
                    $(this).removeClass('active');
                }
            });
        }

    }])
    .factory('homeservice', homeservice);

config.$inject = ['$stateProvider', '$urlRouterProvider', '$locationProvider'];

function config($stateProvider, $urlRouterProvider, $locationProvider) {
    $urlRouterProvider.otherwise('/home/main');
    $stateProvider
        .state("main", {
            parent: 'home',
            url: "/main",
            templateUrl: 'home/main.html',
            controller: mainControl
            // resolve: {
            //     storeinfo: storeinfo,
            //     storeteacher:storeteacher
            // }
        })
    ;

    storeinfo.$inject=['homeservice'];
    function storeinfo(homeservice){
        return homeservice.storeinfo().then(
            function (value) {
                if (value) {
                    $scope.storeinfo = value;
                }else {
                    $scope.storeinfo = "";
                }
            },function (reason) {
                $scope.storeinfo = "";
            }
        );
    }


    storeteacher.$inject=['homeservice'];
    function storeteacher(homeservice){
        return homeservice.storeteacher().then(
            function (value) {
                if (value){
                    $scope.storeinfo =value;
                } else {
                    $scope.storeinfo ="";
                }
            },function (reason) {
                $scope.storeinfo ="";
            }
        );
    }



}

mainControl.$inject = ['$scope', '$location', '$timeout','homeservice'];

function mainControl($scope, $location, $timeout,homeservice) {

    $(function () {
        homeservice.storeteacher().then(
            function (value) {
                if (value){
                    $scope.storeinfo =value;
                } else {
                    $scope.storeinfo ="";
                }
            },function (reason) {
                $scope.storeinfo ="";
            }
        );

    });
    $(function () {
        homeservice.storeinfo().then(
            function (value) {
                if (value) {
                    $scope.storeinfo = value;
                }else {
                    $scope.storeinfo = "";
                }
            },function (reason) {
                $scope.storeinfo = "";
            }
        );
    });

    $scope.img_pop = function () {
        // var html = $(this).a();
        parent.layer.open({
            title: false,
            type: 1,
            closeBtn: false,
            shadeClose: true,
            area: ['600px', '600px'],
            content: '<img src="./static/img/profile.jpg" width="100%" style="float: left" alt="二维码">'
        });
    };
}

homeservice.$inject = ['$http','$q'];

function homeservice($http, $q) {
    return {
        storeteacher: storeteacher,
        storeinfo:storeinfo
    };

    function storeteacher(){
        var deferred = $q.defer();
        $http.get(baseUrl + "/storeInfo/info")
            .then(
                function (value) {
                    if (value.data.code===200){
                        deferred.resolve(value.data.data);
                    } else {
                        deferred.reject();
                    }
                },function (reason) {
                    deferred.reject();
                }
            );
        return deferred.promise;
    }
    function storeinfo() {
        var deferred = $q.defer();
        $http.get(baseUrl + "/storeInfo/info")
            .then(
                function (value) {
                    if (value.data.code===200){
                        deferred.resolve(value.data.data);
                    } else {
                        deferred.reject();
                    }
                }, function (reason) {
                    deferred.reject();
                }
            );
        return deferred.promise;
    }
}
