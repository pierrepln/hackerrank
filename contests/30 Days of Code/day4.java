/*
HackerRank Contest : 30 Days of code
Sat 30 Januaray 2016

Made with <3 by Pierre Plantié
*/

public class Person {

    int age;
	public Person(int initial_Age) {
        if (initial_Age >= 0){
            this.age = initial_Age;
        }
        else{
            System.out.println("This person is not valid, setting age to 0.");
	    }
    }

	public void amIOld() {
        if(age < 13){
            System.out.println("You are young.");
        }
        else if( age >= 13 && age <18){
            System.out.println("You are a teenager.");
        }
        else{
            System.out.println("You are old.");
        }
	}

	public void yearPasses() {
        this.age++;
    }
