//AUTHOR : LUIS DAVID GUERRERO CAMACHO
//DATE: 2020-OCT-06
//DESCRIPTION: THIS PROGROGRAM SHOW THE AGE OF A PERSON
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------------------------------------------------");
        System.out.println("P2T9.Age of a person,make by luis david guerrero camacho");
        System.out.println("--------------------------------------------------------");
        
        Scanner teclado = new Scanner (System.in);

        System.out.println("Input your year birth");
        int year = teclado.nextInt();

        if(year>2020){
            System.err.println("ERR: this year cant't process, you should input a year less than 2020");
        }else{

            int age = 2020-year;

            if(age>18){
                
                System.out.println(" she/he is a adult");
            
            }else{
                
                System.out.println("   she/he is a Kid/girl   ");
            }    
        }
    }
}