=begin
made for HackerRank Algorithms: Warmup - Plus Minus
Wed 6th April 2016

Made with <3 by Pierre Plantié
=end

#!/bin/ruby

n = gets.strip.to_i
arr = gets.strip
arr = arr.split(' ').map(&:to_i)
hash = Hash[1 => 0, -1 => 0, 0 => 0]
arr.each.with_object(hash) { |i, counts|
  counts[i <=> 0] += 1
}.each do |key, count|
  puts '%.6f' % (count / n.to_f)
end