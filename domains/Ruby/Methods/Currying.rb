=begin
made for HackerRank Ruby: Currying
Mon 21th March 2016

Made with <3 by Pierre Plantié
=end

power_function = -> (x, z) {
    (x) ** z
}

base = gets.to_i
raise_to_power = power_function.curry.(base)

power = gets.to_i
puts raise_to_power.(power)
