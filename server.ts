import express = require('express');

const app = express();
const PORT = 7070;

app.get("/hello", (req, res) => {
    res.status(200).send("Hello!");
})
app.listen(PORT, () => {
    console.log(`server is listening on port ${PORT}`);
});


