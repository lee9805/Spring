const form = document.querySelector("form");
form.addEventListener("submit", (e) => {
  e.preventDefault();
  const name = document.querySelector("input[name='a_name']");
  const tel = document.querySelector("input[name='a_tel']");
  const address = document.querySelector("input[name='a_address']");

  if (name.value === "") {
    alert("NAME 은 반드시 입력하세요");
    name.focus();
    return false;
  }
  if (tel.value === "") {
    alert("전화번호는 반드시 작성");
    tel.focus();
    return false;
  }
  if (address.value === "") {
    alert("주소는 반드시 작성");
    address.focus();
    return false;
  }
  form.submit();
});
