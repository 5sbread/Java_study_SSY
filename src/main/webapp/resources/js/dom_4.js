
//ch, cb는 배열
const ch = document.getElementsByClassName("ch");
const all = document.getElementById("all");
const cb = document.getElementsByClassName("cb");

//radio에서 선택한 value를 팝업 띄우기
for(let i=0; i<ch.length; i++){
    ch[i].addEventListener("click", function(){
        alert(ch[i].value);
    });
}


//전체동의 체크박스 만들기
//1. id=all에 체크 이벤트
all.addEventListener("click", function(){
    console.log(all.checked);
    for(let i=0; i<cb.length; i++){
        //all의 checked 상태를 각 버튼에 적용
        //all - checked 일때 : 전체선택
        cb[i].checked = all.checked;
    }
});

//----------------
for(let i=0; i<cb.length; i++){
               //* 매개변수가 있는 함수의 경우 ★익명함수★ 안에 호출
                                  //check() <- 함수형태로 쓰면 바로 실행  
                                  //check <- 클릭 시 실행
    cb[i].addEventListener("click", check);

}

function check(){
    for(let i=0; i<cb.length; i++){
        console.log(cb[i].checked);
        if(!cb.checked){
            result=false;
        }
    }
    all.checked = result;
}