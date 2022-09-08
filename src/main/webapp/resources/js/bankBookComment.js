
//detail.jsp 에서 댓글작성 버튼을 클릭하면 이벤트

const commentBtn = document.querySelector("#commentBtn");
const writer = document.querySelector("#writer");
const contents = document.querySelector("#contents");
const commentList = document.querySelector("#commentList");
const more = document.querySelector("more");

//page 번호 담는 변수
let page=1;
//bookNum 담을 변수
const bookNum = commentBtn.getAttribute("data-book-num");

getCommentList(page, bookNum);

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
    xhttp.send("bookNum = "+bookNum+ "&writer = "+wv+ "&contents = "+cv);

    // 5. 응답 처리
    xhttp.onreadystatechange=function(){
        if(this.readyState == 4 && this.status==200){
            let result = xhttp.responseText.trim;
            console.log(result);
            result = JSON.result;
            console.log(result.result);
            writer.value="";
            contents.value="";

                if(result.result == 1){                    
                    console.log(result)
                    alert("댓글이 등록되었습니다.");

                    for(let i=0; i<commentList.children.length; i++){
                        commentList.children[0].remove();
                    }

                    // if(commentList.children.length != 0){
                    //     commentList.children[0].remove();
                    // }
                    page=1;
                    getCommentList(page, bookNum);
                }else{
                    //
                }
        }
    }
}); //click Event 끝


function getCommentList(p, bn){
    console.log("Get CommentLsit");
    // 1. XMLHTTPRequest
    const xttp = new XMLHttpRequest();

    // 2. Method, URL
    xttp.open("GET", "./commentList?page="+p +"&bookNum="+bn);

    //3. 요청전송
    xttp.send();

    //5.응답 처리
    xttp.addEventListener("readystatechange", function(){
        if(xttp.readyState ==4 && xttp.status ==200){
            console.log(xttp.responseText)
            // 1. jsp 사용한 결과물
            //commentList.innerHTML = xhttp.responseText.trim();'

            // 2. JSON 결과물
            let result = JSON.parse(xhttp.responseText.trim());
            

            //TABLE 만들기
            // let result = document.createElement("table");
            // let resultArr = document.createAttribute("class");

            // resultArr.value = " table table-dark table-hover";
            // result.setAttributeNode(resultAttr);  //<table class="table table-dark table-hover"></table>
            // resultAttr.value="table-dark table-hover";
            // result.setAttributeNode(resultAttr);  //<table class="table table-dark table-hover"></table>
            // resultAttr.value="table-hover";
            // result.setAttributeNode(resultAttr);  //<table class="table table-dark table-hover"></table>

            for(let i=0; i<ar.length; i++){
                let tr = document.createAttribute("tr");

                let td = document.createElement("td");
                let teText = document.createTextNode(ar[i].contents);
                td.appendChild(tdText);           
                tr.appendChild(td);

                td = document.createElement("td");
                tdText = document.createTextNode(ar[i].writer);
                td.appendChild(tdText);
                tr.appendChild(td);

                td = document.createElement("td");
                tdText = document.createTextNode(ar[i].regDate);
                td.appendChild(tdText);
                tr.appendChild(td);

                td = document.createElement("td");
                tdText = document.createTextNode("수정");
                let tdAttr = document.createAttribute("class");
                tdAttr.value = "update";
                td.setAttributeNode(tdAttr);
                td.appendChild(tdText);
                tr.appendChild(td);

                td = document.createElement("td");
                tdText = document.createTextNode("삭제");
                tdAttr = document.createAttribute("class");
                tdAttr.value = "delete";
                td.setAttributeNode(tdAttr);
                tdAttr = document.createAttribute("data-comment-num");
                tdAttr.value = ar[i].num;
                td.setAttributeNode(tdAttr);


                //result.appendChild(tr);
                commentList.append(tr);

                if(page >= PageTransitionEvent.totalPage){
                    more.classList.add("disabled")
                }else{
                    more.classList.remove("disabled");
                }
            }

            console.log(result);
            commentList.children.remove();

            let t = commentList.children;
            if(t.length != 0){
                commentList.children[0].remove();
            }

            // //예외 발생 해결 try catch
            // try {
            //     console.log(commentList.children());
            //     throw new error("에러 메세지");    
            // } catch (exeception) {
            // }finally{
            // }
            commentList.append(result);
            }
        }
    )
};

//---------------------- 더보기 -------------------------------
//처음 페이지에 들어왔을 때 1
more.addEventListener("click", function(){
    console.log("more");
    //더보기 버튼을 누르면 page값에 1 추가
    page++;

    console.log(page);
    console.log(bookNum);

    getCommentList(page, bookNum);

});

