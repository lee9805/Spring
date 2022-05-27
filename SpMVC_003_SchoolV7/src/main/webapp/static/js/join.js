document.addEventListener("DOMContentLoaded", () => {
  const id_check = document.querySelector("button.id-check");
  console.log(id_check);
  const join_btn = document.querySelector("button.join");

  const index = {
    username: 0,
    password: 1,
    re_password: 2,
    name: 3,
    email: 4,
  };
  //form.join 내부에 있는 모든 input box
  //SelectAll 을 사용하면 tag 요소들을 배열로 가져온다
  const inputList = document.querySelectorAll("form.join input");

  // inputList 0번 요소 부터 4번 요소까지
  // form 에 작성된 순서대로 담겨있다
  // index 객체에서 각 요소의 첨자를 가져오고
  // 첨자를 사용하여 input tag를 각 순서대로 변수에 담는다
  const username = inputList[index.username];
  const password = inputList[index.password];
  const re_password = inputList[index.re_password];
  const name = inputList[index.name];
  const email = inputList[index.email];

  const username_msg = document.querySelector("div.username");
  if (id_check) {
    id_check.addEventListener("click", () => {
      if (username.value === "") {
        username_msg.innerText = " * USER NAME 을 입력해주세요";
        username_msg.classList.remove("ok");
        //div.username  항목에 warn이라는 class 를 덪붙여라
        username_msg.classList.add("warn");
        username.focus();
        return false;
      }
      fetch(`${rootPath}/user/idcheck/${username.value}`)
        .then((res) => res.text())
        .then((result) => {
          if (result === "ok") {
            username_msg.classList.remove("warn");
            username_msg.classList.add("ok");
            username_msg.innerText = " * 사용할수 있는 USER NAME입니다";
          } else {
            username_msg.classList.remove("ok");
            username_msg.classList.add("warn");
            username_msg.innerText = " * 이미 가입된 USER NAME입니다";
          }
        });
    });
  }
});
