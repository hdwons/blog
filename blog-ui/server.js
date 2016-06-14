var express = require('express');
var server = express();  
var SERVER_PORT = 9910;
server.use(express.static(__dirname+'/app')).listen(SERVER_PORT);  
console.log('server is listening port ' + SERVER_PORT); 
