=begin
made for HackerRank Ruby: Ruby Enumerables - each_with_index
Sun 6th March 2016

Made with <3 by Pierre Plantié
=end

def skip_animals(animals, skip)
    output = []
    animals.each_with_index do |item, index|
        if (index > skip - 1)
            output.push("#{index}:#{item}")
        end
    end
    return output
end
