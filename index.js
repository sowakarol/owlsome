
var antlr4 = require('antlr4/index');
var ECMAScriptLexer = require('./ECMAScriptLexer.js');
var ECMAScriptListener = require('./ECMAScriptListener.js');
var ECMAScriptParser = require('./ECMAScriptParser.js');


    var input = "varasda 21=23.2.1 5;";
    var chars = new antlr4.InputStream(input);
    var lexer = new ECMAScriptLexer.ECMAScriptLexer(chars);
    var tokens  = new antlr4.CommonTokenStream(lexer);
    var parser = new ECMAScriptParser.ECMAScriptParser(tokens);
    parser.buildParseTrees = true;
    var tree = parser.program();
    console.log("Parsed: "+ tree);