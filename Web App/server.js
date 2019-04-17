var express = require('express');
var path = require('path');
var bodyParser = require('body-parser');

var index = require('./routes/index');
var tasks = require('./routes/tasks');
// var collections = require('./routes/collections');
var app = express();



var db = require('./db');
var port = 3000;

app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'ejs');
app.engine('html', require('ejs').renderFile);

app.use(express.static(path.join(__dirname,'client')));

app.use(bodyParser.json());

app.use(bodyParser.urlencoded({extended : false}));

app.use('/',index);
app.use('/api',tasks);
// app.use('/api/getCollections',collections);

db.connect((err)=>{
    if(err){
        console.log('unable to connect to database');
        process.exit(1);
    }
    // Successfully connected to database
    // Start up our Express Application
    // And listen for Request
    else{
        app.listen(port,()=>{
            console.log('connected to database, app listening on port 3000');
        });
    }
});
