/**
 * Created by ravikupin on 2/11/16.
 */
public class Employee {

    private final String name;

    public Employee(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return name.equals(employee.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
