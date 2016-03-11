=begin
made for HackerRank Ruby: Ruby Enumerables - any, all, none, find
Fri 11th March 2016

Made with <3 by Pierre Plantié
=end

def func_any(hash)
    # Check and return if any key object within the hash is of the type Integer
    return hash.any? {|k, v| k.is_a? Integer}
end

def func_all(hash)
    # Check and return if all the values within the hash are Integers and are < 10
    return hash.all? {|k, v| (v.is_a? Integer) && (v < 10)}
end

def func_none(hash)
    # Check and return if none of the values within the hash are nil
    return hash.none? {|k, v| v.nil?}
end

def func_find(hash)
    # Check and return the first object that satisfies the property
    # [key, value] pair where the key is an Integer and the value is < 20
    # or [key, value] pair where the key is a String and the value is a String starting
    # with the character `a`
    return hash.find {|k, v| (k.is_a? Integer and v.is_a? Integer and v < 20) or (k.is_a? String and v.is_a? String and v.split(//).first == 'a')}
end
