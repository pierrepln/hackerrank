=begin
made for HackerRank Algorithms: Implementation - Sherlock and Squares
Thu 14th April 2016

Made with <3 by Pierre Plantié
=end

t = gets.strip.to_i
t.times do
    x = gets.strip.split.map(&:to_i)
    puts Math.sqrt(x[1]).floor - (Math.sqrt(x[0]).ceil) + 1
end