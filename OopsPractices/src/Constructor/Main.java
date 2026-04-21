package Constructor;

public class Main {
    public static void  main(String[] args){

        Employee emp01 = new Employee(100,"Ram", 85000.00);
        emp01.empId = 101;
        emp01.empName = "Mohan";
        emp01.salary = 91000.00;
        emp01.display();


    }

}
