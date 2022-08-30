const d1 = document.getElementById("d1");
const d2 = document.getElementById("d2");
const d3 = document.getElementById("d3");
const btn = document.getElementById("btn");
const btn2 = document.getElementById("btn2");
const btn3 = document.getElementById("btn3");
const btn4 = document.getElementById("btn4");
const select = document.getElementById("select");
const c1 = document.getElementsByClassName("c1");

//이벤트 등록
btn.addEventListener("click", function(){
    console.log("work");
    console.log(d1.value);
    console.log(d2.value);
    d3.value=d1.value/1 + d2.value/1;
});

btn2.addEventListener("click", function(){
    console.log("btn2");
});

btn3.addEventListener("click", function(){
    console.log("btn3-1");
    
    //이벤트 강제로 발생
    btn2.click();
});

//===========================================
btn.addEventListener("click", function(){
    console.log("operator : ", select.value);
    let result = 0;
    
    if(select.value=="+"){
        result = d1.value*1 + d2.value*1;
    }else if(select.value=="-"){
        result = d1.value*1 - d2.value*1;
    }else if(select.value=="*"){
        result = d1.value*1 * d2.value*1;
    }else if(select.value=="/"){
        result = d1.value*1 / d2.value*1;
    }else {
        result = d1.value*1 % d2.value*1;
    }
    d3.value = result;
})

//===========================================
btn4.addEventListener("click", function(){
    alert(c1);
    console.log(c1);
    console.log(cq.value);

    for(let i=0; i<c1.length; i++){
        console.log(c1[i].selected);
    }
});