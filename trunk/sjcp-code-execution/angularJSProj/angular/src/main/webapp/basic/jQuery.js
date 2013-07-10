$(function() {
 	$('body').on('click', function (){
 		console.log("Body catch mouse enter events");
 	});

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

