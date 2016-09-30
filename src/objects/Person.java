package objects;

/**
 * Created by jpmc on 9/28/2016.
 */
public abstract class Person {

    private String userName;
    private String email;
    private String firstName;
    private String lastName;

    public String introduceYourSelf(){
        return "Hi I'm "+firstName+" "+lastName+"\n";
    }

    public Person(){

    }
    //constractor
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){

        /* TODO check if string is from a-z*/

        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    //username
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    //lastname
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
