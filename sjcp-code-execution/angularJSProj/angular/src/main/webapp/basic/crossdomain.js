$(function() {
		$.postSync = function(url, data, callback) {
			if(typeof data === "string"){
				return $.ajax({
			        type: 'POST',
			        url: url,
			        cache: false,
			        contentType: 'application/json',
			        data: data,
			        dataType: 'json',
			        async: false,
			        success: callback
			    });
			}else if(window.JSON && window.JSON.stringify){
			    return $.ajax({
			        type: 'POST',
			        url: url,
			        cache: false,
			        contentType: 'application/json',
			        data: window.JSON.stringify(data),
			        dataType: 'json',
			        async: false,
			        success: callback
			    });
			}
			return null;
		};
		
		
		var url = "http://localhost:8080/i-web/" + "resource/i18n/prefix" ;
		$.postSync(url, ['workspace'], function(data){
			console.log(data);
		});
})  			