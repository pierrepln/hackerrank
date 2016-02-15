/*
HackerRank Contest : 7 Days of JavaScript
Mon 15th February 2016

Made with <3 by Pierre Plantié
*/

function fill(arr, i, j, m, n) {
    if (i < 0 || i >= m || j < 0 || j >= n)
        return 0;
    else if (arr[i][j] == 1) {
    	// zero the element for a "visited"-like indicator,
        // so every connected component is recursed through
        // only once
        arr[i][j] = 0;
        // return 1 as the component size, adding the recursive
        // returns for all its possible neighbours
        return 1+fill(arr, i-1, j-1, m, n)
                +fill(arr, i-1, j, m, n)
                +fill(arr, i-1, j+1, m, n)
                +fill(arr, i, j-1, m, n)
                +fill(arr, i, j+1, m, n)
                +fill(arr, i+1, j-1, m, n)
                +fill(arr, i+1, j, m, n)
                +fill(arr, i+1, j+1, m, n);
    }
    return 0;
}

function processData(input) {
    var arr = input.split(/\r?\n/);
    var m = arr[0], n = arr[1], chck = 0, rslt = 0;
    arr = arr.slice(2).map(e => e.split(' ').map(Number));
    for (var i = 0; i < m; i++) {
        for (var j = 0; j < n; j++) {
            chck = fill(arr, i, j, m, n);
            rslt = (chck > rslt) ? chck : rslt;
        }
    }
    console.log(rslt);
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
