var amiibo = angular.module('amiiboApp', [])

amiibo.controller('amiiboController', function($scope, $http) {

    $scope.amiiboList;
    $scope.lineList;

    $scope.onLoad = function() {
        $scope.getLines();
        $scope.getAmiibo();
    }

    $scope.getAmiibo = function() {
        $http.post("/amiibo.json")
        .then(
            function successCallBack(response) {
                var everything = response.data;
//                console.log(everything);
                $scope.amiiboList = everything.myAmiibo;
            },
            function errorCallBack(response) {
                console.log("unable to receive list");
            });
    };

    $scope.getLines = function() {
        $http.post("/lines.json")
        .then(
            function successCallBack(response) {
                var everything = response.data;
//                console.log(everything);
                $scope.lineList = everything.categories;
            },
            function errorCallBack(response) {
                console.log("Unable to receive list of Amiibo lines");
            });
    };

    $scope.smashAmiibo = function() {
        $http.post("/smashBros.json")
        .then(
            function successCallBack(response) {
                var everything = response.data;
//                console.log(everything);
                $scope.amiiboList = everything.myAmiibo;
            },
            function errorCallBack(response) {
                console.log("Unable to receive list of Smash Bros Amiibo");
            });
    };

    $scope.toggle = function(amiibo) {
        $http.post("/toggleSingle.json", amiibo)
        .then(
            function successCallBack(response) {
                var amiibo = response.data;
                for(var count = 0; count < $scope.amiiboList.length; count++) {
                    if($scope.amiiboList[count].name === amiibo.name) {
                        $scope.amiiboList[count] = amiibo;
                    }
                }
            },
            function errorCallBack(response){
                console.log("Unable to toggle boolean");
            });
    };


})