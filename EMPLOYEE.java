class Employee
{
    String name;
    int yearofj;
    String salary;
    String ADRESS;
    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.yearofj);
        System.out.println(this.salary);
        System.out.println(this.ADRESS);
    }
}

public class EMPLOYEE
{
    public static void main(String args[])
    {
        // CREATING OBJECTS
        Employee Employee1 = new Employee();
        Employee1.name = "ROBERT JUNIOR";
        Employee1.yearofj = 1995;
        Employee1.salary = "100K";
        Employee1.ADRESS ="Park Mansion, 57A, Park St, Taltala, Kolkata, West Bengal 700016";

        // CALLING

        Employee1.printInfo();
        


    }
}
