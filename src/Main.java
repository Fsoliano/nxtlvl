import exercises.Mycollections;
import objects.Animal;
import objects.Customer;
import objects.Employee;
import objects.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // this is my code

        /**
         * This is for documentation
         *
         *
         * */

        System.out.println("Hello World!");

        /* TODO: add click handling mechanism here*/

        /* TODO: Save this file*/

        // variable is a temporary placeholder of information
        /* TODO
        byte byteVariable = 10;
        short mediumRangeDecimalVariable = 30033;
        int decimalVariableUpTo = 223434;
        long largeDecimalVariableFrom = -23432654376576547L;
        long largeDecimalVariableUpTo = 234234654365483456L;
        float numberWithDecimalPlaces = 9.2f;
        double veryLargeNumberWithDecimalPlaces = 12344645647.1234;
        boolean  isTrueOrFalse = false;
        char singleCharacter = '\u0041';

        String someText = "this is a string Variable";
        */

        //objects
        /*Person person = new Person();
        person.setName("myName"); */


        /* TODO primitive variables
        System.out.println(byteVariable     );
        System.out.println(mediumRangeDecimalVariable);
        System.out.println(decimalVariableUpTo);
        System.out.println(largeDecimalVariableFrom);
        System.out.println(largeDecimalVariableUpTo);
        System.out.println(numberWithDecimalPlaces);
        System.out.println(veryLargeNumberWithDecimalPlaces);
        System.out.println(isTrueOrFalse);
        System.out.println(singleCharacter);
        System.out.println(someText);
        */


        //Encapsulation
        //Person person = new Person("Fidel", "Soliano");
        //String personName = person.introduceYourSelf();
        //System.out.println(personName);

        //String theFirstName = person.getFirstName();
        //System.out.println( theFirstName );


        //person.setFirstName("Fidel");
        //person.setLastName("Soliano");
        //String personName = person.introduceYourSelf();
        //System.out.println(personName);






        //Inheritance , Inherit from person
        Employee employee = new Employee();
        employee.setFirstName("Bill");
        employee.setLastName("Gates");
        String employeeName = employee.introduceYourSelf();
        System.out.println(employeeName);





        //assignment in inheritance given by Sir Rad
        Animal animal = new Animal();
        animal.setAnimalName("Dog");
        animal.setAnimalLegs(4);
        animal.setAnimalCanRun(true);
        String animalId = animal.animalIdentity();
        System.out.println(animalId);


    /* TODO create an animal class with 3 properties and getters and setters, Data types: String , integer and boolean*/


        //Inheritance2, Inherit from person
        Customer customer = new Customer();
        customer.setFirstName("Chevy");
        customer.setLastName("Banico");
        String customerName = customer.introduceYourSelf();
        System.out.println(customerName);

        //overloading
        String customerOrder = customer.introduceYourSelf("Burger and Fries with Coke\n\n");
        System.out.print(customerOrder);

        //if else statement
        int x=5;

        if(x==5){
            System.out.println("X is equal to 5\n");
        }
        else {
            System.out.println("X is not equal to 5\n");
        }





        //while loop
        int n = 1;
        while( n < 7 ){

            System.out.print("["+n+"]\n");
            n++;
        }
         int y = 1;
         int sum = 0;
        while(y<=6){
            sum += y;
            y++;
        }
        System.out.println("Sum is:"+sum);




        //Do while Loop
        int p = 1;
        do{
            System.out.print("["+p+"]");
             p++;


        }while(p<7);

        System.out.print("\n");




        //for loop
        int i;
        for(i=1;i<=6;i++){
            System.out.print("["+i+"]");
        }
        int o;
        int t =0;
        for( o = 1; o<=6 ;o++){
            t += o;
        }
        System.out.print("\nThe Sum is :"+t);
        System.out.print("\n");




        //For loop using an Array
        String[] myInstructors={"Neil","Bert","Amille"};
        for (int l = 0 ; l <= 2 ; l++ ){
            if(myInstructors[l] == "Bert"){
                myInstructors[l] = "Amante";
            }
            System.out.println("My Instructor: "+myInstructors[l]);
        }


        //Mycollections.myListExercises();
        //Mycollections.myGirlFriends();
        Mycollections.generateRelationship();

    }
}
