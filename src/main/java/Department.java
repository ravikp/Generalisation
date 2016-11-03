/**
 * Created by ravikupin on 2/11/16.
 */
public class Department {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int count;

    public Department() {
        this.head = null;
        this.tail = null;
    }

    public void addEmployee(Employee employee) {
        EmployeeNode newEmployeeNode = new EmployeeNode();
        newEmployeeNode.employee = employee;
        count++;
        if (head == null) {
            head = tail = newEmployeeNode;
            return;
        }
        tail.next = newEmployeeNode;
    }

    public void removeEmployee(String employeeName) {
        EmployeeNode current = head;
        EmployeeNode prev = null;

        while(current.employee.getName() != employeeName){
            prev = current;
            current = current.next;
        }

        count--;

        if(prev == null){
            head = current.next;
            return;
        }
        prev.next = current.next;
    }

    public Employee[] getEmployees() {
        Employee[] employees = new Employee[count];
//        System.out.println("count: " + count);

        EmployeeNode currentNode = head;
        int currentIndex = 0;

        while (currentNode != null){
//            System.out.println("currentIndex: " + currentIndex);
            employees[currentIndex]= currentNode.employee;

            currentIndex++;
            currentNode = currentNode.next;
        }

        return employees;
    }

    public class EmployeeNode {
        public Employee employee;
        public EmployeeNode next;
    }
}
