//AUTHOR: LUIS DAVID GUERRERO CAMACHO
//DESCRIPTION: this programe works as a drinks machine
//DATE: 18-10-2020

import java.util.Scanner;




public class App {
    public static void main (String[] args) throws Exception {
    f_menu();
    int option_user = f_option_beverage();
    while (option_user!=0){
        if(option_user==1){
            f_aromatic();
        }else if(option_user==2){
            f_black_coffee();
        }else if(option_user==3){
            f_coffee_with_milk();
        }else if(option_user==4){
            f_cappuccino();
        }else if(option_user==5){
            f_Mochaccino();
        }

    }


    }
    public static void f_menu(){
        //description: show the menu inicial 
        System.out.println("drinksmachineSOFT-------VERSION 1.0-----made by Luis David Guerrero Camacho");
    }
    public static int f_option_beverage(){
        //description: this method returns an option of beverage
        Scanner keyboard = new Scanner(System.in);
        int option = 0;
        do{
            System.out.println("------ option's drinks-----");
            System.out.println("1. Aromatic,-----unit value: $1300-----");
            System.out.println("2. Black coffe-----unit value: $1000-----");
            System.out.println("3. coffe whith milk-----unit value: $1900-----");
            System.out.println("4. Capuccino-----unit value: $2500-----");
            System.out.println("5. Mochaccino----unit value: $ 2700-----");
            System.out.println("input your option");
            option = keyboard.nextInt();

        }while(option<1 || option>5);
        return option;


    }

        public static int f_money(){
        //description: this method returns the monet entered in the machine
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("input your money:");
        int money = keyboard1.nextInt();
        while(money!=100 && money!=200 && money!=500 && money!=1000 && money!=2000 && money!=5000){
            System.out.println("ERROOOOOR, your money is unknown, input other money:");
            money = keyboard1.nextInt();
        }
         return money;
    }

    public static void f_aromatic(){
        //description: this method process the aromatic beverage 
        int price = 1300;
        int money_user = f_money();
        while(money_user<price){
            System.out.println("do you need input $"+(price-money_user)+"Money");
            money_user = f_money();
        }
        int surplus = money_user-price;
        System.out.println("your surplus money is $"+surplus+"the aromatic has time finish 30 seg");

    }

    public static void f_black_coffee(){
        //decription: this method process the black coffee beverage 
        int price = 1000;
        int money_user = f_money();
        while(money_user<price){
            System.out.println("do you need input $"+(price-money_user)+"Money");
            money_user = f_money();
        }
        int surplus = money_user-price;
        System.out.println("your surplus money is $"+surplus+"the black coffee has time finish 30 seg");
        
    }
    public static void f_coffee_with_milk(){
        //decription: this method process the coffee with milk beverage 
        int price = 1900;
        int money_user = f_money();
        while(money_user<price){
            System.out.println("do you need input $"+(price-money_user)+"Money");
            money_user = f_money();
        }
        int surplus = money_user-price;
        System.out.println("your surplus money is $"+surplus+"the coffee with milk has time finish 45 seg");
        
    }
    public static void f_cappuccino(){
        //decription: this method process the cappuccino beverage 
        int price = 2500;
        int money_user = f_money();
        while(money_user<price){
            System.out.println("do you need input $"+(price-money_user)+"Money");
            money_user = f_money();
        }
        int surplus = money_user-price;
        System.out.println("your surplus money is $"+surplus+"the cappuccino has time finish 60 seg");
        
    }
    public static void f_Mochaccino(){
        //decription: this method process the Mochaccino beverage 
        int price = 2700;
        int money_user = f_money();
        while(money_user<price){
            System.out.println("do you need input $"+(price-money_user)+"Money");
            money_user = f_money();
        }
        int surplus = money_user-price;
        System.out.println("your surplus money is $"+surplus+"the mochaccino has time finish 70 seg");
        
    }

}
