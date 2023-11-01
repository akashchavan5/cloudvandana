let str = "This is a sunny day";
let result = reverseWordsInSentence(str);
console.log(result);

function reverseString(str) {
  let reverse = "";
  for (let i = 0; i < str.length; i++) {
    reverse = str.charAt(i) + reverse;
  }
  return reverse;
}

function reverseWordsInSentence(str) {
  let strArr = str.split(" ");
  let result = "";
  for (let i = 0; i < strArr.length; i++) {
    result += reverseString(strArr[i]) + " ";
  }
  return result;
}
