(function () {
    angular.module('cegeka.loggingserver', ['ngResource'])
        .factory('loggingService', loggingService)
        .controller('loggingController', loggingController);


    function loggingService($resource) {
        var logger = $resource('/log');
        return {
            log: function () {
                logger.query()
            }
        };

    }

    function loggingController(loggingService) {
        var that = this;

        that.buttonPushed = function () {
            loggingService.log();
        }
    }

})();