var antlr4 = require('antlr4/index');
var HelloLexer = require('./HelloLexer.js');
var HelloListener = require('./HelloListener.js');
var HelloParser = require('./HelloParser.js');
var FooTranspiler = require('./CustomListener.js');


// var Listener = function() {
//     HelloListener.HelloListener.call(this); // chain the constructor
// };

    var input = "{ var asd;}";
    var chars = new antlr4.InputStream(input);
    var lexer = new HelloLexer.HelloLexer(chars);
    var tokens  = new antlr4.CommonTokenStream(lexer);
    var parser = new HelloParser.HelloParser(tokens);
    parser.buildParseTrees = true;
    var tree = parser.program();
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