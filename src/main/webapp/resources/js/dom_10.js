
//두개 동일 효과
//const d2 = document.getElementById("d2");
const d2 = document.querySelector("#d2");
                        //css와 동일한 변수형식 사용 #
const d1 = document.querySelector("#d1");  
const d3 = document.querySelector("#d3");  
const d4 = document.querySelector("#d4");                  

                        //마우스가 들어왔을 때
d2.addEventListener("mouseenter", function(){
    console.log("ENTER");
    console.log(d1.class);
    console.log(d1.getAttribute("class"));
    // d1.className="c2";
    // //마우스가 들어오면 클래스 네임을 c2로 변경
    // //   -> dom_10.html에서 style 지정해둔 것 적용됨
    d1.classList.replace("c3", "c2");
});

d2.addEventListener("mouseleave", function(){
    console.log("LEAVE")
    console.log(d1.className);
    console.log(d1.classList);
});

d3.addEventListener("click", function(){
    console.log("toggle");
    d2.classList.toggle("c2");
    console.log(d2.classList.contains("c2"));
});

d4.addEventListener("click", function(){
    console.log("request");
    console.log(location.origin);
    console.log(location.hostname);;
    console.log(location.pathname);
    location.href="/dom_9.htmla=10?";
});