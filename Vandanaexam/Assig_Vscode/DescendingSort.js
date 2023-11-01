let arr = [12, 3, 4, 5, 1, 10, 11, 12, 13, 14];
descendingSort(arr);
console.log(arr);

function descendingSort(arr) {
  for (let i = 0; i < arr.length; i++) {
    for (let j = i + 1; j < arr.length; j++) {
      if (arr[j] > arr[i]) {
        let temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
  }
}
