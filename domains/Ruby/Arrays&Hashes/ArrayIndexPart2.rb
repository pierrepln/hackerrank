=begin
made for HackerRank Ruby: Ruby Array - Index, Part 2
Mon 29th February 2016

Made with <3 by Pierre Plantié
=end

def neg_pos(arr, index)
    return arr[-index]
end

def first_element(arr)
    return arr.first
end

def last_element(arr)
    return arr.last
end

def first_n(arr, n)
    return arr.take(n)
end

def drop_n(arr, n)
    return arr.drop(n)
end
