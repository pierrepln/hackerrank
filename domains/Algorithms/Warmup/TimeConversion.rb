=begin
made for HackerRank Algorithms: Warmup - Time Conversion
Sat 9th April 2016

Made with <3 by Pierre Plantié
=end

#!/bin/ruby
require 'time'

time = gets.strip
puts Time.parse(time).strftime("%H:%M:%S")