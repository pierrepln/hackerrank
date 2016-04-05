=begin
made for HackerRank Algorithms: Warmup - Diagonal Difference
Sun 3rd April 2016

Made with <3 by Pierre Plantié
=end

#!/bin/ruby

n = gets.strip.to_i
a = Array.new(n)
for a_i in (0..n-1)
    a_t = gets.strip
    a[a_i] = a_t.split(' ').map(&:to_i)
end
left_right=0
right_left=0
a.each_with_index do |array, index|
    left_right += array[index]
    right_left += array[-index-1]
end
v = right_left - left_right
puts v.abs