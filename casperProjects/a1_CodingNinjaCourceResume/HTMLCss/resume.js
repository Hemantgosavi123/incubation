// window.scrollBy(0,500);


// var skillSection = document.getElementById('skills');
// var targetPos=293;
// var currentPos=0;
// var scrollInterval = setInterval(function()
// {
//      if(currentPos >= targetPos)
//     {
//         clearInterval(scrollInterval);
//         return;
//     }
//     currentPos += 50;
//     window.scrollBy(0,50);
  
// }, 50);  




var navMenuAnchorTags = document.querySelectorAll('.nav-menu a');
// console.log(navMenuAnchorTags);
for(var i=0;i<navMenuAnchorTags.length;i++){
    navMenuAnchorTags[i].addEventListener('click',function(event){
        event.preventDefault();
        var targetSectionID=this.textContent.trim().toLowerCase();
        var targetSection =document.getElementById(targetSectionID);
         console.log(targetSectionID);
         

         var intervel = setInterval(function(){

            var targetSectionCoordinates = targetSection.getBoundingClientRect();

            if(targetSectionCoordinates.top <=0){
                clearInterval(intervel);
                return;
            }
            window.scrollBy(0,50);
         },30);
    });
}





//Handel Scroll Event on Window
//Check that skills section  container is visible or not
//ensure that initial width of colored skill level is zero ->initialised /reset to 0 width value
//Start animation on every skills -> increase skill width from 0 to skill level at regular intrvals
//Store skill level -> HTML with the help data attribute


var progressBars = document.querySelector('.skill-progress > div');
var skillsContainer = document.getElementById('skills-container');
window.addEventListener('scroll',checkScroll);
var animationDone = false;


function initialiseBars()
{
    for(let bar of progressBars){
        bar.style.width = 0 + '%';
    }
}

initialiseBars();

function fillBars(){
    for(let bar of progressBars){
        let targetWidth = bar.getAttribute('data-bar-width');
        let currentWidth = 0;
        let interval = setInterval(function(){
            if(currentWidth > targetWidth){
                clearInterval(interval);
                return;
            }
            currentWidth++;
            bar.style.width = currentWidth + '%';
        },5);
    }
}
function checkScroll(){
    //You have to check whether skills  container is visible
    var coordinates = skillsContainer.getBoundingClientRect();
    if(!animationDone && coordinates.top <= window.innerHeight){
        animationDone = true;
        console.log('Skills Section Visible');
        fillBars();
    }else if(coordinates.top > window.innerHeight){
        animationDone = false;
        initialiseBars();
    }
}