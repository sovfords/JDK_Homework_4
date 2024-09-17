public class Main
{
    public static void main(String[] args)
    {
        EmployeeList employeeList = new EmployeeList();

        Employee employee1 = new Employee("89242342312","Robert","10");
        Employee employee2 = new Employee("83175341243","Maria","12");
        Employee employee3 = new Employee("89243214323","Maria","10");

        employeeList.addEmployee(employee1);
        employeeList.addEmployee(employee2);
        employeeList.addEmployee(employee3);

        System.out.println(employeeList.findBySeniority("10"));
        System.out.println(employeeList.findBySeniority("12"));

        System.out.println();

        System.out.println(employeeList.findNumberByName("Maria"));
        System.out.println(employeeList.findNumberByName("Robert"));

        System.out.println();

        System.out.println(employeeList.getEmployee(2));

    }
}
