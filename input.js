
var express = require('express');
const owlGet = require('./http-wrappers').owlGet;
const owlPost = require('./http-wrappers').owlPost;
const owlPut = require('./http-wrappers').owlPut;
const owlDelete = require('./http-wrappers').owlDelete;

(async () => {
	var url = "http://localhost:7070/hello"; 
	var hello = await owlGet(url);

	console.log(hello); 
	var body = { "name": "Sowa" }; 
	var response = await owlPost(url, body);
	console.log(response); 
	await owlPut(url, { id: 1, name: "Bartek" });
	var url2 = url + "/1"; 
	await owlDelete(url2);
	var x = "kompilatory 2018"; 
	await console.log(x);
	var variable = { a: { x: 4 } }; 
	let owl_var0 = "a.b.c.d".split('.');
	let owl_var2 = owl_var0.reduce((accumulator, currentValue) => {
		if (accumulator[currentValue] === undefined) accumulator[currentValue] = {};
		return accumulator[currentValue];
	}, variable);
	console.log(variable);

})()