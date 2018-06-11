//@ts-nocheck

import { InputStream, CommonTokenStream, tree as antrl_tree } from "antlr4/index";
import { ECMAScriptLexer } from "./ECMAScriptLexer";
import { ECMAScriptParser } from "./ECMAScriptParser";
import * as fs  from "fs";
const  FooTranspiler = require('./CustomListener.js');

export function transpile(input) {

    var chars = new InputStream(input);
    console.log("[Transpiler] chars generated");
    
    var lexer = new ECMAScriptLexer(chars);
    console.log("[Transpiler] lexer generated");
    var tokens = new CommonTokenStream(lexer);
    console.log("[Transpiler] tokens generated");
    var parser = new ECMAScriptParser(tokens);
    console.log("[Transpiler] parser generated");
    parser.buildParseTrees = true; // zakomentowane bo TS się czepia xD
    
    try {
        var tree = parser.program();
        console.log("[Transpiler] Tree generated");
        var transpiler = new FooTranspiler();
        console.log("[Transpiler] new transpiler created");
        antrl_tree.ParseTreeWalker.DEFAULT.walk(transpiler, tree);
        console.log("[Transpiler] tree has been walked");
        console.log(transpiler.output);
        fs.writeFile("owl-program.js", transpiler.output, function (err) {
            if (err) {
                return console.log(err);
            }
            console.log("The file was saved!");
        });
        eval(transpiler.output);
    } catch (error) {
        console.log(error);
    }
    console.log("-----------------------------------");
    console.log("-----------------------------------");
}