/*
HackerRank Contest : 7 Days of JavaScript
Fri 12th February 2016

Made with <3 by Pierre Plantié
*/

function processData(input) {
  console.log(input);
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
