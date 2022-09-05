{/* <div class="mb-3">
	    <label for="files" class="form-label">파일</label>
	    <input type="file" name="files" class="form-control" id="">
	</div> */}

const addFiles = document.getElementById("addFiles"); //div
const fileAdd = document.getElementById("fileAdd"); //button

let count = 0;

fileAdd.addEventListener("click", function(){
    //파일 추가 횟수 제한 (5번)
    if(count>5){
        alert("파일은 최대 5개까지 첨부 가능합니다.");
        return;
    }
    
//--------------
    let div = document.createElement("div"); //div
    let c = document.createAttribute("class"); //class=""
    c.value = "mb-3" //class="mb-3"
    div.setAttributeNode(c); //<div clas="mb-3"></div>
    //c = document.createAttribute("");

//------
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

//------
    let input = document.createElement("input"); //<input></input> 
    let inputAttr = document.createAttribute("type"); //type=""
    inputAttr.value = "file";
    input.setAttributeNode(inputAttr);

    inputAttr = document.createAttribute("name");
    inputAttr.value = "files";
    input.setAttributeNode(inputAttr); //name="files"

    inputAttr = document.createAttribute("class");
    inputAttr.value = "form-control";
    input.setAttributeNode(inputAttr); //class="form-control"

    inputAttr = document.createAttribute("id");
    inputAttr.value = "files";
    input.setAttributeNode(inputAttr); //id="files"
    addFiles.append(div);

//------ 삭제 버튼 element 생성
    let button = document.createElement("input");
    let buttonAttr = document.createAttribute("type");
    buttonAttr.value="button";
    button.setAttributeNode(buttonAttr);
    
    let buttonContents = document.createTextNode("삭제");
    button.appendChild(buttonContents);

    buttonAttr = document.createAttribute("class");
    buttonAttr.value="btn btn-danger del";
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
    if(event.target.className=='del'){
        alert("del")
    }
});