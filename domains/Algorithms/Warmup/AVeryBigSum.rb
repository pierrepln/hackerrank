=begin
made for HackerRank Algorithms: Warmup - A Very Big Sum
Sat 2nd April 2016

Made with <3 by Pierre Plantié
=end

#!/bin/ruby

#!/bin/ruby

n = gets.strip.to_i
arr = gets.strip
arr = arr.split(' ').map(&:to_i)
puts arr.inject(:+)