const express = require('express');
const bodyParser = require('body-parser');
const fs = require('fs');
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
    res.send(tasks)
 });

app.get('/tasks/add', (req, res) => {
    let name = req.query.task;
    let id = req.query.id;
    tasks[id] = name;
    console.log(tasks);
    fs.writeFile('./tasks.json', JSON.stringify(tasks), err => {
        if (err) {
			res.send(err);
		} else {
			res.send(`Added the task`);
		}
    })
 });

 app.get('tasks/remove', (req,res) => {
    id = req.query.id;
    if (id in tasks) {
        delete tasks[id];
        fs.writeFile('./tasks.json', JSON.stringify(tasks), (err) => {
            if (err) {
                res.send(err);
                
            } else {
                res.send(` ${taskToDelete} was deleted successfully`);
            }
        })
    }
    else {
        res.send("ID not valid, please change it")
    }
    

 });
