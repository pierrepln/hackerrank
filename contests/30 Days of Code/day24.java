/*
HackerRank Contest : 30 Days of code
Sat 30 Januaray 2016

Made with <3 by Pierre Plantié
*/

static Node removeDuplicates(Node head) {
  //Write your code here
  Node current = head;

  try {
    while (current.next != null) {
        while (current.data != current.next.data) {
            current = current.next;
        }
        current.next = current.next.next;
    }
  }
  catch (NullPointerException e) {}
  return head;
}
