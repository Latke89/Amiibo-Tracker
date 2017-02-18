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

    $scope.acAmiibo = function() {
        $http.post("/animalCrossing.json")
        .then(
            function successCallBack(response) {
                var everything = response.data;
                $scope.amiiboList = everything.myAmiibo;
            },
            function errorCallBack(response) {
                console.log("Unable to receive list of Animal Crossing Amiibo");
            });
    };

    $scope.kirbyAmiibo = function() {
        $http.post("/kirby.json")
        .then(
            function successCallBack(response) {
                var everything = response.data;
                $scope.amiiboList = everything.myAmiibo;
            },
            function errorCallBack(response) {
                console.log("Unable to receive list of Kirby Amiibo");
            });
    };

    $scope.marioAmiibo = function() {
        $http.post("/mario.json")
        .then(
            function successCallBack(response) {
                var everything = response.data;
                $scope.amiiboList = everything.myAmiibo;
            },
            function errorCallBack(response) {
                console.log("Unable to receive list of Mario Amiibo");
            });
    };

    $scope.splatoonAmiibo = function() {
        $http.post("/splatoon.json")
        .then(
            function successCallBack(response) {
                var everything = response.data;
                $scope.amiiboList = everything.myAmiibo;
            },
            function errorCallBack(response) {
                console.log("Unable to receive list of Splatoon Amiibo");
            });
    };

    $scope.zeldaAmiibo = function() {
        $http.post("/zelda.json")
        .then(
            function successCallBack(response) {
                var everything = response.data;
                $scope.amiiboList = everything.myAmiibo;
            },
            function errorCallBack(response) {
                console.log("Unable to receive list of Zelda Amiibo");
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