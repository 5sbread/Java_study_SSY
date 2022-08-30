
const ch = document.getElementsByClassName("ch");
const cb = document.getElementsByClassName("cb");


//radio에서 선택한 value를 팝업 띄우기
for(let i=0; i<ch.length; i++){
    ch[i].addEventListener("click", function(){
        alert(ch[i].value);
    });
}


if(cb.id == all){
    
}