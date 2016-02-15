/*
HackerRank Contest : 7 Days of JavaScript
Mon 15th February 2016

Made with <3 by Pierre Plantié
*/

function processData(input) {
    console.log(Array(15).join(Array(8).join("\u2571\u2572")+'\n'));
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
