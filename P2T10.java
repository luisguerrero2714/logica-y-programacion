

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------------");
        System.out.println("P2T10: VOLUMEN OF A CYLINDER. MAKER BY LUIS DAVID GUERRERO CAMACHO");
        System.out.println("------------------------------------------------------------------");
    
        Scanner keyboard = new Scanner (System.in);

        System.out.println("Input the radius in (cm)");
        double R1 = keyboard.nextDouble();

        System.out.println("Input the heigth in (cm");
        double H1 = keyboard.nextDouble();

        if(R1<=0) ││ H1<=0){
            System.err.printn("ERROR: tis radius or heigh can't less than or equal to zero");
        }else{
            double VOL = 3.1415992*(R1*R1)*H1;
            System.out.println("Volumen is "+VOL+" cm3");    
        }



    
    }
}
