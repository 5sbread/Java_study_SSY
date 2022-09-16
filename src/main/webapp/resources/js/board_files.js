
const addFiles = document.getElementById("addFiles"); //div #addFiles
const fileAdd = document.getElementById("fileAdd"); //add button
const fileDelete = document.querySelectorAll(".fileDelete"); //forEach 가능
// const fileDelte = document.getElementsByClassName("fileDelete"); //forEach 불가능

//-------------------------- ↓ Update시 file Delete -------------------------------------------
try{
    fileDelete.forEach(function(f){
        f.addEventListener("click", function(){
            console.log(f + "file Delete");

            let check = window.confirm("삭제시 되돌릴 수 없음");
            if(!check){
                return
            }

            
            let fileNum = f.getAttribute("date-file-num");

            //ajax
            const xhttp = new XMLDocument();
            xhttp.open("POST", "./fileDelete");
            xhttp.setRequestHeader("Conten-type", "application/x-www-form-urlencoded");
            xhttp.send("fileNum = "+fileNum);

            xhttp.onreadystatechange = function(){
                if(xhttp.readyState==4 && xhttp.status==200){
                    let result = xhttp.responseText.trim();
                    if(result==1){
                        console.log(result +"성공")
                        f.parentNode.remove();
                        count--;
                    }else {
                        console.log(result +"실패")
                    }
                }
            }

        });
    });
}catch(e){
    console.log(fi);
}


//-------------------------- ↓ Add시 file Add -------------------------------------------

let count = 0;
let idx = 0;

function setCount(c){
    if(c>=0)
    count=c;
}

//에러 try - catch
try{

fileAdd.addEventListener("click", function(){
    //파일 추가 횟수 제한 (5번)
    if(count>4){
        alert("파일은 최대 5개까지 첨부 가능합니다.");
        return;
    }

    /* <div class="mb-3">
            <label for="files" class="form-label">파일</label>
            <input type="file" name="files" class="form-control" id="">
        </div> */
    
//------ 부모 Element div 생성 ------
    let div = document.createElement("div"); //div
    let c = document.createAttribute("class"); //class=""
    c.value = "mb-3" //class="mb-3"
    div.setAttributeNode(c); //<div clas="mb-3"></div>
    c = document.createAttribute("id");
    c.value="file"+idx;
    div.setAttributeNode(c);

//------ 자식 Element Label 생성 ------
    let label = document.createElement("label"); //<label><label>
    let labelText = document.createTextNode("파일");
    label.appendChild(labelText) //<label>파일</label>
    
    let labelClass = document.createAttribute("class"); //class=""
    labelClass.value = "form-label";
    label.setAttributeNode(labelClass); //<label class="form-label">파일</label>

    labelClass = document.createAttribute("for"); //for=""
    labelClass.value = "files"; //for="files"
    label.setAttributeNode(labelClass); //<label class="form-label" for="files">파일</label>
    addFiles.append(div); 

//------ 자식 Element Input 생성
    let input = document.createElement("input");        //<input>
    let inputAttr = document.createAttribute("type");   //type=""
    inputAttr.value="file";                             //type="file";
    input.setAttributeNode(inputAttr);                  //<input type="file">

    inputAttr = document.createAttribute("name");       //name="";
    inputAttr.value="files";                            //name="files"
    input.setAttributeNode(inputAttr);                  //<input type="file" name="files">

    inputAttr = document.createAttribute("class");      //class="";
    inputAttr.value="form-control";                     //class="form-control"
    input.setAttributeNode(inputAttr);                  //<input type="file" name="files" class="form-control">

    inputAttr = document.createAttribute("id");         //id="";
    inputAttr.value="files";                            //id="files"
    input.setAttributeNode(inputAttr);                  //<input type="file" name="files" class="form-control" id="files">
    div.appendChild(input);


//------ 삭제 버튼 element 생성 ------
    let button = document.createElement("button");
    let buttonContents = document.createTextNode("삭제");
    button.appendChild(buttonContents);
    let buttonAttr = document.createAttribute("type")
    buttonAttr.value="button";
    button.setAttributeNode(buttonAttr);

    buttonAttr = document.createAttribute("class");
    buttonAttr.value="del btn btn-danger";
    button.setAttributeNode(buttonAttr);

    buttonAttr = document.createAttribute("title");
    buttonAttr.value=idx;
    button.setAttributeNode(buttonAttr);

    div.appendChild(button);


    addFiles.append(div);

    count++;
    idx++;
});


addFiles.addEventListener("click", function(event){
    let button = event.target;

    if(button.classList[0]=='del'){
        document.getElementById("file"+button.title).remove();
        count--;
    }
});

//에러 발생 시 catch 로 잡아서 계속 실행
}catch(e){

}