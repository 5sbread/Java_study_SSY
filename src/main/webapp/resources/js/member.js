//login 버튼을 누르면 실행되는 것들
// 아무 입력 없이 버튼 누를 시 리턴

function loginCheck(){
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
};

//=======================================================
//회원가입 시 약관 동의

function argeeCheck(){
    const all = document.getElementById("all");
    const cb = document.getElementsByClassName("cb");
    const join = document.getElementById("join");
    const form = document.getElementById("form");
    const req = doc.getElementsByClassName("req");

//-------------- 약관에 동의 했는지    
    join.addEventListener("click", function(){
        if(all.checked){
            form.submit();
        }else{
            alert ("전체 약관에 동의해 주세요.");
        }
    });

//-------------- 약관 동의 버튼    
    all.addEventListener("click", function(){
        for(let i=0; i<cb.length; i++){
            cb[i].checked = all.checked;
        }
    })

    for(let i; i<cb.length; i++){
        cb[i].addEventListener("click", function(){
            let result = true;
            for(let j=0; j<cb.length; j++){
                if(!cb[j].checked){
                    result=false;
                    break;
                }
            }
            all.checked;
        });
    }
};

//---------------------------------------------
function idCheck(){
    const userName = document.getElementById("userName");
    const idError = document.getElementById("idError");
    
    userName.addEventListener("blur", function(){
        let u = userName.value;
        if(userName.length<2){
            userName.addEventListener("focus");
            alert("아이디는 2글자 미만으로 설정할 수 없습니다.")
            //idError.type = 
        }
    });
};


function pwMsg(){
    const pw = document.getElementById("pw");

    pw.addEventListener("")
}

function pwCheck(){

}

//===================== 수업
function joinCheck(){
    //선택자
    const joinForm = document.getElementById("joinForm");
    const joinButton = document.getElementById("joinButton");
    const inputUserName = document.getElementById("inpuUserName");
    const inputUserNameResult = document.getElementById("inputUserNameResult");
    const inputPassword = document.getElementById("inputPassword");
    const inputPasswordResult = document.getElementById("inputPasswordResult");
    const inputPasswordCheck = document.getElementById("inputPasswordCheck");
    const inputPasswordCheckResult = document.getElementById("inputPasswordCheckResult");

    //CHeck 결과
    let idCheck = false;
    let pwCheck = false;
    let pwEqualCheck = false;
    let nameCheck = false;
    let emailCheck = false;
    let phoneCheck = false;

    //idCheck
    inputUserName.addEventListener("blur", function(){
        if(inputUserName.value.length>1){
            inputUserNameResult.innerHTML="";
            idCheck = true;
        }else {
            idCheck = false;
            inputUserNameResult.innerHTML="  ID는 최소 2글자 이상이어야 합니다.";
        }

    //비밀번호                     blur / keyup 상황에 맞게 사용
    inputPassword.addEventListener("keyup", function(){
        if(inputPassword.value.length>5){
            inputPasswordResult.innerHTML="";
            pwCheck = true;
        }else{
            pwCheck = false;
            inputPasswordResult.innerHTML="  PW는 최소 <strong>6글자 이상</strong>이어야 합니다."
        }

    //비번 확인
    inputPasswordCheck.addEventListener("blur", function(){
        if(inputPasswordCheck.value == inputPassword.value){
            inputPasswordCheck.innerHTML="";
            pwCheck = true;
        }else{
            pwCheck = false;
            inputPasswordCheck.innerHTML="  PW가 일치하지 않습니다."
        }

    //
    


    });    

    });    



    });
}