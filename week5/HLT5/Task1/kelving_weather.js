// 2. const creates a variable that will stay constant with value 293
const kelvin = 293;

// 4. substracts 273 from const kelvin
let celsius = kelvin - 273;

// 6. calculates fahrenheit & saves value to fahrenheit
let fahrenheit = celsius * (9 / 5) + 32

// 8. rounds down to nearest integer & saves value to fahrenheit
fahrenheit = Math.floor(fahrenheit)

// 10. using string interpolation
console.log(`The temperature is ${fahrenheit} degrees Fahrenheit.`)

// 11. O kelvin in Fahrenheit is -460. A tad cold...
