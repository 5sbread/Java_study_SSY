//팝업창
alert("Welcome");

// 1
// int num=1; <- java

var num=1;
//지역 변수 (현재는 사용XX)
//hoisting 호이스팅 문제 발생 여지가 있음

let num=1;
//var 대신 사용

const num=1;
//상수 | 값 변경X

num = 'abc';
// ㄴ 가능 | why? 변수를 넣을 때 타입이 정해짐, 문자열 타입으로 바뀜

let num2 = 1;
let num3 = '1';

console.log(num2 == num3);
//true
//값만 비교

console.log(num2 === num3);
//false
//값과 타입 다 비교

for(let i=0; i<10; i++){
    console.log(i);
}

let ar = [1, '2', 3.12, true];
console.log(ar[0]);

ar.push(5);
ar.unshift('9');
ar.sort(); //오름차순
ar.reverse(); //오름차순한 것을 거꾸로

ar.forEach(function(v, i, ar){
    console.log("V : ", v);
    console.log("i : ", i);
    console.log("--------------------");
});
