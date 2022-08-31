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

function joinCheck(){
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