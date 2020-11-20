//AUTHOR: LUIS DAVID GUERRERO CAMACHO
//DESCRIPTION: The program acts like a digital machine
//DATE: 5-11-20

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        f_introduction();
    int v_vector_numbers[]=f_fill_vector_numbers();
    int v_opportunity=1, v_user_number;
    boolean v_win=false;

    do{
        System.out.println("opportunity("+v_opportunity+"/4) input number between 1 and 10");
        v_user_number = keyboard.nextInt();
        for(int i=0; i<10; i++){
            if(v_vector_numbers[i]==v_user_number){
                v_win=true;
            }
        }
        v_opportunity=v_opportunity+1;
    }while(v_opportunity<4 && v_win==false);
    if(v_win==false){
        System.out.println("SORRY, you loss 1000000 dollars");
    }else{
        System.out.println("congratulations, you win 1000000 dollars");
    }

    }
    public static void f_introduction() {
        //DESCRIPTION: show information principal
        System.out.println("--------------------------------------------------------------");
        System.out.println("---------------------winningnumbersSOFT-----------------------");
        System.out.println("-------------------------version 1.0--------------------------");
        System.out.println("---------------made by LUIS DAVID GUERRERO CAMACHO------------");
        System.out.println("--------------------------------------------------------------");
}
public static int f_fill_vector_numbers() {
    int[] v_vector = new int[10];
    for(int i=0; i<10; i++){
        v_vector[i]= (int) (Math.random()*9)+1;
    }
    return v_vector;
    
}



}