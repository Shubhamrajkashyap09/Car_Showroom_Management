package Car_Showroom_Management;

import java.util.*;

public class Employee extends Showroom implements utility{
    String employee_id;
    String Employee_Name;
    int age;
    String Employee_Depart;
    String Employee_Address;
    int Salary;


    public void get_detail(){
        System.out.println();
        System.out.println("Employee Id :"+employee_id);
        System.out.println("Employee Name :"+Employee_Name);
        System.out.println("Employee Age :"+age);
        System.out.println("Employee Department :"+Employee_Depart);
        System.out.println("Employee Address :"+Employee_Address);
        System.out.println("Employee Salary :"+Salary);
    }
    public void set_detail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================== **** Enter Employee Detail  **** ==============================================");
        System.out.println();
        UUID uuid = UUID.randomUUID();
        employee_id = String.valueOf(uuid);
        System.out.print("Enter Employee Name :");
        Employee_Name=sc.nextLine();
        System.out.print("Enter Employee Department :");
        Employee_Depart=sc.nextLine();
        System.out.print("Enter Employee Address :");
        Employee_Address=sc.nextLine();
        System.out.print("Enter Employee Age :");
        age=sc.nextInt();
        System.out.print("Enter Employee Salary :");
        Salary=sc.nextInt();
        System.out.println("************************************************************");

    }
}
