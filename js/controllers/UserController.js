module.exports = function(app) {
    app.controller('UserController', ['UserService',
        '$scope', '$location',
        function(UserService, $scope, $location) {

            $scope.signIn = function() {
                console.log("clicked log in");
                UserService.postUserInfo($scope.username)
                console.log('clicked')
                if ($scope.username != null) {
                    $location.path('/home');
                } else {
                    alert('Please enter a username');
                }
            }

            $scope.signUp = function() {
                console.log("clicked log in");
                UserService.postUserInfo($scope.username)
                console.log('clicked')
                if ($scope.username != null) {
                    $location.path('/home');
                } else {
                    alert('Please enter a username');
                }
            }

        }
    ]);
}
