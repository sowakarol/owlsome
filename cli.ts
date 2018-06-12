import { existsSync, writeFile, readFileSync } from "fs";
import { transpile } from "./transpiler";
const OWL_EXTENSION = "owl";

process.argv.slice(2).forEach((filename: string) => {

    if (existsSync(filename) && hasCorrectExtension(filename)) {
        let content = readFileSync(filename, 'utf8');
        let program = transpile(content);
        const outputFileName = filename.substr(0, filename.lastIndexOf('.')) + ".js";
        writeFile(outputFileName, program, (err) => {
            if (err) {
                return console.log(err);
            }
            console.log("[Transpiler] Output file saved.");
        });
        eval(program);
    } else {
        console.log(`wrong path or file extension: ${filename}`);
    }
});

function hasCorrectExtension(filename: string): boolean {
    return filename.split('.').pop() === OWL_EXTENSION;
}