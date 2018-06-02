
	var http = require('http');
	
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
	let owl_var0, owls_var1 = "a.b.c.d".split('.');

	for (let i = 0, iLen = owls_var1.length - 1; i < iLen; i++) {
		owl_var0 = owls_var1[i];

		let candidate = variable[owl_var0];
		if (candidate !== undefined) {
			variable = candidate;
		} else {
			variable = {};
		}
	}
	