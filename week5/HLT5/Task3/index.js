let raceNumber= Math.floor(Math.random() * 1000);
let earlyReg = true;
let runnerAge = 19;

// if adult and registered early, adds 1000 to racenumber
if (runnerAge > 18 && earlyReg === true) {
  raceNumber +=1000
}
// runner is adult && early registered
if (runnerAge > 18 && earlyReg ) {
  console.log(`Your race starts at 9:30am! Your race number is ${raceNumber}`)
  // runner is adult && NOT early registered
} else if (runnerAge > 18 && !earlyReg) {
  console.log(`Your race starts at 11:00am! Your race number is ${raceNumber}`)
  // runner is under 18
} else if (runnerAge < 18) {
  console.log(`Your race starts at 12:30am! Your race number is ${raceNumber}`)
  // runner is exactly 18
} else if ((runnerAge === 18)) {
  console.log(`go see the reg desk`)
}