=begin
made for HackerRank Ruby: Strings Methods 2
Tue 29th March 2016

Made with <3 by Pierre Plantié
=end

def mask_article(text, ele)
    ele.each {|a| text.gsub!(a,strike(a))}
    text
end

def strike s
    "<strike>#{s}</strike>"
end