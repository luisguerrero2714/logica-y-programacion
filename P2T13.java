//AUTHOR:ANDRES TORRES, LUIS DAVID GUERRERO
//DATE:2020-10-13
//DESSCRIPTION: ENTE PROGRAMA ESTA ECHO PARA COMVERTIT TEMPERATURAS

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---------------------------------------------------------");
        System.out.println("P2T13 MAKER BY ANDRES TORRES, LUIS DAVID GUERRERO CAMACHO");
        System.out.println("---------------------------------------------------------");

        Scanner keyboard = new Scanner(System.in);

        System.out.println("PARA CONVERTIR GRADOS C° A F° ESCIBA N1");
        float N1= keyboard.nextFloat();

        System.out.println("PARA CONVERTIR GRADOS F° A C° ESCIBA N2");
        float N2= keyboard.nextFloat();

        System.out.println("PARA CONVERTIR GRADOS F° A C° ESCIBA N3");
        float N3= keyboard.nextFloat();

        System.out.println("PARA CONVERTIR GRADOS C° A K° ESCIBA N4");
        float N4= keyboard.nextFloat();

        
    }
    public static int f_option_convert(){
        //description: this programm return the option convert
        Scanner keyboard= new Scanner(System.in);

        System.out.println("Input the option:");
        System.out.println("1- ºC to ºF ");
        System.out.println("2- ºF to ºC  ");
        System.out.println("3- ºK to ºC ");
        System.out.println("4- ºC to ºK ");

        int option= keyboard.nextInt();

        while(option<=1 || option>=4){
            System.out.println("ERR: your input the option address DON'T exist, input again:");
            System.out.println("1- ºC to ºF ");
            System.out.println("2- ºF to ºC  ");
            System.out.println("3- ºK to ºC ");
            System.out.println("4- ºC to ºK ");

            option= keyboard.nextInt();
        }

        return option;
        if
    }

}
