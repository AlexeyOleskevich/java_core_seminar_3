public abstract class Employee {
    private String name;
    private double salary;
    protected abstract double calculateSalary();

    public double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name.isEmpty()? "Incognito" : name;
    }

    @Override
    public String toString() {
        return  name + ": " + salary;
    }
}
