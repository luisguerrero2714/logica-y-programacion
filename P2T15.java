//AUTHOR: LUIS DAVID GUERRERO CAMACHO
//DATE:13-10-2020
//DESCRIPTION:this programe makes conversions

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_menu();
        int option = f_option_convert();
        if(option==1){f_convert_c_f();

        }else if(option==2){
           f_convert_f_c();

        }else if(option==3){
           f_convert_k_c();

        }else{
            f_convert_c_k();

            
            }

        }

        public static void f_menu(){
            System.out.println("convertgradesSOFT, made by luis david guerrero camacho");
            

            }
        public static int f_option_convert(){
        //description: this program return the option convert 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the option:");    
        System.out.println("1- °C to °F");    
        System.out.println("2- °F to °C");    
        System.out.println("3- °K to °C");    
        System.out.println("4- °C to °K");    
        int option = keyboard.nextInt();
        while(option<1 || option>4){
        System.out.println("Erroooor, you option address do not exist, input again");    
        System.out.println("1- °C to °F");    
        System.out.println("2- °F to °C");    
        System.out.println("3- °K to °C");    
        System.out.println("4- °C to °K"); 
        option = keyboard.nextInt(); 
        }
        return option;
        }
        public static void f_convert_c_f(){
            //description: this programe realice convert from °C to °F
            Scanner keyboard1= new Scanner(System.in);
            System.out.println("convert from °C to °F ");
            System.out.println("input the value of °C:");
            double value = keyboard1.nextDouble();
            double convert= (value*1.8)+32;
            System.out.println(value + "°C is:"+convert+"°F");
        }
    
        public static void f_convert_f_c(){
            //description: this programe realice convert from °f to °c
            Scanner keyboard1= new Scanner(System.in);
            System.out.println("convert from °f to °c ");
            System.out.println("input the value of °c:");
            double value = keyboard1.nextDouble();
            double convert= (value-32)/1.8;
            System.out.println(value + "°f is:"+convert+"°c");
        }
        public static void f_convert_k_c(){
            //description: this programe realice convert from °c to °k
            Scanner keyboard1= new Scanner(System.in);
            System.out.println("convert from °k to °c ");
            System.out.println("input the value of °c:");
            double value = keyboard1.nextDouble();
            double convert= (value-273.15);
            System.out.println(value + "°k is:"+convert+"°c");
        }
        public static void f_convert_c_k(){
            //description: this programe realice convert from °c to °k
            Scanner keyboard1= new Scanner(System.in);
            System.out.println("convert from °c to °k ");
            System.out.println("input the value of °k:");
            double value = keyboard1.nextDouble();
            double convert= (value+272.15);
            System.out.println(value + "°f is:"+convert+"°c");
        }
 


}
