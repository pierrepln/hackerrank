/*
HackerRank Contest : 7 Days of JavaScript
Mon 15th February 2016

Made with <3 by Pierre Plantié
*/

function processData(input) {
    var rows = input.split('\n');
    var cash = rows[0].split(' ').map(Number)[1];
    var toys = rows[1].split(' ').map(Number);
    toys = toys.sort(function(a, b){return a-b});
    var numToys = 0;
    while(cash >= 0) {
        cash -= toys[numToys];
        numToys++;
    }

    console.log(numToys-1);
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});
