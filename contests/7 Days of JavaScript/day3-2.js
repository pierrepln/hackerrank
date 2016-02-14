/*
HackerRank Contest : 7 Days of JavaScript
Sun 14th February 2016

Made with <3 by Pierre Plantié
*/


function sortLibrary() {
    console.log(library.sort(function(a,b){return a.title > b.title}));
}

var library = [
    {
        author: 'Bill Gates',
        title: 'The Road Ahead',
        libraryID: 1254
    },
    {
        author: 'Steve Jobs',
        title: 'Walter Isaacson',
        libraryID: 4264
    },
    {
        author: 'Suzanne Collins',
        title: 'Mockingjay: The Final Book of The Hunger Games',
        libraryID: 3245
    }
];

sortLibrary();
