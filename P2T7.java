import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------------------------------------------------------");
        System.out.println("P2T7: THE SUPERMARKET, MAKE BY LUIS DAVID GUERRERO CAMACHO");
        System.out.println("----------------------------------------------------------");

        int p1, p2, p3, p4, VALBR;
        double IVA, BILL;

        Scanner Keyboard = new Scanner(System.in);

        System.out.println("Input de FIRTS product");
        p1 = Keyboard.nextInt();

        System.out.println("Input de 2° product:");
        p2 = Keyboard.nextInt();

        System.out.println("Input de 3° product:");
        p3 = Keyboard.nextInt();

        System.out.println("Input de 4° product:");
        p4 = Keyboard.nextInt();

        VALBR = p1+p2+p3+p4;

        IVA =VALBR *0.19;

        BILL = VALBR+IVA;

        System.out.println("-----------------------------------------------");
        System.out.println("The total bill is $"+BILL+" with IVA 19% $"+IVA); 
        System.out.println("-----------------------------------------------");

    }
}
