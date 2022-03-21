document.querySelectorAll('nav a')[0].addEventListener('click', function () {
    document.getElementById('nav1-animation').style.display = 'block'
    document.getElementById('nav2-animation').style.display = 'none'
    document.getElementById('nav3-animation').style.display = 'none'
    document.getElementById('nav4-animation').style.display = 'none'
    document.getElementById('nav5-animation').style.display = 'none'
});

document.querySelectorAll('nav a')[1].addEventListener('click', function () {
    document.getElementById('nav2-animation').style.display = 'block'
    document.getElementById('nav1-animation').style.display = 'none'
    document.getElementById('nav3-animation').style.display = 'none'
    document.getElementById('nav4-animation').style.display = 'none'
    document.getElementById('nav5-animation').style.display = 'none'
});

document.querySelectorAll('nav a')[2].addEventListener('click', function () {
    document.getElementById('nav3-animation').style.display = 'block'
    document.getElementById('nav1-animation').style.display = 'none'
    document.getElementById('nav2-animation').style.display = 'none'
    document.getElementById('nav4-animation').style.display = 'none'
    document.getElementById('nav5-animation').style.display = 'none'

});

document.querySelectorAll('nav a')[3].addEventListener('click', function () {
    document.getElementById('nav4-animation').style.display = 'block'
    document.getElementById('nav1-animation').style.display = 'none'
    document.getElementById('nav2-animation').style.display = 'none'
    document.getElementById('nav3-animation').style.display = 'none'
    document.getElementById('nav5-animation').style.display = 'none'
});

document.querySelectorAll('nav a')[4].addEventListener('click', function () {
    document.getElementById('nav5-animation').style.display = 'block'
    document.getElementById('nav1-animation').style.display = 'none'
    document.getElementById('nav2-animation').style.display = 'none'
    document.getElementById('nav3-animation').style.display = 'none'
    document.getElementById('nav4-animation').style.display = 'none'

});

