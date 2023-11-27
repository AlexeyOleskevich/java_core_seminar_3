import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employes = new ArrayList<>(Arrays.asList(
                Freelancer.createFreelancer("Alex", 5.0),
                Worker.createWorker("Petr", 444.0),
                Worker.createWorker("Mihail", 1.0),
                Freelancer.createFreelancer("Ivan", 1.0)
        ));

        employes.sort(new EmployeeSalaryComparator());

        Office office = new Office();
        office.addEmployee(Freelancer.createFreelancer("Alex", 5.0)).
                addEmployee(Worker.createWorker("Petr", 444.0)).
                addEmployee(Worker.createWorker("Mihail", 1.0)).
                addEmployee(Freelancer.createFreelancer("Ivan", 1.0));

        office.sort();

        for (Employee employee : office) {
            System.out.println(employee);
        }
    }
}