//---------------------- DELETE, UPDATE -------------------------------
commentList.addEventListener("click", function(event){
    //----------- UPDATE
    if(event.target.calssName=="update"){
        //let contents = event.target.previousSibling.previousSibling;
        //let v = contents.innerHTML;
        //contents.innerHTML="<textarea>"+v+"</textarea>";

        let writer = event.target.prevoiousSibling.prevoiousSibling.innerHTML;
        let contents = event.target.prevoiousSibling.prevoiousSibling.prevoiousSibling.innerHTML;
        let num = event.target.getAttribute("data-coment-num");

        console.log(contents);
            // 수정할 내용 팝업칸에 불러오기
        document.querySelector("#updateContents").innerHTML = contents;
        document.querySelector("updateWriter").innerHTML = writer;
        document.querySelector("#num").value=num;

                                    //이벤트 강제발생
        document.querySelector("#up").click();
    }


    //------------ DELETE
    if(event.target.calssName="delete"){
        console.log("delete");
        let check = window.confirm("삭제?");
        if(check){
            let num = event.target.getAttribute("data-comment-num");
            console.log("Num : ", num);
        
        // 1. XMLHTTPRequest
        const xhttp = new XMLHttpRequest();
        
        // 2. 요청 정보 (URL, Method)
        xhttp.open("POST", "commentDelete");

        // 3. Header (enctype)
        xhttp.setRequestHeader("Conten-type", "application/x-www-form-urlencoded");

        // 4. 요청 (파라미터와 함께)
        xhttp.send("num"+num);

        // 5. 응답 처리
        xhttp.onreadystatechange=function(){
            if(xhttp.readyState==4 && xhttp.status==200){
                let result = xhttp.responseText.trim();
                if(result==1){
                    alert("삭제되었습니다.");
                    page=1;

                    for(let i=0; i<commentList.children.length;){
                        commentList.children[0].remove();
                    }

                    getCommentList(page, bookNum);
                }else {
                    alert("삭제 실패~~!");
                }
            }
        }
    }    
}
});

//---------------------------- Modal Update button Click ---------------------------------
const update = document.querySelector("#update");

update.addEventListener("click", function(){
    // modal에서 num, contents 가져오기
    let num = document.getElementById("num").value;
    let contents = document.getElementById("updateContents").value;

    //---------- Ajax ---------
    // 1. XHTTPRequest 생성
    const xhttp = new XMLHttpRequest();

    // 2. request 정보
    xhttp.open("POST", "commentUpdate");

    // 3. Header 정보 (Enctype / POST)
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    // 4. 요청 실행
    xhttp.send("num = "+num+ "&Contents = "+contents);

    // 5. 응답 처리
    xhttp.onreadystatechange = function (){
        if(xhttp.readyState==4 && xhttp.status==200){
            let result = xhttp.responseText.trim();

            if(result>0){
                alert("댓글 수정 완료")
                for(let i=0; i<commentList.children.length;){
                    commentList.children[0].remove();
                    let tr = document.createAttribute("tr");
                    let td = document.createElement("td");
                    let teText = document.createTextNode(ar[i].contents);
                    td.appendChild(tdText);           
                    tr.appendChild(td);

                    td = document.createElement("td");
                    tdText = document.createTextNode(ar[i].writer);
                    td.appendChild(tdText);
                    tr.appendChild(td);

                    td = document.createElement("td");
                    //날짜 format 변경
                    // let date = new Date();
                    // console.log(date);

                    // let year = date.getFullYear();
                    // let month = date.getMonth()+1;
                    // let d = date.getDate();
                    // console.log(year+"-"+month+"-"+d);

                    tdText = document.createTextNode(ar[i].regDate);
                    td.appendChild(tdText);
                    tr.appendChild(td);

                    td = document.createElement("td");
                    tdText = document.createTextNode("수정");
                    let tdAttr = document.createAttribute("class");
                    tdAttr.value = "update";
                    td.setAttributeNode(tdAttr);
                    td.appendChild(tdText);
                    tr.appendChild(td);

                    td = document.createElement("td");
                    tdText = document.createTextNode("삭제");
                    tdAttr = document.createAttribute("class");
                    tdAttr.value = "delete";
                    td.setAttributeNode(tdAttr);
                    tdAttr = document.createAttribute("data-comment-num");
                    tdAttr.value = ar[i].num;
                    td.setAttributeNode(tdAttr);

                }   
                page=1;

            }else{
                alert("댓글 수정 실패")
            }
        }
    }

});
