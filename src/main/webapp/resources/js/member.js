//login 버튼을 누르면 실행되는 것들
// 아무 입력 없이 버튼 누를 시 리턴

const login = document.getElementById("login");
const form = document.getElementById("form");
const userName = document.getElementById("userName");
const password = document.getElementById("password");

login.addEventListener("click", function(){
    let u = userName.value;
    let p = password.value;

    console.log(u == "");
        // 아무것도 입력 안했을 때 =/= null
        // ㄴ 빈 문자열 ""로 작성
        //null은 문자열로 인식
    console.log(u.length);
        //길이가 0이면 비어있음

    if(u==""){
        alert("아이디를 입력해 주세요.");
        return; //메서드 내에서 return시 그 즉시 종료
    }

    if(p==""){
        alert("비밀번호를 입력해 주세요.");
        return;    
    }

    //아이디, 비번 둘 다 입력했을 시 submit
    form.submit();

    // if(u.length>0 && p.length>0){
    //     form.submit();
    // }else{
    //     alert("아이디와 비밀번호를 입력해 주세요.")
    // }   

});