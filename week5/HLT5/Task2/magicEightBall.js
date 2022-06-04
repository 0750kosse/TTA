// create a userName variable & set to empty string
let userName = "";

//ternary expression & using string interpolation
userName.length < 1 ? console.log(`Hello`) : console.log(`Hello ${userName}`)  

//create a userQuestion to be asked & set to string
let userQuestion = "Any reason why pinneaple pizza was invented?"

//logs userName (if provided) and / or only logs the question
console.log(`${userName}, ${userQuestion}` )

// Outputs an integer between 0 and 7
let randomNumber = Math.floor(Math.random() * 8)

// create a variable named eightBall & set to a empty string
let eightBall = "";

// switch statemnt saves answer to eightBall based on the value of the randomNumber variable.
switch (randomNumber) {
  case 0 : 
    eightBall = 'It is certain';
    break;
  case 1 : 
    eightBall = 'It is decidedly so';
    break;
  case 2 : 
    eightBall = 'Reply hazy try again';
    break;
  case 3 : 
    eightBall = 'Cannot predict now';
    break;
  case 4 : 
    eightBall = 'Do not count on it';
    break;
  case 5 : 
    eightBall = 'My sources say no';
    break;
  case 6 : 
    eightBall = 'Outlook not so good';
    break;
  case 7 : 
    eightBall = 'Signs point to yes';
    break;
}

console.log(eightBall)
