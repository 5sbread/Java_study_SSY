
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
let count = window.prompt("입력창 - 숫자를 입력하세요.");
let t ="";
for(let i=0; i<count; i++){
    t = t+ '<input type="text">';
}
d3.innerHTML=t; //컨턴츠에 집어넣기

//=================================================
//YEAR
const year = document.getElementById("year");
    let y = "";
    for(let i=2022; i>1900; i--){
        y=y+'<option>'+i+'</option>';
    }
    year.innerHTML=y;

//MONTH
const month = document.getElementById("month");
    let m = "";
    for(let i=1; i<13; i++){
        m=m+'<option>'+i+'</option>';
    }
    month.innerHTML=m;

//DATE
const date = document.getElementById("date");
    let d ="";
    for(let i=1; i<32; i++){
        d=d+'<option>'+i+'</option>';
    }
    date.innerHTML=d;

//=================================================
const d4 = document.getElementById("d4");

let r = prompt("Row의 갯수를 입력하세요.");
let c = prompt("Column의 갯수를 입력하세요.");
let table = "";

    for(let i=0; i<r; i++){
        table = table+"<tr>";

        for(let j=0; j<c; j++){
            table=table+"<td>"+i+j+"</td>";
        }

        table = table+"</tr>";
    }
    d4.innerHTML=table;
