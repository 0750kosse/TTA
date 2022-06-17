const hamburger = document.querySelector(".hamburger");
const navMenu = document.querySelector(".nav-menu");

hamburger.addEventListener("click", toggleIconMenu);

//toggles burguer & navMenu class to active/inactive onclick
function toggleIconMenu() {
    hamburger.classList.toggle("active");
    navMenu.classList.toggle("active");
}


  
