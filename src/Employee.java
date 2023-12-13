public class Employee extends Peron {

private double salary;

    public Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }
    @Override
    public String info(){
        return String.format("%s (%.2f)",super.info());
    }


}

