/*
HackerRank Contest : 7 Days of JavaScript
Mon 15th February 2016

Made with <3 by Pierre Plantié
*/

'use strict'
for (let str of my_array) {
    if (str === str.split("").reverse().join(""))
        console.log(str);
}
