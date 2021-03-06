document.addEventListener("DOMContentLoaded", () => {
  const memo_table = document.querySelector("table.memo");

  memo_table?.addEventListener("click", (e) => {
    //table 에 click 이벤트를 적용하면
    //가장 안쪽의 td가 target 으로 작동한다
    const target = e.target;
    //가장 안쪽의 td가 클릭되면
    //td를 감싸고 있는 tr 을 찾아라
    const tr = target?.closest("TR");
    const seq = tr?.dataset.seq;

    /*
    JS에서 변수값이
    0, undefined,NaN, "" 등의 if 에서 모두 false 로 인식한다

    seq 값이 정상적인 범위의 값일때만 detail로 보내기
    */
    if (seq) {
      document.location.href = `${rootPath}/memo/${seq}/detail`;
    }
  });
});
