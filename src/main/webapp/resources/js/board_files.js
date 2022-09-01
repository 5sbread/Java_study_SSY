{/* <div class="mb-3">
	    <label for="files" class="form-label">파일</label>
	    <input type="file" name="files" class="form-control" id="">
	</div> */}

const addFiles = document.getElementById("addFiles"); //div
const fileAdd = document.getElementById("fileAdd"); //button

fileAdd.addEventListener("click", function(){
    let div = document.createElement("div"); //div
    let c = document.createAttribute("class"); //class=""
    c.value = "mb-3" //class="mb-3"
    div.setAttributeNode(c); //<div clas="mb-3"></div>
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
});
   