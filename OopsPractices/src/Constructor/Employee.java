package Constructor;

public class Employee {

        int empId;
        String empName;
        double salary;

        Employee( int empId, String empName,  double salary){
            this.empId = empId;
            this.empName = empName;
            this.salary = salary;
        }
        void display(){
            System.out.println("Employee ID : "+ empId + "Employee Name : "+ empName + "Salary : "+ salary);

        }


    }


