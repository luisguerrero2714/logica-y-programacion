//P1: LINEAS DE COMENTARIOS DE AUTHOR,DATE Y DESCRIPTION 
//AUTHOR: LUIS DAVID GUERRERO CAMACHO
//DESCRIPTION: Determines the total saved per person in N nonths Yes A person saves X anount of money wach month
//DATE: 22-11-2020

//p2 importar las libererias requeridas
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception  {
        //p6: llamar los moetodos desde el metodo principal (MAIN) en el orden logico.
        f_menu();
        int N_months = f_total_month();
        int sum_total_saved=0;
        double average_toatal_saved=0;
        
        for(int i=1;i<=N_months;i++){
            sum_total_saved+=f_save_money(i);    //it is same to:sum total saved=sum total saved+f save money(i);
        }   
        average_toatal_saved=sum_total_saved/N_months;
        System.out.println("The total saved money is: $"+sum_total_saved+ ", the average is $"+average_total_saved); 
      
    }    
    //p3: crear el metodo de f menu()  <-- nos muestra informacion inicial del sofware 
    public static void f_menu(){
        //description : show inicial menu/information of progrm
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("-----------------------softsaveMoney--------------------");
        System.out.println("-------------------version 1.0 2020-oct-22--------------");
        System.out.println("---------------Make by Luis David Guerrero Camacho------");
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");
    }
   
    //P4: crar metodos de ingreso de datos
    public static int f_total_months(){
        //description: this method returs the total months user saved money
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the total months:");
        int total_months = keyboard.nextInt();
        while(total_months<2 || total_months>12){
            System.out.println("ERR: the input values should be between 2 and 12, Input again the total months:");
            total_months=keyboard.nextInt(); 
        }
        return total_months;
    }   
    
    public static int f_save_money (int i_monnth){
        //description: this method return the saved money in i month
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the saved money ($) by the month "+i_monnth+" :");
        int saved_money= keyboard.nextInt();
        while(saved_money<10000 || saved_money>1000000){
            System.out.println("ERR the input values be beetween $10.000 and $1.000.000,Input again the saved money ($) by the month "+i_monnth+" :");
            saved_money= keyboard.nextInt();
        }
        return saved_money;    
    }

}                

    
