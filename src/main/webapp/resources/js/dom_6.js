
//Button에 click event 등록

const btn = document.getElementById("btn"); //button
const d1 = document.getElementById("d1"); //div
const add = document.getElementById("add"); //add button
const list = document.getElementById("list"); //ul
const add2 = document.getElementById("add2"); //add2 button
const list2 = document.getElementById("list2"); //ol
const add3 = document.getElementById("add3"); //add3 button
const d2 = document.getElementById("d2"); //div2
const add4 = document.getElementById("add4"); //ad4 button
const add5 = document.getElementById("add5"); //add5 button
const d3 = document.getElementById("d3"); //div3

btn.addEventListener("click", function(){
    d1.innerHTML='<img src="/resources/images/5.jpg">'
});

add.addEventListener("click", function(){
    let li = document.createElement("li"); //<li></li>
    let t = document.createTextNode("test");

    li.appendChild(t);
    //리스트 맨 아래에 추가
    list.append(li);
});

add2.addEventListener("click", function(){
    let li = document.createElement("li"); //<li></li>
    let h = document.createElement("h3"); //<h3></h3>
    let t = document.createTextNode("0h");

    h.appendChild(t); //<h3>0h</h3>
    li.appendChild(h); //<li><h3>0h</h3></li>
    //리스트 맨 위에 추가
    list.prepend(li);
});

//add3 클릭하면 div#d2 내에 input Element를 Append
add3.addEventListener("click", function(){
    let input = document.createElement("input");
    let ch = document.createAttribute("type"); //
    ch.value="checkbox";
    d2.appendChild(input);
});

//add4 클릭하면 div#d3에 before
add4.addEventListener("click", function(){
    let h = document.createElement("h3");
    let t= document.createTextNode("before");

    h.appendChild(t);
    d3.before("h");
});

//add5를 클릭하면 div#d3에 after : <h3>after</h3>
add5.addEventListener("click", function(){
    let h = document.createElement("h3");
    let t = document.createTextNode("after");

    h.appendChild(t);
    d3.after(h);
});