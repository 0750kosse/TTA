// global consts
const hamburger = document.querySelector(".hamburger");
const navMenu = document.querySelector(".nav-menu");
const body = document.body;
const menuLinks = document.querySelectorAll('.nav-link');
const themeChanger = document.querySelector(".theme-toggle");

//adding event listeners 
hamburger.addEventListener("click", toggleIconMenu);
themeChanger.addEventListener('click', toggleTheme)

//toggles burguer & navMenu class to active/inactive onclick
function toggleIconMenu() {
    hamburger.classList.toggle("active");
    navMenu.classList.toggle("active");
}
//toggles between light & dark themes
function toggleTheme() {
  body.classList.toggle('dark-theme');
  menuLinks.forEach(link => link.classList.toggle('dark-theme'))
}

function submitForm(){
  event.preventDefault();
// grabbing the user input from html form
let heading = document.getElementById('title').value;
let blogBody = document.getElementById('body').value;
let author = document.getElementById('author').value;

// parent node from where html tags will be appended
let parentNode = document.querySelector('#blog-article')

// creating tags to reflect initial html blog structure
let art = document.createElement('article');
let title = document.createElement("h1");
let authorTag = document.createElement('h3');
let pTag = document.createElement('p');
let btn = document.createElement('button');

//setting attribute class/es 'blog-article_title'
art.setAttribute('class','blog-article');
title.setAttribute('class', 'blog-article_title')
authorTag.setAttribute('class', 'blog-article_author');
pTag.setAttribute('class', 'blog-article_body');
btn.setAttribute('onclick','this.parentElement.remove()' )
 
// inserting html tags into DOM
parentNode.insertAdjacentElement('afterend', art);
parentNode.insertAdjacentElement('afterend', title);
parentNode.insertAdjacentElement('afterend', authorTag);
parentNode.insertAdjacentElement('afterend', pTag);
  
// adding the user input as textcontent
title.textContent = heading;
authorTag.textContent = author;
pTag.textContent = blogBody;
// appending user's newly created content & html
btn.appendChild(document.createTextNode('Delete entry'));
art.appendChild(title)
art.appendChild(authorTag)
art.appendChild(pTag)
art.append(btn)

// calls resetFields function
  resetFields()
}

// resets new blog entry input fields
function resetFields(){
  document.getElementById('title').value = "";
  document.getElementById('author').value = "";
  document.getElementById('body').value = "";
}

function submitEmail(){
  event.preventDefault();
  // grabs and encodes the user subject and email body inputs
  let emailSubject = encodeURI(document.getElementById('subject').value);
  let emailBody = encodeURI(document.getElementById('emailBody').value);
  // opens mail client
  window.location = `mailto:blogscripting@blogscripting.com?subject=${emailSubject}&body=${emailBody}`
  // redirects to thank you page after 2 seconds
  setTimeout( () => {window.location.href = 'thankyou.html'},2000)
  // calls resets fields function
  resetContactFields()
}

// resets contact us form input fields
function resetContactFields(){
  document.getElementById('subject').value = " ";
  document.getElementById('emailBody').value = " ";
}





