=begin
made for HackerRank Algorithms: Implementation - Find Digits
Thu 14th April 2016

Made with <3 by Pierre Plantié
=end

#!/bin/ruby

t = gets.strip.to_i
for a0 in (0..t-1)
    n = gets.strip.to_i
    count = n.to_s.chars.count do |i|
        i = Integer(i)
        !i.zero? && (n % i).zero?
    end
    puts count
end