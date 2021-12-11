const express = require('express');
const bodyParser = require('body-parser');
let app = express();
const fs = require("fs");

app.use(bodyParser.json());

app.listen(3000, () => {
    console.log("Listening on port 3000!")
})

app.get('/', (req,res) => {
    res.send("Hello, to get the wanted file please enter /files/{file name}. you can choose from: file1, file2, file3")
})

app.get('/files/:file', (req, res) => {
    let fileName = req.params.file
    if (["file1", "file2", "file3"].includes(fileName)) {
        let readStream = fs.createReadStream("Exercise5/" + fileName + ".jpeg")
        readStream.pipe(res);
    } else {
        res.send("Wrong file name")
    }
});