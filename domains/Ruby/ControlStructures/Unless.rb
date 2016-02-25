=begin
made for HackerRank Ruby: Ruby Control Structures - Unless
Thu 25th February 2016

Made with <3 by Pierre Plantié
=end

def scoring(array)
    array.each do |user|
        user.update_score unless user.is_admin?
    end
end
