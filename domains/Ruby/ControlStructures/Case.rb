=begin
made for HackerRank Ruby: Ruby Control Structures - Case (Bonus Question)
Sat 27th February 2016

Made with <3 by Pierre Plantié
=end

def identify_class(obj)
    case obj
    when Hacker, Submission, TestCase, Contest
        puts "It's a #{obj.class}!"
    else
        puts"It's an unknown model"
    end
end
