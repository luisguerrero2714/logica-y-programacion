//AUTHOR: LUIS DAVID GUERRERO CAMACHO
//DESCRIPTION: this program converts kms into miles and converts colombian pesos into dollars
//DATE: 15-10-2020
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       f_menu();
       int user_option = f_option();
       while(user_option!=0){
           if(user_option==1){
               f_calculate_miles_to_km();

           }else if(user_option==2){

            f_calculate_miles_to_km();

           }else if(user_option==3){
            f_calculate_USD_to_pesos();


           }else{
            System.out.println("option 4");

           }
           user_option=f_option();

       }
       System.out.println("thank you, good bye");

    }
    public static void f_menu(){
        //description: show inicial menu of program
        System.out.println("convertSOFT(V2),--- made by Luis David Guerrero camacho");

        
    }
    public static int f_option(){
        //description: ehis method return the option that input the user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the option of convert: 1.--miles to km \\ 2.-- km to miles");
        System.out.println("3.--- Money USD to colombian pesos \\ 4.---Colombian pesos to USD \\ 0.---to exit");
        int option = keyboard.nextInt();
        while(option<0 || option>4 ){
            System.out.println("Errorrrrrrr, this option does not exist. input the option of convert: 1.--miles to km \\ 2.-- km to miles ");
            System.out.println("3.--- Money USD to colombian pesos \\ 4.---Colombian pesos to USD \\ 0.---to exit");
            option = keyboard.nextInt();

    
        }
        return option;
    }
    public static void f_calculate_miles_to_km(){
        //description: this method calculate a convertion of mile to km
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the total miles");
        double miles = keyboard.nextDouble();
        double km = miles*0.621371;
        System.out.println("the"+miles+"miles convert to"+km+"km");

    }
    public static void f_calculate_km_to_miles(){
        //description: this method calculate a convertion of km to miles
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the total km");
        double km = keyboard.nextDouble();
        double miles = km*0.621371;
        System.out.println("the"+km+"km convert to"+miles+"miles");

    }
    public static void f_calculate_USD_to_pesos(){
        //description: this method calculate a convertion of USD to pesos
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the total USD");
        double USD = keyboard.nextDouble();
        double pesos = USD*3800;
        System.out.println("the"+USD+"USD convert to"+pesos+"colombian pesos");


    }
    public static void f_calculate_pesos_to_USD(){
        //description: this method calculate a convertion of pesos to USD
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the total USD");
        double pesos = keyboard.nextDouble();
        double USD = pesos/3800;
        System.out.println("the"+pesos+"pesos convert to"+USD+"USD");
        

    }


}
