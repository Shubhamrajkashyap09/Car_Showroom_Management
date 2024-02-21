package Car_Showroom_Management;

import java.util.Scanner;

interface utility{
    public void get_detail();
    public void set_detail();
}
public class Main {
    static void main_menu(){
        System.out.println();
        System.out.println("================================= **** Welcome to Showroom management System ****  =========================================");
        System.out.println();
        System.out.println("=================================  **** Enter Your Choice  ****  ============================================");
        System.out.println();
        System.out.println("1]. Add Showroom \t\t\t 2]. Add Employee \t\t\t 3]. Add Car");
        System.out.println();
        System.out.println("4]. Show Showroom \t\t\t 5]. Show Employee \t\t\t 6]. Show Car");
        System.out.println();
        System.out.println("=================================  **** Enter 0 Exit  ****  ============================================");
        System.out.print("Enter here :");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom[] showrooms = new Showroom[10];
        Car[] cars = new Car[10];
        Employee[] employees = new Employee[10];
        int showroomcntr=0;
        int employeescntr=0;
        int carscnts=0;

        int choise=100;
        while(choise!=0){
            main_menu();
            choise=sc.nextInt();
            while(choise!=9 && choise!=0){
                switch (choise){
                    case 1:
                        showrooms[showroomcntr] =new Showroom();
                        showrooms[showroomcntr].set_detail();
                        showroomcntr++;
                        System.out.println();
                        System.out.println("===============================  **** Enter Your Choice  ****  ===================================");
                        System.out.println("1]. Add Another Showroom");
                        System.out.println("9]. Return to Main Menu");
                        System.out.print("Enter here :");
                        choise= sc.nextInt();
                        break;
                    case 2:
                        employees[employeescntr] =new Employee();
                        employees[employeescntr].set_detail();
                        employeescntr++;
                        System.out.println();
                        System.out.println("===============================  **** Enter Your Choice  ****  ===================================");
                        System.out.println("1]. Add Another Employee");
                        System.out.println("9]. Return to Main Menu");
                        System.out.print("Enter here :");
                        choise= sc.nextInt();
                        break;

                    case 3:
                        cars[carscnts]=new Car();
                        cars[carscnts].set_detail();
                        carscnts++;
                        System.out.println();
                        System.out.println("===============================  **** Enter Your Choice  ****  ===================================");
                        System.out.println("1]. Add Another Car");
                        System.out.println("9]. Return to Main Menu");
                        System.out.print("Enter here :");
                        choise= sc.nextInt();
                        break;

                    case 4:
                        for(int i=0;i<showroomcntr;i++){
                            showrooms[i].get_detail();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        System.out.print("Enter Here :");
                        choise = sc.nextInt();
                        break;

                    case 5:
                        for(int i=0;i<employeescntr;i++){
                            employees[i].get_detail();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        System.out.print("Enter Here");
                        choise = sc.nextInt();
                        break;

                    case 6:
                        for(int i=0;i<carscnts;i++){
                            cars[i].get_detail();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        System.out.print("Enter Here :");
                        choise = sc.nextInt();
                        break;

                    default:
                        System.out.println("Please Enter the Correct Choice");
                        choise=9;
                        break;
                }
            }
        }
    }
}
