=begin
made for HackerRank Algorithms: Implementation - Sherlock and The Beast
Mon 11th April 2016

Made with <3 by Pierre Plantié
=end

#!/bin/ruby

t = gets.strip.to_i
for a0 in (0..t-1)
    n = gets.strip.to_i
    z=n
    while(z % 3 != 0)
        z-=5
    end
    if (z < 0)
        puts '-1'
    else
        puts '5' *z + '3' * (n - z)
    end
end