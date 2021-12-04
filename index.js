const express = require('express');
const bodyParser = require('body-parser');
let app = express();
app.use(bodyParser.json());

let tasks = {}
app.listen(3000, () => {
    console.log("Listening on port 3000!")
})

app.get('/', (req,res) => {
    res.send("Welcome to a task API")
})
app.get('/tasks', (req, res) => {
    let name = req.query.task;
    let id = req.query.id;
    tasks[id] = name;
    res.send(tasks)
 });

 app.get('/remove', (req,res) => {
    id = req.query.id;
    if (id in tasks) {
        delete tasks[id];
        res.send("Task Deleted!");
    }
    else {
        res.send("ID not valid, please change it")
    }
 });
