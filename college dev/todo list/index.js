let inputfield=document.getElementById('inputfield')
let addbtn=document.getElementById('addbtn');
let task=document.getElementById('task');
 
addbtn.addEventListener('click', ()=>{
    //it create n element of p tag
    let para=document.createElement('p');
    para.innerHTML= inputfield.value;//it gives  <p>war<p/>
    para.classList.add('para-styling')//it add <p class="para-styling">
    task.appendChild(para);//it include itself to task
    // <div class='task'>
    //     <p class="para"></p>
    // </div>
    console.log(task);
    para.addEventListener('click',()=>{
        para.style.textDecoration="line-through";
    })
    para.addEventListener('dblclick',()=>{
        task.removeChild('para');
    })
})










