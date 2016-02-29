=beginmade for HackerRank Ruby: Ruby Array - Index, Part 1
Mon 29th February 2016

Made with <3 by Pierre Plantié
=end

def element_at(arr, index)
    return arr[index]
end

def inclusive_range(arr, start_pos, end_pos)
    return arr[start_pos..end_pos]
end

def non_inclusive_range(arr, start_pos, end_pos)
    return arr[start_pos...end_pos]
end

def start_and_length(arr, start_pos, length)
    return arr[start_pos, length]
end
