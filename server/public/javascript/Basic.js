
const incText = document.getElementById("IncrementText");
const incButton = document.getElementById("IncButton");
incButton.onclick = () => {
    fetch("/increment").then((response) => {
        return response.text();
    }).then((responseText) => {
        console.log(responseText);
        incText.innerHTML = responseText; 
    })
};