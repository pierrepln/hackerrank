=begin
made for HackerRank Algorithms: Warmup - Diagonal Difference
Sun 3rd April 2016

Made with <3 by Pierre Plantié
=end

#!/bin/ruby

#!/bin/ruby

n = gets.strip.to_i
arr = gets.strip
arr = arr.split(' ').map(&:to_i)
puts arr.inject(:+)