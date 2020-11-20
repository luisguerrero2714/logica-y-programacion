//AUTHOR: LUIS DAVID GUERRERO CAMACHO
//DESCRIPTION: This program calculates a multiple of 5 of the vector number
//DATE: 5-11-20

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    f_introduction();
    int v_total_number = f_total_numbers();
    int v_vector_number[] = f_fill_vector_numbers(v_total_number);
    for (int i=0; i<v_total_number; i++){
        if(v_vector_number[i] %5==0){
            System.out.println(v_vector_number[i]);

        }
    }

    }

    public static void f_introduction() {
        //DESCRIPTION: show information principal
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("------------------------------vectornumbermultipleSOFT----------------------------");
        System.out.println("-------------------------------------version 1.0----------------------------------");
        System.out.println("---------------------------made by LUIS DAVID GUERRERO CAMACHO--------------------");
        System.out.println("----------------------------------------------------------------------------------");
        
    }
    public static int f_total_numbers() {
        Scanner tecladoScanner = new Scanner(System.in);
        System.out.println("input the total numbers do you need?");
        int v_total_number = tecladoScanner.nextInt();
        while(v_total_number<1 || v_total_number>100){
            System.out.println("ERROOOOR, the value should be between 1 to 100, input agaein the total number do you need");
        v_total_number= tecladoScanner.nextInt();

        }
        return v_total_number;
        
    }
    public static int[] f_fill_vector_numbers(int v_total_number) {
    int [] v_vector = new int [v_total_number];

    for (int i=0; i<v_total_number; i++){
        v_vector[i]=(int)(Math.random()*50)+1;
    }
        
    return v_vector;
    }
}