=begin
made for HackerRank Algorithms: Warmup - Simple Array Sum
Fri 1st April 2016

Made with <3 by Pierre Plantié
=end

#!/bin/ruby

n = gets.strip.to_i
arr = gets.strip
arr = arr.split(' ').map(&:to_i)
sum = 0
arr.each { |a| sum+=a }
puts sum
