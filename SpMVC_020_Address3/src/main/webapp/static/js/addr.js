document.addEventListener("DOMContentLoaded", () => {
  const table_addr = document.querySelector("table.addr");

  table_addr?.addEventListener("click", (e) => {
    const td = e.target;
    if (td.tagName === "TD") {
      const tr = td.closest("TR");
      const seq = tr.dataset.a_seq;
      document.location.href = `${rootPath}/detail?seq=${seq}`;
    }
  });
});
