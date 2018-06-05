
var http = require('http');
var express = require('express');
const owlGet = require('./http-wrappers').owlGet;
var app = express();
(async () => {
	
		await owlGet("http://fajny-url")
	console.log('test-inside');	
		await owlGet("http://fajny-url-nested")
	console.log('test-inside-inside');
	async function owl0() { 
		return await http.request( {"asd":"asd","url":"\"http://fajniejszy-url\"","method":"post"} , (res) => { 
	console.log('test-inside');;
}).on("error", (err) => {
	console.log("Error: " + err.message);
});
}
owl0()
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
		
		await owlGet("http://localhost:5000/")
	console.log(res);})()