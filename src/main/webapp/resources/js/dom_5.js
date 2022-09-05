const d1 = document.getElementById("d1");
const d2 = document.getElementById("d2");
const d3 = document.getElementById("d3");
const d4 = document.getElementById("d4");
const d5 = document.getElementById("d5");


d2.addEventListener("focus", function(){
    console.log("입력 준비");
});

d2.addEventListener("blur", function(){
    console.log("blur 발생");
});

//d1 입력하고 나왔을 때 글자의 길이가 3글자 이하라면 d1 강제로 재입력
d1.addEventListener("blur", function(){
    let v = d1.value
    console.log("과연~~");
    if(d1.length=4){
        d1.addEventListener("focus")
    }
});

//------------------------
d3.addEventListener("change", function(){
    console.log("d3 체인지")
});

d5.addEventListener("change", function(){
    console.log("select 체인지")
});
//------------------------

d4.addEventListener("keyup", function(){
    console.log("키보드에서 눌렀다가 *뗐을 때* 발생")
});