
var http = require('http');
var express = require('express');
const owlGet = require('./http-wrappers').owlGet;
var app = express();
(async () => {
var url="http://localhost:7070/hello";var hello=await owlGet(url);
	console.log(hello);var variable={a:{x:4}};
})()