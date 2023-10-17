const numbers = [5, 2, 0, 9, 1, 3, 6];

numbers.sort(function(a, b) {
  return b - a;
});

console.log(numbers);