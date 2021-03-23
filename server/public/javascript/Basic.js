var reqToInt = new XMLHttpRequest();


const incText = document.getElementById("IncrementText");
const incButton = document.getElementById("IncrementButton");
incButton.onclick = () => {
    fetch("/increment").then((response) => {
        return response.text();
    }).then((responseText) => {
        incText.innnerHtml = responseText; 
    })
};