//PARE DESAROLLAR SOGWARE EN JAVA:
//P1: LINEAS DE COMENTARIOS D AUTHOR, DATE Y DESCIPTION
//AUTHOR: LUIS DAVID GUERRERO CAMACHO
//DATE: 2020-OCT-26
//DESCRIPTION: UN AGORITHM THET CAPTURES THE PRICE OF EACH PRODUCT AND IT UTIL THE ACCOUNT REACHES THE MAXIMUM LIMIT (500,00),
//             IN THE END DETERMINE HOW MANY PRODUCTS YOU BUY AND WHEN IT WAS THE TOTAL VALUE YOU PAID

//P2: IMPRTAR LAS LIBRERIAS REQUERIDAS
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        Scanner keyboard= new Scanner(System.in);
        int v_bill_market=0, v_tmp_producto, v_total_product=0;
        do{
            System.out.println("Please,pass the product through the billing machine");
            v_tmp_producto=keyboard.nextInt();
            v_bill_market=v_bill_market+v_tmp_producto;
            v_total_product+=1;
            System.out.println("Your invoice is: $"+v_bill_market);
        }while(v_bill_market<=500000);
        if (v_bill_market>500000){
            v_bill_market=v_bill_market-v_tmp_producto;
            v_total_product=v_total_product-1;
        }    
        System.out.println("--------------YOUR FINAL INVOICE IS: $"+v_bill_market+" WHIT "+v_total_product+" PRDUCTS----");


    }

    //P3: crear el metodo de f_introduction()   <  nos muestra informacion inicial del soft
    public static void f_introduction(){
        //description: show inicial menu/information of programm
        System.out.println("------------------------------------------------------");
        System.out.println("------------------------------------------------------");
        System.out.println("---------------softmakemarketwirh500.000--------------");
        System.out.println("-------------Version 1.0 2020 oct-26------------------");
        System.out.println("---------make by Luis david guerrero camacho----------");
        System.out.println("------------------------------------------------------");
        System.out.println("------------------------------------------------------");
    }
}