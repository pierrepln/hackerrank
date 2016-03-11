=begin
made for HackerRank Ruby: Ruby Enumerables - group_by
Mon 7th March 2016

Made with <3 by Pierre Plantié
=end

def group_by_marks(marks, n)
    marks.group_by { |k,v| v > n ? "Passed" : "Failed" }
end
