$(function() {
 	$('body').on('click', function (){
 		console.log("Body catch mouse enter events");
 	});
 	
 	//Example for Promise >>>>
 	function delay(){
 		var deferred = $.Deferred();
 		
 		setTimeout(function(){
 			console.log("It's time to work");
// 			deferred.resolve("Bao");
 			deferred.reject("Bao");
 		}, 2000);
 		
 		return deferred.promise();
 	}
 	
 	delay().done(
	 		function(name){
	 			console.log("result is" + name);
 		})
 		.fail(
	 		function(name) { 
	 			console.log("something went wrong " + name); 
 		})
 		.always(
 			function(name) { 
 				console.log("something went wrong " + name); 
 		});
// 	delay().then(
// 			function(name){
// 				console.log("result is" + name);
// 			},
// 			function(name) { 
// 				console.log("something went wrong " + name); 
// 			}
// 	);
 	//Example for Promise <<<<

})

function showConsole(){
	console.log("Code running");
}

var a = function(){
	var name = "ha";
	console.log("Code running");
}

//a();

//run immediately
var b = (function(){
		console.log("Code running " + name);
	}
)();


function c(){
	var name = "ha";
	console.log("Code running");
	return name;
}

var d = (function(){
		var name = "bao";
		return {
			getName: function() {
			 	return name;
			}
		}
	}
)();

var c1 = new c();

console.log(c1.name);
console.log(d.name);
console.log(d.getName());

//(function(){
//		console.log("Code running");
//	}
//)();

