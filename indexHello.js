
var antlr4 = require('antlr4/index');
var ECMAScriptLexer = require('./ECMAScriptLexer.js');
var ECMAScriptListener = require('./ECMAScriptListener.js');
var ECMAScriptParser = require('./ECMAScriptParser.js');
var FooTranspiler = require('./CustomListener.js');


// var Listener = function() {
//     ECMAScriptListener.ECMAScriptListener.call(this); // chain the constructor
// };

    var input = `
    {var x= function (x,y) {
            return 2;
        }; var   asd = 4; 
    }
    owl_get :) "http://fajny-url" console.log('test-inside'); :)
    owl_post :) "http://fajniejszy-url" :) { "asd":"asd"} console.log('test-inside');; :)
    owl_json :) {a : { x : 4} } :) "a.b.c.d" :)
    `;
    var chars = new antlr4.InputStream(input);
    var lexer = new ECMAScriptLexer.ECMAScriptLexer(chars);
    var tokens  = new antlr4.CommonTokenStream(lexer);
    var parser = new ECMAScriptParser.ECMAScriptParser(tokens);
    parser.buildParseTrees = true;
    var tree = parser.program();
    // console.log(tokens.tokenSource);
    //tree.r();
    var transpiler = new FooTranspiler();      
    antlr4.tree.ParseTreeWalker.DEFAULT.walk(transpiler, tree);
    console.log(transpiler.output);
    // eval(transpiler.output);
    
    
    // var printer = new Listener();
    // antlr4.tree.ParseTreeWalker.DEFAULT.walk(printer, tree);
    // console.log(printer.stack.slice(-1).pop());
    // console.log(tree);
    console.log("-----------------------------------");
    // console.log(tree.r());
    console.log("-----------------------------------");

    // console.log(tree);


    /*
    autentykacja - potwierdzenie czy user to user
    autoryzacja - sprawdza sie prawo do zasobu
    jaas
    
     */