=beginmade for HackerRank Ruby: Ruby Enumerables - reduce
Thu 10th March 2016

Made with <3 by Pierre Plantié
=end

def sum_terms(n)
    (1..n).inject(0) {|seq, n| seq + n ** 2 + 1}
end
