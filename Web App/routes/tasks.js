var express = require('express');
var db = require('../db')
var router = express.Router();

router.get('/getCollections' , function(req,res,next){
  db.getDB().listCollections().toArray(function(err,items){
    if(err){
      res.json(err);
    }else{
      res.json(items);
    }
    })
});


router.get('/getCollection/:name' , function(req,res,next){
  db.getDB().collection(req.params.name).find().toArray(function(err, docs){
    if(err){
      res.json(err);
    }else{
      res.json(docs);
    }
  })
});

module.exports =router;
