import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Office implements Iterable<Employee>{
    private List<Employee> employees;
    private int index;

    public Office() {
        this.employees = new ArrayList<>();
        this.index = 0;
    }

    public Office addEmployee(Employee employee) {
        if (employee == null) {
            throw new NullPointerException("Employee cannot be null");
        }
        employees.add(employee);
        return this;
    }

    public void sort() {
        employees.sort(new EmployeeSalaryComparator());
    }

    @Override
    public Iterator<Employee> iterator() {
        return new Iterator<Employee>() {
            @Override
            public boolean hasNext() {
                return index < employees.size();
            }

            @Override
            public Employee next() {
                return employees.get(index++);
            }
        };
    }
}
