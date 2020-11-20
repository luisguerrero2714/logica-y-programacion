//AUTHOR:LUIS DAVID GUERRERO CAMACHO
//DATE:2020-OC-08
//DESCRIPTION:

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------------------------------------------------------");
        System.out.println("P2T11:Student grades : make by luis david guerrero camacho");
        System.out.println("GRADESOFT VERSION 1.0");
        System.out.println("----------------------------------------------------------");
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("input the 1° grade (20%)- this value should be beteween 0 and 5");
        float N1= keyboard.nextFloat();

        System.out.println("input the 2° grade (25%)- this value should be beteween 0 and 5");
        float N2= keyboard.nextFloat();

        System.out.println("input the 3° grade (25%)- this value should be beteween 0 and 5");
        float N3= keyboard.nextFloat();

        System.out.println("input the 4° grade (30%)- this value should be beteween 0 and 5");
        float N4= keyboard.nextFloat();

        if ( N1<0 ││ N1>5 ││N2<0 ││ N2>5 ││ N3<0 ││ N3>5 ││ N4<0 ││>5){

        System.out.println("ERR: The final grade CAN'T calculate because one grade was not between o and 5 ");

        }else{

            double FINALG = (N1*0.2)+(N2*0.25)+(N3*0.25)+(N4*0.3);
            System.out.println(" The final grade is: "+ FINALG);
        
        }    
    }
}
