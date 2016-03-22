=begin
made for HackerRank Ruby: Ruby Methods - Lazy Evaluation
Tue 22th March 2016

Made with <3 by Pierre Plantié
=end

require 'prime'
p Prime.each.lazy.select{|x| x.to_s == x.to_s.reverse}.first(gets.to_i)
