

const d1 = document.querySelector("#d1");
const d1_2_1_3 = document.querySelector("#d1_2_1_3");
const btn = document.querySelector("btn");

//===================== Parent ======================
console.log(d1_2_1_3.parentNode); //ul#d1_2_1
console.log(d1_2_1_3.parentNode.parentNode); //div#d1_2
console.log(d1_2_1_3.parentNode.parentNode.parentNode); //div#d1
    //d1_2_1_3에게 부모 = ul#d_2_1
    //나머지는 조상

//div#d1 삭제하기
btn.addEventListener("click", function(){
    d1_2_1_3.parentNode.parentNode.remove();
});    

console.log(d1_2_1_3.parentNode.parentNode.parentNode);

//===================== Child ======================
               //직계자손만 선택가능
console.log(d1.childNodes);
//했을 때 콘솔에 뜨는 인덱스 리스트
    //0 : text <- 엔터 공백 | 나중에 지워줘야 함
    //1 : h1#d1_1
    //2 : text
    //3 : div#d1_2
    //4 : text

//공백 제외    
consol.log(d1.children); 

//공백 포함
console.log(d1.childNodes[3].innerHTML);
                //<div id="d1_2"> 의 자식들 출력
                //<ul id="d1_2_1">
                    //<li>1</li>
                    //<li>2</li>
                    //<li>3</li>
                    //<li>4</li>
                    //<li>5</li>
                //</ul>

console.log(d1.childNodes[3].childNodes[1].childNodes[1].innerHTML);
console.log(d1.children[1].children[0].children[0].innerHTML);

d1.addEventListener("click", function(){
    //li 모두 삭제
    console.log("click");
    let li = d1.children[1].children[0].children;
    console.log(li);

                //i=0 고정 | li길이가 0이 될때까지
    for(let i=0; i!= li.length;){
        console.log("l");
        l.remove;
        l--;
    }
});