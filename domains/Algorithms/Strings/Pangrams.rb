=begin
made for HackerRank Algorithms: Strings - Pangrams
Wed 30th March 2016

Made with <3 by Pierre Plantié
=end

require 'set'
puts gets.downcase.split('').to_set.size() == 27 ? "pangram" : "not pangram"