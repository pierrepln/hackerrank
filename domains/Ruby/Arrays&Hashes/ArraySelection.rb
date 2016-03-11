=begin
made for HackerRank Ruby: Ruby Array - Selection
Wed 2nd February 2016

Made with <3 by Pierre Plantié
=end

def select_arr(arr)
    return arr.select! {|a| !(a % 2)}
end

def reject_arr(arr)
    return arr.reject {|a| a % 3}
end

def delete_arr(arr)
    return arr.delete_if {|a| a < 0}
end

def keep_arr(arr)
    return arr.keep_if {|a| a >= 0}
end
