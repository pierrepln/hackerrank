=begin
made for HackerRank Algorithms: Implementation - Utopian Tree
Tue 12th April 2016

Made with <3 by Pierre Plantié
=end

#!/bin/ruby

t = gets.strip.to_i
for a0 in (0..t-1)
    n = gets.strip.to_i
    puts (1 << (((n+1)/2)+1)) - (1 + (n%2))
end
