console.log("=0.0=");

let result = window.confirm("확인?"); //팝업창
console.log("result : ", result); //콘솔에 true/ false 출력

result = window.prompt("이름을 입력하세요."); //입력 팝업창
console.log("result : ", result); //콘솔에 답변 출력

let d1 = window.document.getElementById("d1"); //아이디 d1에서 element를 가져옴
window.alert(d1);
window.console.log(d1);

//html 코드 사용 가능
d1.innerHTML='<h1>'+result+'</h1>';
//text
d1.innerText=result;

let d2 = document.getElementById("d2");
console.log(d2.innerHTML); //콘솔에 d2 html 출력
console.log(d2.innerText); //콘솔에 d2 내용 출력

let d3 = document.getElementById("d3");
let d4 = document.getElementById("d4");
d4.innerHTML = d3.innerHTML; //d3의 내용을 꺼내서 d4에 넣기

