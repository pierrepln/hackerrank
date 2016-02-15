/*
HackerRank Contest : 7 Days of JavaScript
Mon 15th February 2016

Made with <3 by Pierre Plantié
*/

function processData(myArray) {
    var max = Math.max.apply(null, myArray);
    var tmp = 0;
    for (var i = myArray.length - 1; i >= 0; i--) {
        if (myArray[i] > tmp && myArray[i] < max)
            tmp = myArray[i];
    }
    console.log(tmp);
}


// tail starts here
process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input.split('\n')[1].split(' ').map(Number));
});
