function findMax(numbers) {
  if (!Array.isArray(numbers) || numbers.length === 0) {
    return undefined; // If the input is not an array or an empty array, return undefined.
  }

  let max = numbers[0]; // Assume the first element is the maximum.

  for (let i = 1; i < numbers.length; i++) {
    if (numbers[i] > max) {
      max = numbers[i]; // If a larger number is found, update the max variable.
    }
  }

  return max; // Return the maximum number found in the array.
}