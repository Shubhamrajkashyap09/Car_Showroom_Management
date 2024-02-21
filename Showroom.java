package Car_Showroom_Management;

import java.util.Scanner;

public class Showroom implements utility{
    String Showroom_name;
    String showroom_address;
    String Manage_Name;
    int total_employee;
    int total_car;
@Override
    public void get_detail(){
    System.out.println();
    System.out.println("Showroom Name :"+Showroom_name);
    System.out.println("Showroom Address :"+showroom_address);
    System.out.println("Manager Name :"+Manage_Name);
    System.out.println("Total Number of Employee :"+total_employee);
    System.out.println("Total Number of Cars :"+total_car);
    System.out.println("****************************************");
    }
    @Override
    public void set_detail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================== **** Enter Showroom Detail  **** ==============================================");
        System.out.println();
        System.out.print("Enter Showroom Name :");
        Showroom_name=sc.nextLine();
        System.out.print("Enter Showroom Address :");
        showroom_address=sc.nextLine();
        System.out.print("Enter Manager Name :");
        Manage_Name=sc.nextLine();
        System.out.print("Enter Total Number of Employee :");
        total_employee=sc.nextInt();
        System.out.print("Enter Total Number of Cars :");
        total_car=sc.nextInt();
    }


}
