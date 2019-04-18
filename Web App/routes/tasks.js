var express = require('express');
var db = require('../db')
var router = express.Router();

router.get('/getCollections' , function(req,res,next){
  db.getDB().listCollections().toArray(function(err,items){
    if(err){
      res.json(err);
    }else{
      var collections =[];
      for(var i = 0; i < items.length; i++){
        var obj = items[i];
        console.log("OBJ IS " + obj);
        for(var key in obj){
          var Name = key;
          if(Name == 'name'){
             var value = obj[key];
             collections.push({Name:value});
          }
        }
      }
    res.send(collections);
    }
    })
});


router.get('/getCollection/:name' , function(req,res,next){
  db.getDB().collection(req.params.name).find().toArray(function(err, docs){
    if(err){
      res.json(err);
    }else{
      var docsjson = [];
      for(var i = 0; i < docs.length;i++ ){
        var obj = docs[i];
        for(var key in obj){
          var name = key;
          if(name == 'JSON'){
            var value = obj[key];
            console.log(value);
            docsjson.push(value);
          }
        }
      }
      res.json(docsjson);
    }
  })
});

module.exports =router;
