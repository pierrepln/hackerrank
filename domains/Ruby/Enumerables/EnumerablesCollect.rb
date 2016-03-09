=beginmade for HackerRank Ruby: Ruby Enumerables - Collect
Wed 9th March 2016

Made with <3 by Pierre Plantié
=end

def rot13(secret_messages)
  secret_messages.map { |c| c.tr("a-z", "n-za-m") }
end
