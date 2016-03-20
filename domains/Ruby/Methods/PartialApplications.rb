=begin
made for HackerRank Ruby: Partial Applications
Sun 20th March 2016

Made with <3 by Pierre Plantié
=end

combination = -> (n) do
    -> (r) do
        n_fact = (1..n).inject(:*) || 1
        r_fact = (1..r).inject(:*) || 1
        nr_fact = (1..n-r).inject(:*) || 1
        n_fact / (r_fact * nr_fact)
    end
end

n = gets.to_i
r = gets.to_i
nCr = combination.(n)
puts nCr.(r)
