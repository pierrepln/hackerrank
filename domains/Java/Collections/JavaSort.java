/*
made for HackerRank Java: Java Sort
Tue 26 Januaray 2016

Made with <3 by Pierre Plantié
*/

import java.util.*;

class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }

   static final Comparator<Student> CGPA_DESC = new Comparator<Student>() {

       public int compare(Student s1, Student s2) {
           if (Double.compare(s1.cgpa, s2.cgpa) > 0)
                return -1;
           else if (Double.compare(s1.cgpa, s2.cgpa) == 0) {
             if (s1.fname.compareTo(s2.fname) == 0)
                 return (s1.id - s2.id);
             else
                 return s1.fname.compareTo(s2.fname);
           }
           else
               return 1;
       }
   };
}

public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());

      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();

         Student st = new Student(id, fname, cgpa);
         studentList.add(st);

         testCases--;
      }

      Collections.sort(studentList, Student.CGPA_DESC);

      for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}
