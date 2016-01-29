/*
HackerRank Contest : 30 Days of code
Sat 30 Januaray 2016

Made with <3 by Pierre Plantié
*/

class Palindrome {

    Palindrome(){}

    public Queue<Character> q = new LinkedList<Character>();
    public Stack<Character> s = new Stack<Character>();

    void pushCharacter(char ch){// Pushes a character onto a stack.
        s.push(ch);
    }

    void enqueueCharacter(char ch){// Enqueues a character in a queue.
        q.add(ch);
    }

    char popCharacter(){// Pops and returns the top character.
        return s.pop();
    }

    char dequeueCharacter(){// Dequeues and returns the first character.
        return q.remove();
    }
}
