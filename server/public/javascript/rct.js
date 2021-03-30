
const ce = React.createElement
// const txt = document.getElementById("the-text");

// console.log("the-text".innerHTML);
class ButtonComponent extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            pressed: ""
        };
    }

    render() {
        return ce('button', {onClick: (e) => console.log("pressed")}, "Click Me")
    };
}

// {onClick: (e) => makeDisappear(e)}

// class TextElem extends React.Component {
//     constructor(props) {
//         super(props);
//     }

//     render() {
//         return ce('p', {id: "domtext"}, "Lorem Ipsum")
//     };
// }

// makeDisappear(e) {
//     // txt.hidden = true;
//     console.log("buttonrpressed");
// }

ReactDOM.render(
    //ce(TextElem, null, null),
    ce(ButtonComponent, null, null),
    document.getElementById("reactroot")
);