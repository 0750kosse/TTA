//Defining operations to perform
let sum = (firstValue, secondValue) =>  firstValue + secondValue;
let substraction = (firstValue, secondValue) =>  firstValue - secondValue;
let multiplication = (firstValue, secondValue) =>  firstValue * secondValue;
let division = (firstValue, secondValue) =>  firstValue / secondValue;
let powerTo = (firstValue, secondValue) =>  Math.pow(firstValue, secondValue);
 
//parseFloat to coerce string to number
function calc(firstValue, secondValue, operation){
  firstValue = parseFloat(prompt('Give me a number'));
  secondValue = parseFloat(prompt('Give me a second number'));
  operation = prompt('what operation you would like to do?');
  keepCalculating = prompt('Would you like to do another calculation?');
    
    switch (operation) {
      case '+':
        console.log(`${firstValue} + ${secondValue} = ${sum(firstValue, secondValue)}`) 
        break;
        
      case '-':
        console.log(`${firstValue} - ${secondValue} = ${substraction(firstValue, secondValue)}`)
        break;
        
      case '*':
        console.log(`${firstValue} * ${secondValue} = ${multiplication(firstValue, secondValue)}`)
        break;
        
        case '/':
        console.log(`${firstValue} / ${secondValue} = ${division(firstValue, secondValue)}`)
        break;
        
        case '^':
        console.log(`${firstValue} ^ ${secondValue} = ${powerTo(firstValue, secondValue)}`)
        break;
        
      default: 
        console.log('Operator not recognized');
        break;
        }
  }
  
calc();

//loop that will keep going until only user responds "No" to the prompt
while(keepCalculating !== "No") calc();