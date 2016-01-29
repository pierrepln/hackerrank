/*
HackerRank Contest : 30 Days of code
Sat 30 Januaray 2016

Made with <3 by Pierre Plantié
*/

static void levelOrder(Node root) {
    Queue<Node> currentLevel = new LinkedList<Node>();
    Queue<Node> nextLevel = new LinkedList<Node>();

    currentLevel.add(root);
    while (!currentLevel.isEmpty()) {
        Iterator<Node> iter = currentLevel.iterator();
        while (iter.hasNext()) {
            Node currentNode = iter.next();
            if (currentNode.left != null)
                nextLevel.add(currentNode.left);
            if (currentNode.right != null)
                nextLevel.add(currentNode.right);
            System.out.print(currentNode.data + " ");
        }
        currentLevel = nextLevel;
        nextLevel = new LinkedList<Node>();
    }
    System.out.println();
}
