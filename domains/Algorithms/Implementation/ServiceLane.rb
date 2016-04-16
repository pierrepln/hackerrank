=begin
made for HackerRank Algorithms: Implementation - Service Lane
Sat 16th April 2016

Made with <3 by Pierre Plantié
=end

#!/bin/ruby

n,t = gets.strip.split(' ')
width = gets.strip.split(' ').map(&:to_i)
t.to_i.times do
    i,j = gets.strip.split(' ')
    puts width[i.to_i..j.to_i].min
end