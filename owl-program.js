
	var http = require('http');
	var express = require('express');

	var app = express();
	
	async function owl0() { 
		return await http.get( "http://fajny-url" , (res) => { 
	console.log('test-inside');
	async function owl1() { 
		return await http.get( "http://fajny-url-nested" , (res) => { 
	console.log('test-inside-inside');
}).on("error", (err) => {
	console.log("Error: " + err.message);
});
} 
owl1()

}).on("error", (err) => {
	console.log("Error: " + err.message);
});
} 
owl0()

	async function owl2() { 
		return await http.request( {"asd":"asd","url":"\"http://fajniejszy-url\"","method":"post"} , (res) => { 
	console.log('test-inside');;
}).on("error", (err) => {
	console.log("Error: " + err.message);
});
}
owl2()
var variable={a:{x:4}};
	let owl_var0 = "a.b.c.d".split('.');
	let owl_var2 = owl_var0.reduce((accumulator, currentValue) => {
	  if (accumulator[currentValue] === undefined) accumulator[currentValue] = {};
	  return accumulator[currentValue];
	}, variable);
	console.log(variable);
	
	app.get("/", function (req, res) {
		res.send("hello");
	});
	
	async function owl3() { 
		return await http.get( "http://localhost:5000/" , (res) => { 
	console.log(res);
}).on("error", (err) => {
	console.log("Error: " + err.message);
});
} 
owl3()
