/*
HackerRank Contest : 7 Days of JavaScript
Mon 15th February 2016

Made with <3 by Pierre Plantié
*/

process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function main() {
    var t = parseInt(readLine());
    for(var a0 = 0; a0 < t; a0++){
        var n = parseInt(readLine());
        var height = 0;
        for(var k = 0; k <= n; k++){
            if(k % 2 == 0){
                height = height + 1;
            } else {
                height = height * 2;
            }
        }
        console.log(height);
    }

}
