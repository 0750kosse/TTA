// 1.Create an array called fruitswith the elements:
let fruits = ["Apple", "Orange","Banana","Pear","Peach", "Strawberry", "Cherry", "Acai"];
// 2.Iterate through that array using a for-inloop using let fruit in fruits.
// 3.Within that loop, create 2 variables called vowelsand consonants, and set their value to 0.
for (let fruit in fruits) {
  let vowels = 0;
  let consonants = 0;
// 4.Within the loop, create another loop, but this time use a for loop using i as the iterator.
  for (let i= 0; i < fruits[fruit].length; i++) {
    // 5.This for loop will want to look through every letter of the fruit and determine how many vowels and how many consonants are within that word.
    // a.Do this by looking at the letter with fruits[fruit][i]
    // b.Then comparing the letter to either a case-switch or nested-if
    // c.You could even make a methodthat has the case-switchor nested-ifand returnthe value!
    // d.If the value is ‘A’, ‘E’, ‘I’, ‘O’, ‘U’, ‘a’, ‘e’, ‘i’, ‘o’, or ‘u’, add 1to the vowelvariable.
    // e.If the value is anything else, add 1to the consonants variable.
    switch(fruits[fruit][i]) {
      case "a":case "e":case "i":case "o":case "u":case "A":case "E":case "I":case "O":case "U":
        vowels++;
        break;
      default:
        consonants++;
        break;
       }
  }
  // 6.For each element within the array, print out to console:a.“Apple has 2 vowels and one consonant” etc
  console.log(`${fruits[fruit]} has ${vowels} vowels and ${consonants} consonants`)
}


