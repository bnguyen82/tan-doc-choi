
function PhoneService($http){
   this.http = $http;
   this.getJson = function(fnSuccess){
	   var self = this;
	   $http.get("phones.json").success(function(data){
		    fnSuccess.call(self, data);
	  });
   };
}