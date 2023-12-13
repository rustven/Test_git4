public class Peron {

    public String  firstName;
    public String lastName;

    public Peron(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public  String info(){
        return String.format("%s %s%n", this.firstName, this.lastName);
    }
}

