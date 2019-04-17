var express = require('express');
var db = require('../db')
var router = express.Router();

router.get('/collections' , function(req,res,next){
  db.getDB().listCollections().toArray(function(err,items){
    if(err){
      res.send(err);
    }else{
      res.send(items);
    }
    })
});

module.exports =router;
