package Car_Showroom_Management;

import java.util.Scanner;

public class Car extends Showroom implements utility{
    String Car_Name;
    String Car_Color;
    String Car_Fuel;
    int Car_Price;
    String Car_Type;
    String Car_Transmission;
    public void get_detail(){
        System.out.println();
        System.out.println("Car Name :"+Car_Name);
        System.out.println("Car Color :"+Car_Color);
        System.out.println("Car Fuel Type :"+Car_Fuel);
        System.out.println("Car Price :"+Car_Price);
        System.out.println("Car Type :"+Car_Type);
        System.out.println("Car Transmission(Manual(M)/Automatic(A)) :"+Car_Transmission);
        System.out.println("******************************************************************");
    }
    public void set_detail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================== **** Enter Car Detail  **** ==============================================");
        System.out.println();
        System.out.print("Enter Car Name :");
        Car_Name=sc.nextLine();
        System.out.print("Enter Car Color :");
        Car_Color=sc.nextLine();
        System.out.print("Enter Car Fuel Type :");
        Car_Fuel=sc.nextLine();
        System.out.print("Enter Car Price :");
        Car_Price=sc.nextInt();
        System.out.print("Enter Car Type :");
        Car_Type=sc.nextLine();
        System.out.print("Enter Car Transmission(Manual(M)/Automatic(A) :");
        Car_Transmission=sc.nextLine();

    }
}
