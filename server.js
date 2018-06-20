const express = require('express');
const bodyParser = require("body-parser");

const PORT = 7070;

const app = express();
app.use(bodyParser.json());

app.get("/hello", (req, res) => {
    console.log(`[GET]<`);
    let response = `Hello!`
    console.log(`[GET]>   | ${response}`);
    res.status(200).send(response);
})

app.post("/hello", (req, res) => {
    console.log(`[POST]<  | ${JSON.stringify(req.body)}`);
    let response = `Hi ${req.body.name}!`
    console.log(`[POST]>  | ${response}`);
    res.status(200).send(response);
})

app.put("/hello", (req, res) => {
    console.log(`[PUT]    | ${JSON.stringify(req.body)}`);
    data.push(req.body);
    printData();
    res.status(200).send();
})

app.delete("/hello/:id", (req, res) => {
    console.log(`[DELETE] | id: ${req.params.id}`);
    data = data.filter(obj => obj.id != req.params.id);
    printData();
    res.status(200).send();
})

app.listen(PORT, () => {
    console.log(`server is listening on port ${PORT}`);
});

let data = [];

function printData() {
    console.log("----------");
    console.log("Data:");
    console.log(data);
    console.log("----------");
}