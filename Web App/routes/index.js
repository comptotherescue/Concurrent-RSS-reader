var express = require('express');
var router = express.Router();

var db = require('../db')

router.get('/' , function(req,res,next){
  res.render('index.html')

  });

var dataBase = db.getDB();



module.exports = router;
