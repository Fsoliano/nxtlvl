package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jpmc on 9/30/2016.
 */
public class Mycollections{
    public static List<String> myListExercises(){

        List<String> myFriends = new ArrayList<String>();
        myFriends.add("Neil");
        myFriends.add("Bert");
        myFriends.add("Jeremiah");
        myFriends.add("Lee");
        myFriends.add("Jem");
        int y;
            for(y = 0 ; y<=4 ; y++) {
                System.out.println(myFriends.get(y));
            }
        return myFriends;
    }

/*
    public static List<String> myGirlFriends(){
        System.out.println();
        List<String> myGirlFriends = new ArrayList<String>();
        myGirlFriends.add("Vanessa Jumawan");
        myGirlFriends.add("Kylie Jenner");
        myGirlFriends.add("kendall Jenner");
        myGirlFriends.add("Selena Gomez");
        myGirlFriends.add("Liza Soberano");
        int t;
        for( t = 0 ; t<=4 ; t++ ){
            System.out.println(myGirlFriends.get(t));
        }
        return myGirlFriends;
    }
*/
    public static int randIt(int num){
        Random rand = new Random();
        return rand.nextInt(num);
    }

    public static String randomFriends(){
        List<String> randomFriends = new ArrayList<String>();
        randomFriends.add("Bert");
        randomFriends.add("Jem");
        randomFriends.add("Jeremiah");
        randomFriends.add("Lee");
        randomFriends.add("Neil");
        return randomFriends.get(randIt(randomFriends.size()));
    }

    public static String randomGfriends(){
        List<String> randomGfriends = new ArrayList<String>();
        randomGfriends.add("Kendall");
        randomGfriends.add("Kylie");
        randomGfriends.add("Liza");
        randomGfriends.add("Nadine");
        randomGfriends.add("Selena");
        return randomGfriends.get(randIt(randomGfriends.size()));
    }

    public static String relationship(){
        List<String> relationship = new ArrayList<String>();
        relationship.add("is in Love");
        relationship.add("Hates");
        relationship.add("Complicates with");
        relationship.add("was snubbed by");
        relationship.add("was neglected by");
        return relationship.get(randIt(relationship.size()));
    }

    public static void generateRelationship(){
        String string1 = randomFriends();
        String string2 = randomGfriends();
        String string3 = relationship();
        System.out.println(string1+" "+string3+" "+string2);
    }


}
