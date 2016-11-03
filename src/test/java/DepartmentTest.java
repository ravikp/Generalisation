import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by ravikupin on 2/11/16.
 */

public class DepartmentTest {

    @Test
    public void should_be_empty_upon_removing_the_only_employee_from_department(){
        Department department = new Department();
        String employeeName = "Mary";
        department.addEmployee(new Employee(employeeName));

        department.removeEmployee(employeeName);

        assertArrayEquals(new Employee[0], department.getEmployees());
    }

    @Test
    public void should_have_one_employee_after_removing_one_employee_from_a_two_employee_department(){
        Department department = new Department();
        String employeeName = "Mary";
        department.addEmployee(new Employee(employeeName));
        department.addEmployee(new Employee("Dave"));

        department.removeEmployee(employeeName);

        assertArrayEquals(new Employee[]{new Employee("Dave")}, department.getEmployees());
    }

}
