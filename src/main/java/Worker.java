public class Worker extends Employee{
    private double fixedPayment;

    private Worker(String name, double fixedPayment) {
        this.fixedPayment = fixedPayment;
        setName(name);

        setSalary(calculateSalary());
    }

    public static Worker createWorker(String name, double fixedPayment) {
        if (fixedPayment <= 0) {
            throw new RuntimeException("Fixed payment must be greater than 0.");
        }
        return new Worker(name, fixedPayment);
    }

    @Override
    protected double calculateSalary() {
        return fixedPayment;
    }
}
