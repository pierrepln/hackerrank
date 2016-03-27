=begin
made for HackerRank Ruby: Strings Iteration
Sun 27th March 2016

Made with <3 by Pierre Plantié
=end

def count_multibyte_char n
  count = 0
  n.each_char{|x| count += 1 if x.bytesize > 1}
  return count
end