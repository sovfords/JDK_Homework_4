import java.util.ArrayList;

public class EmployeeList
{
    private ArrayList<Employee> employs;


    EmployeeList()
    {
        employs = new ArrayList<>();
    }

    public void addEmployee(Employee employee)
    {
        employs.add(employee);
        employee.setTableNumber(employs.size());
    }

    public ArrayList<Employee> findBySeniority(String seniority)
    {
        ArrayList<Employee> emps = new ArrayList<>();
        for(Employee employee:employs)
        {
            if(employee.getSeniority() == seniority)
            {
                emps.add(employee);
            }

        }
        if(emps.size() == 0)
        {
            System.out.println("Работник(и) по данному стажу не найден(ы)");
        }

        return emps;
    }

    public ArrayList<String> findNumberByName(String name)
    {
        ArrayList<String> empsNames = new ArrayList<>();
        for(Employee employee:employs)
        {
            if(employee.getName() == name)
            {
                empsNames.add(employee.getPhoneNumber());
            }

        }

        if(empsNames.size() == 0)
        {
            System.out.println("Работник(и) по данному имени не найден(ы)");
        }

        return empsNames;

    }

    public Employee getEmployee(int number)
    {
        try {
            return employs.get(number - 1);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Работника с таким табельным номером нет");
            return null;
        }

    }
}
