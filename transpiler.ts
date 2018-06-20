import { InputStream, CommonTokenStream, tree as antrl_tree } from "antlr4/index";
import { ECMAScriptLexer } from "./ECMAScriptLexer";
import { ECMAScriptParser } from "./ECMAScriptParser";
const FooTranspiler = require('./CustomListener.js');

export function transpile(input) {

    var chars = new InputStream(input);
    console.log("[Transpiler] chars  generated");
    
    try {
    var lexer = new ECMAScriptLexer(chars);
    console.log("[Transpiler] lexer  generated");
    var tokens = new CommonTokenStream(lexer);
    console.log("[Transpiler] tokens generated");
    var parser = new ECMAScriptParser(tokens);
    console.log("[Transpiler] parser generated");
        var tree = parser.program();
        console.log("[Transpiler] Tree   generated");
        var transpiler = new FooTranspiler();
        console.log("[Transpiler] new transpiler created");
        antrl_tree.ParseTreeWalker.DEFAULT.walk(transpiler, tree);
        console.log("[Transpiler] tree processed");
        return transpiler.getOutput();
    } catch (error) {
        console.log(error);
    }
}
