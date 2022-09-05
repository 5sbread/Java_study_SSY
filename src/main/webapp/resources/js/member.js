//login 버튼을 누르면 실행되는 것들
// 아무 입력 없이 버튼 누를 시 리턴


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
            //idCheck = false;
            inputUserNameResult.innerHTML="  ID는 최소 2글자 이상이어야 합니다.";
        }
    });
    
    
    //비밀번호길이 check            
    inputPassword.addEventListener("change", function(){
        if(inputPassword.value.length>5){
            pwCheck = true;
            inputPasswordResult.innerHTML="";
            inputPasswordCheck.value="";
        }else{
            pwCheck = false;
            inputPasswordResult.innerHTML="  PW는 최소 <strong>6글자 이상</strong>이어야 합니다."
        }
    });

    //비번 확인                         blur / keyup 상황에 맞게 사용
    inputPasswordCheck.addEventListener("blur", function(){
        console.log("pwEqual");
        if(inputPasswordCheck.value == inputPassword.value){
            inputPasswordCheckResult.innerHTML="";
            pwCheck = true;
        }else{
            pwCheck = false;
            inputPasswordCheck.value="";
            inputPasswordCheck.innerHTML="  PW가 일치하지 않습니다."
        }    
    });
}

//=====================================================================
//joinButton Click
joinButton.addEventListener("click", function(){
    if(idCheck && pwCheck & pwEqualCheck){
        console.log("서버에 전송");
        //joinForm.submit();
    }else{
        alert("필수 입력 사항은 모두 입력해야 합니다.");
    }
});    


//=====================================================================
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
        let result = true;

        for(let i=0; i<req.length; i++){
            if(!req[i].checked){
                result = false;
                break;
            }
        }

        if(result){
            form.submit();
        }else{
            alert ("필수 약관에 동의해 주세요.");
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
function idMsg(){
    const userName = document.getElementById("userName");
    const idError = document.getElementById("idError");
    
    userName.addEventListener("blur", function(){
        if(userName.length<2){
            userName.addEventListener("focus");
            userName.innerHTML("아이디는 2글자 미만으로 설정할 수 없습니다.");
        }
    });
};


function pwMsg(){
    const pw = document.getElementById("pw");

    pw.addEventListener("blur", function(){
        if(pw.length<9){
            pw.addEventListener("focus");
            pw.innerHTML("비밀번호는 8글자 이상으로 설정해 주세요.");
        }
    });
};
