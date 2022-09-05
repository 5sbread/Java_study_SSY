
const count = document.getElementById("count");
const btn = document.getElementById("btn");
const result = document.getElementById("result");
const c1 = document.getElementsByClassName("c1");
const d1 = document.getElementById("d1");
const d1_1 = document.getElementById("d1_1");
const d1_1_1 = document.getElementById("d1_1_1");
const google = document.getElementById("google");


google.addEventListener("click", function(event){
    alert("Go Google");
    event.preventDefault(); //Element가 가진 기본 동작 중단
});


//---------------------------
//div 안에 있는 버튼 클릭해보기
d1.addEventListener("click", function(event){
    console.log("d1 click");
    console.log(event);
    console.log(event.target);
    console.log(event.currentTarget);

    if(event.target){
        alert("button");
        console.log("this : "+this);
        alert(event.target.innerHTML);
    }
    //event.stopPropagation(); //버블린, 캡처링 중단
}, false);

//--------------------------------------
result.addEventListener("click", function(event){
    if(event.target.className=='c1'){
        alert(event.target.innerHTML);
    }
})



//-------------------------------------

d1_1.addEventListener("click", function(){
    console.log("d1_1 click");
}, false);

d1_1_1.addEventListener("click", function(event){
    console.log("d1_1_1 click");
    //event.stopPropagation();
}, false); //버블링 - 자식부터 실행됨


//--------------------------------
for(c of c1){
    c.addEventListener("click", function(){
        console.log(c.innerHTML);
    })                  
}

btn.addEventListener("click",function(){                               
    for(let i=0; i<count.value; i++){
        console.log(i);
            
        let button = document.createElement("button");
        let t = document.createTextNode("CLICK"+(1+i));
        button.appendChild(t);

        let attr = document.createAttribute("class");
        attr.value="c1";
        button.setAttributeNode(attr);

        result.append(button);
    }   
});
