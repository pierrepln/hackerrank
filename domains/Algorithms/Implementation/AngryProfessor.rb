=begin
made for HackerRank Algorithms: Implementation - Angry Professor
Sun 10th April 2016

Made with <3 by Pierre Plantié
=end

#!/bin/ruby

t = gets.strip.to_i
for a0 in (0..t-1)
    n,k = gets.strip.split(' ')
    n = n.to_i
    k = k.to_i
    a = gets.strip
    a = a.split(' ').map(&:to_i)
    puts a.count { |i| i < 1 } < k ? "YES" : "NO"
end
