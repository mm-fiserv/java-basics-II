public class Employee extends Person{
    private String name;
    private double salary;

    public Employee(String firstName, String lastName, Byte age, Integer ssn, String name, double salary) {
        super(firstName, lastName, age, ssn);
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String Speak(){
        String nameandsalary = name + " " + salary;
        return nameandsalary;
    }
}
