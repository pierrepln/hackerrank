/*
HackerRank Contest : 30 Days of code
Sat 30 Januaray 2016

Made with <3 by Pierre Plantié
*/

public static int getHeight(Node root) {
  if (root != null) {
      return (1 + Math.max(getHeight(root.left),getHeight(root.right)));
  }
  return 0;
}
