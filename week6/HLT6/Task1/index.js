let temperature ;
let condition;
let goToWork;


temperature = prompt('Whats the temperature?');
condition = prompt('How does it look like?');

switch (true) {
   
   case (temperature <10 || temperature >=30 ): goToWork = false;
    break;
    
   case (temperature >=10 && condition == "sunny" || condition == "cloudy"): goToWork = true
    break;
    
   case (temperature >=10 && temperature < 20 && condition == "raining" || condition == "snowing" || condition == "thunder"): goToWork = false;
    break;
    
   case (temperature >20 && temperature < 30 && condition == "sunny" || condition == "cloudy" || condition == "raining"): goToWork = true;
    break;
    
  case (temperature >20 && condition == "snowing" || condition == "thunder"): goToWork = false;
    break;
    
   default:
    console.log('something did not work as expected...')
    break;
}

console.log(`temp is ${temperature}, condition is ${condition} so gotowork is ${goToWork}`);



 


