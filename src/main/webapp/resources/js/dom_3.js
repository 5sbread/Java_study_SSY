
const d1 = document.getElementById("d1");
const d2 = document.getElementById("d2");
const btn1 = document.getElementById("btn1");

d1.innerHTML="Hello";

//function 함수명
function test(){
    alert("CLICK EVENT 실행");
    let result = test2(1,2);
    console.log(result);
}

//이름 있는 함수
function test2(num1, num2){
    let result = num1+num2;
    return result;
}

//이름 없는 함수
let f1 = function (){
    console.log("익명함수 실행");
}

//event 적용 2
d2.onclick = function(){
    console.log("CLICK 콜백함수 실행")
}

//event 적용 3
//btn1.addEventListener("click", f1);
btn1.addEventListener("click", function(){
    console.log("Event Listner 실행")
});