
//detail.jsp 에서 댓글작성 버튼을 클릭하면 이벤트

const commentBtn = document.querySelector("#commentBtn");
const writer = document.querySelector("#writer");
const contents = document.querySelector("#contents");

commentBtn.addEventListener("click", function(){
    //ConSole TEST
    // console.log("comment Button");
    // console.log(writer.value);
    // console.log(contents.value);
    // console.log(commentBtn.getAttribute("data-book-num"));

    let bookNum = commentBtn.getAttribute("data-book-num");
    let wv = writer.value;
    let cv = contents.value;

    //--------- AJAX --------------
    // 1. XMLHTTPRequest 생성
    const xhttp = new XMLHttpRequest();

    // 2. Method, URL 준비
    xhttp.open("POST", "./commentAdd");

    // 3. Enctype - POST일때
    // 요청 header 정보
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    // 4. 요청 발생, 전송 (POST일 경우 파라미터 추가)
    xhttp.send("bookNum = "+bookNum+"&Writer = "+wv+"$Contents = "+cv);

    // 5. 응답 처리
    xhttp.onreadystatechange=function(){
        if(this.readyState == 4 && this.status==200){
            let result = xhttp.responseText.trim;
            console.log(result);
            
            result = JSON.result;

                if(result.result == 1){                    
                    console.log(result)
                    alert("댓글이 등록되었습니다.")
                }else{
                    //
                }
        }
    }
}); //click Event 끝


function getCommentList(){
    console.log("Get CommentLsit");
    // 1. XMLHTTPRequest
    const xttp = new XMLHttpRequest();

    // 2. Method, URL
    xttp.open("GET", "./commentList?page=1&bookNum=0000");

    //3. 요청전송
    xttp.send();

    //응답 처리
    xttp.addEventListener("readystatechange", function(){
        if(xttp.readyState ==4 && xttp.status ==200){
            console.log(xttp.responseText)
            // 1. jsp 사용한 결과물
            //commentList.innerHTML = xhttp.responseText.trim();'

            // 2. JSON 결과물
            let ar = JSON.parse(xhttp.responseText.trim());
            let result = document.createElement("table");
            let resultArr = document.createAttribute("class");

            resultArr.value = " table table-dark table-hover";
            result.setAttributeNode(resultArr);

            for(let i=0; i<ar.length; i++){
                let tr = document.createAttribute("tr");

                let td = document.createElement("td");
                let teText = document.createTextNode(ar[i] //)


            }// 3. head 정보
            // 4. 요청 발생
            //.
        }

    })

}