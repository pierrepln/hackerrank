/*
HackerRank Contest : 7 Days of JavaScript
Sun 14th February 2016

Made with <3 by Pierre Plantié
*/

function displayInformation() {
    for (var i = 0; i < library.length; i++) {
        if (library[i].readingStatus == false)
            console.log("You still need to read '" + library[i].title + "' by " + library[i].author + ".");
        else
            console.log("Already read '" + library[i].title + "' by " + library[i].author + ".");
    }
}

// tail starts here
var library = [
    {
        title: 'Bill Gates',
        author: 'The Road Ahead',
        readingStatus: true
    },
    {
        title: 'Steve Jobs',
        author: 'Walter Isaacson',
        readingStatus: true
    },
    {
        title: 'Mockingjay: The Final Book of The Hunger Games',
        author: 'Suzanne Collins',
        readingStatus: false
    }
];

displayInformation();
