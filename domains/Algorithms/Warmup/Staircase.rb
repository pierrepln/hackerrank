=begin
made for HackerRank Algorithms: Warmup - Staircase
Wed 6th April 2016

Made with <3 by Pierre Plantié
=end

#!/bin/ruby

n = gets.strip.to_i
(1..n).each { |i| puts " " *(n - i) + "#" * i }