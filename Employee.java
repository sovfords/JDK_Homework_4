public class Employee
{
    private Integer tableNumber;
    private String phoneNumber;
    private String name;
    private String seniority;

    Employee(String phoneNumber,String name, String seniority)
    {

        this.phoneNumber = phoneNumber;
        this.name = name;
        this.seniority = seniority;
    }

    public Integer getTableNumber()
    {
        return tableNumber;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public String getName()
    {
        return name;
    }
    public String getSeniority()
    {
        return seniority;
    }

    public void setTableNumber(int tableNumber)
    {
        this.tableNumber =tableNumber;
    }

    @Override
    public String toString()
    {
        return "Уникальный номер: " + tableNumber + "\nИмя: " + name + "\nНомер телефона: " + phoneNumber + "\nСтаж: " + seniority + "\n";
    }
}
