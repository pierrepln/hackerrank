=begin
made for HackerRank Ruby: Ruby Hash - Initialization
Fri 4th March 2016

Made with <3 by Pierre Plantié
=end

hackerrank.store(543121, 100)
hackerrank.keep_if {|k ,v| k.is_a?(Integer) == true}
hackerrank.delete_if{|k, v| k % 2 == 0}
