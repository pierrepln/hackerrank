/*
HackerRank Contest : 30 Days of code
Sat 30 Januaray 2016

Made with <3 by Pierre Plantié
*/

public static  Node insert(Node head,int data)
{
      Node tmp = new Node(data);
      Node current = head;
      if (current == null){
          return tmp;
      }
      while (current.next != null){
          current = current.next;
      }
      current.next = tmp;
      return head;
  }
