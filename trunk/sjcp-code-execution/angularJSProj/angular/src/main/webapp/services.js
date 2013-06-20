
function PhoneService($http){
   this.http = $http;
}
PhoneService.prototype.getJson = function(fnSuccess){
   var self = this;
   self.http.get("phones.json").success(function(data){
	    fnSuccess.call(self, data);
  });
};