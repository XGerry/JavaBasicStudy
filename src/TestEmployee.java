public class TestEmployee {
    public static void main(String[] args)
    {
        Employee employee=new Employee("Gerry");
        employee.setAge(18);
        employee.setDesignation("工程师");
        employee.setSalary(100000);
        employee.printEmployee();
    }
}
