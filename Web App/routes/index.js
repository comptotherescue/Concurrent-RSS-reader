var express = require('express');
var router = express.Router();

var db = require('../db')

router.get('/' , function(req,res,next){
  res.send("hello world")

  });

 var dataBase = db.getDB();



module.exports = router;
