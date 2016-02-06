/*
made for HackerRank Java: Java Reflection - Attributes
Sat 6th February 2016

Made with <3 by Pierre Plantié
*/

public class Solution {

        public static void main(String[] args) {
            Class student = Student.class;
            Method[] methods = student.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method method : methods) {
                methodList.add(method.getName());
            }
            Collections.sort(methodList);
            for(String name : methodList) {
                System.out.println(name);
            }
        }
}
