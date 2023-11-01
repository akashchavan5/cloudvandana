function solve(val) {
  let v = document.getElementById("display");
  v.value += val;
}

function result() {
  let ans = document.getElementById("display").value;
  let result = eval(ans);
  document.getElementById("display").value = result;
}

function inpClear() {
  let inp = document.getElementById("display");
  inp.value = "";
}
