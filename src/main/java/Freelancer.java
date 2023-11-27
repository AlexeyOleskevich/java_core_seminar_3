public class Freelancer extends Employee{
    private double hourlyRate;
    private Freelancer(String name, double hourlyRate) {
        this.hourlyRate = hourlyRate;
        setName(name);

        setSalary(calculateSalary());
    }

    public static Freelancer createFreelancer(String name, double hourlyRate) {
        if (hourlyRate <= 0) {
            throw new RuntimeException("Hourly rate must be greater than 0");
        }
        return new Freelancer(name, hourlyRate);
    }

    @Override
    protected double calculateSalary() {
        return 20.8 * 8 * hourlyRate;
    }
}
