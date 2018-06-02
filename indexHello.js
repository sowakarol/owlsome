
var antlr4 = require('antlr4/index');
var ECMAScriptLexer = require('./ECMAScriptLexer.js');
var ECMAScriptListener = require('./ECMAScriptListener.js');
var ECMAScriptParser = require('./ECMAScriptParser.js');
var FooTranspiler = require('./CustomListener.js');
var fs = require('fs');

//TODO making eval work

var input = `
    // {var x= function (x,y) {
    //         return 2;
    //     }; var   asd = 4; 
    // }
    owl_get :) "http://fajny-url" console.log('test-inside');
        owl_get :) "http://fajny-url-nested" console.log('test-inside-inside'); :)
    :)
    owl_post :) "http://fajniejszy-url" :) { "asd":"asd"} console.log('test-inside');; :)
    var variable = {a : { x : 4} };
    owl_json :) variable :) "a.b.c.d" :)
    owl_get_endpoint :) "/" :) "hello" :)
    owl_get :) "http://localhost:5000/" console.log(res); :)

    `;
var chars = new antlr4.InputStream(input);
var lexer = new ECMAScriptLexer.ECMAScriptLexer(chars);
var tokens = new antlr4.CommonTokenStream(lexer);
var parser = new ECMAScriptParser.ECMAScriptParser(tokens);
parser.buildParseTrees = true;

try{
    var tree = parser.program();
    var transpiler = new FooTranspiler();
    antlr4.tree.ParseTreeWalker.DEFAULT.walk(transpiler, tree);
    console.log(transpiler.output);
    fs.writeFile("owl-program.js", transpiler.output, function(err) {
        if(err) {
            return console.log(err);
        }
        console.log("The file was saved!");
    }); 
    eval(transpiler.output);
} catch (error){
    console.log(error);
}




console.log("-----------------------------------");
console.log("-----------------------------------");
