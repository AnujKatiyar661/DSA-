const express=require('express');
const { generateFile } = require('./generateFile');
const app=express();
const { executeCpp} = require("./executeCpp")
//write first write from where u want to import

app.use(express.urlencoded({extended:true}));
app.use(express.json());
app.get('/',(req,res)=>{
 return res.json({hello:"world!"});
});

// body is actuualy contain the code which we send 
app.post("/run",async(req,res)=>{
    const {language="cpp",code}=req.body;
  
  if(code==undefined){
    
    return res.status(400).json({success:false,error:"Empty code body!"});
   }
   try{
    const filepath =await generateFile(language,code);
    const output= await executeCpp(filepath);
    
 return res.json({filepath,output});
   }
   catch(err){
    res.status(500).json({err});
   }
  //we need to generate cpp file with contetn from the request 
//   we need to run the file and send the response
 //to check ->
 //we will write the content inside this file and send this oath to the user
 //inside the postman
// return res.json({language,code});
});

app.listen(5000,()=>{
    console.log('Listening on port 5000')
});








