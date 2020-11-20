//AUTHOR: LUIS DAVID GUERRERO CAMACHO
//Description: this program calculate the salary of a person
//DATE:15-10-2020


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_menu();
        f_salary();
        option_user= f_continue_yes_no();

    }
    public static void f_menu(){
        //description: show the menu incial
        System.out.println("salarySOFT, verision1.0, made by luis david guerrero camacho");
    }
    public static void f_salary(){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("imput your work hours");
    int hours= keyboard.nextInt();
    double salary =0;
    
    
    while(hours<=0){
        System.out.println("ERROOOOR, you will not win money, since you didn't work, the hours worked should be greater than 0, ");
        System.out.println("input your hours again");
        hours = keyboard.nextInt();
     }
    
     if(hours>80){
         int extra = hours-80;
         salary = (hours*20000)+(extra*24000);
     }else{
         salary = hours*20000;
     }
     System.out.println("you salary is $"+salary);
     }
        public static String f_continue_yes_no(){
            //decription: this method returns yes (Y) / not (N) by continue or not
            Scanner keyboard1 = new Scanner(system.in);
            System.out.println("do you want continue (Y/N)");
            String option = keyboard1.nextLine();
            while (!option.equalsIgnoreCase("Y") && !option.equals("N")){
                System.out.println("Erroooor your option does not exist, do you want continue (Y/N):");
                option = keyboard1.nextLine();
            }
            return option;
        }

    }

