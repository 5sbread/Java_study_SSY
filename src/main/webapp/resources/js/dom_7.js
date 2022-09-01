
const remove1 = document.getElementById("remove1");
const remove2 = document.getElementById("remove2");
const d1 = document.getElementById("d1");
const d2 = document.getElementById("d2");

remove1.addEventListener("click", function(){
    //삭제
    d1.remove();
});

remove2.addEventListener("click", function(){
// 방법 2    
    const ch = document.getElementsByClassName("ch");
    const ar = [];
    for(let i=0; i<ch.length; i++){
        ar.push(ch[i].id); //id 속성값을 배열에 담기
    }

    for(i of ar){
        let d = document.getElementById(i);
        d2.removeChild(d);
    }


// 방법 1
    // for(let i=0; i<5; i++){
    //     const d2_1 = document.getElementById("d2_"+1);
    //     d2.removeChild(d2_1);
    // }
});