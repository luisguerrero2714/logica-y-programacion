import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("P2T5,SUBSTRACT BETWEEN TWO NUMBERS,MAKE BY LUIS DAVID GUERRERO CAMACHO");
        System.out.println("----------------------------------------------------------------------");
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Inpunt the firt number:");
        int num1 = keyboard.nextInt();

        System.out.println("Inpunt the second number:");
        int num2 = keyboard.nextInt();

        int resu= num1 - num2;

        System.out.println("the substract is" +resu);

    }
}
