document.addEventListener("DOMContentLoaded", () => {
  const modal_box = document.querySelector("#modal_box");

  const inputs = document.querySelectorAll("input");
  const desc = document.querySelector("textarea");

  const book_isbn = document.querySelector("input#isbn");
  const book_title = document.querySelector("input#title");

  /*
    input event
    input tag 에 키보드로 문자를 입력할때마다 발생하는 event
    */
  book_isbn?.addEventListener("input", (e) => {
    const isbn = e.target.value;
    if (isbn.length >= 13) {
      alert(isbn);
    }
  });
  book_title?.addEventListener("keypress", (e) => {
    if (e.keyCode === 13) {
      // alert(e.target.value);
      fetch(`${rootPath}/naver/books?title=${e.target.value}`)
        .then((res) => res.text())
        .then((result) => {
          modal_box.style.display = "flex";
          modal_box.innerHTML = result;
        });
    }
  });
});
