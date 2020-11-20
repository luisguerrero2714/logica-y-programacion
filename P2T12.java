//AUTHOR: Luis david guerrero camacho
//DATE: 2-10-20
//DESCRIPTION: this program calculate the time between 2 cities
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-----------------------------------------------------");
        System.out.println("P2T12: bike time, made by Luis David Guerrero Camacho");
        System.out.println("-----------------------------------------------------");
        System.out.println("ride bike");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the distance between 2 cities(km)");
        double d = keyboard.nextDouble();
    if(d<=0){System.out.println("errooooor, the distance should be greater tha 0");

        }else{
              f_bike_time(d);
        }
    }
       public static void f_bike_time(double distance){
             //DESCRIPTION: this sub-program calculate the time 
             Scanner keyboard1 = new Scanner(System.in);
             System.out.println("input the constant velocity (km/h)2");
             double V = keyboard1.nextDouble();
             if (V<=0){
                 System.out.println("the velocity should be greater than 0");
             }else{
                 double T = distance/V;
                 System.out.println("the time is "+T+"hours");
        }        
    }
}
