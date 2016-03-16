=begin
made for HackerRank Ruby: Blocks
Wed 16th March 2016

Made with <3 by Pierre Plantié
=end

def factorial(n)
    yield(n)
end

n = gets.to_i
puts factorial(n) {|n| (1..n).inject(:*)}
