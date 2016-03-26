=begin
made for HackerRank Ruby: Strings Encoding
Fri 25th March 2016

Made with <3 by Pierre Plantié
=end

def transcode(str)
    return str.force_encoding(Encoding::UTF_8)
end
