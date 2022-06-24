const memo = document.querySelector(".memo");

memo.addEventListener("click", (e) => {
  const target = e.target.closest(".memo_content");
  console.log(target.dataset.id);
  location.href = `${rootPath}/list/detail?id=${target.dataset.id}`;
  //fetch(`${rootPath}/detail?id=${target.dataset.id}`);
});
