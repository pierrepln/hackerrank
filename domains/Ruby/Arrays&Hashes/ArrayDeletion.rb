=beginmade for HackerRank Ruby: Ruby Array - Deletion
Tue 1st February 2016

Made with <3 by Pierre Plantié
=end

def end_arr_delete(arr)
    return arr.pop
end

def start_arr_delete(arr)
    return arr.shift
end

def delete_at_arr(arr, index)
    return arr.delete_at(index)
end

def delete_all(arr, val)
    return arr.delete(val)
end
