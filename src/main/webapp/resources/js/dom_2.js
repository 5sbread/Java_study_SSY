
//1. 선택자
const d1 = document.getElementById("d1");
const d2 = document.getElementById("d2");
const d3 = document.getElementById("d3");

//d1 value 팝업창
// alert(d1.value);
// alert(d1.getAttribute("value"));

//=================================================
//d2의 type을 button으로 변경
//두가지 방법
d2.type="button";
d2.setAttribute("type","button");

//=================================================
//입력한 숫자만큼 입력창을 만듦
let count = window.prompt("숫자를 입력하세요.");
let t ="";
for(let i=0; i<count; i++){
    t = t+ '<input type="text">';
}
d3.innerHTML=t;

//=================================================
//YEAR
const year = document.getElementById("year");

//MONTH
const month = document.getElementById("month");
for(let m=0; m<13; m++){
    console.log("m");
}

//DATE
const date = document.getElementById("date");

//=================================================
let r = prompt("Row의 갯수를 입력하세요.");
let c = prompt("Column의 갯수를 입력하세요.");
