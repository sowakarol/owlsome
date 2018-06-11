import { existsSync, readFile, writeFile, readFileSync } from "fs";
import { transpile } from "./transpiler";
const OWL_EXTENSION = "owl";

process.argv.slice(2).forEach((filename: string) => {

    if (existsSync(filename) && hasCorrectExtension(filename)) {
        let content = readFileSync(filename, 'utf8');
        transpile(content);
    } else {
        console.log(`wrong path or file extension: ${filename}`);

    }
});

function hasCorrectExtension(filename: string): boolean {
    return filename.split('.').pop() === OWL_EXTENSION;
}