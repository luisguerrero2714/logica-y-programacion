import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("P2T8_HYPOTENUSE MAKER BY LUIS DAVID GUERRERO CAMACHO ");
        int c1, c2;
        double Hypotenuse;
        Scanner Keyboard = new Scanner (System.in);

        System.out.println("input the first value");
        c1 = Keyboard.nextInt();

        System.out.println("input the second value");
        c2 = Keyboard.nextInt();

        Hypotenuse = Math.sqrt ((c1*c1)+(c2*c2));

        System.out.println("the hypotenuse is"+Hypotenuse);



    }
}
