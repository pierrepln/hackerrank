/*
made for HackerRank Java: Java Comparator
Sat 23 Januaray 2016

Made with <3 by Pierre Plantié
*/

class Checker
{
    public Comparator<Player> desc = null;

    public Checker() {

        this.desc = new Comparator<Player>() {
            //Override Comparator->compare()
            public int compare(Player p1, Player p2) {
                // compare scores
                if (p1.score > p2.score)
                    return -1;
                else if (p1.score < p2.score)
                    return 1;
                else { // compare names
                    if (p1.name.compareTo(p2.name) > 0)
                        return -1;
                    else if ((p1.name.compareTo(p2.name) < 0))
                        return 1;
                    else
                        return 0;
                }
            }
        };

    }
}
