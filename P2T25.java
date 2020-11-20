//p1: lineas de comentarios de author, date y description
//AUTHOR: luis david guerrero camacho
//DATE: 2020-oct-27
//DESCRIPTION: Records the times of each lap of training and determines the best lap
//             the average and the number of laps per training (the las will be util the athlete gets tired / axahusted)


//p2: importar las librerias requeridas
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        Scanner keyboard = new Scanner(System.in);
        double v_total_lps=0, v_sum_times=0, v_best_lap=0, v_worst_lap=0, v_time_lap;
        do{
            v_time_lap=f_time_lap();
            v_total_lps+=1;
            v_sum_times+= v_time_lap;
            if (v_total_lps==1){
                v_best_lap=v_time_lap;
                v_worst_lap=v_time_lap;
            }else{
                if (v_time_lap<v_best_lap){
                    v_best_lap= v_time_lap;    
                }
                if(v_time_lap>v_worst_lap){
                    v_worst_lap= v_time_lap;
                }           
            } 

        }while(f_option_continue().equals("Y"));
        v_average_time=v_sum_times/v_total_laps;
        System.out.println("----------------RESULTS---------");
        System.out.println("Total laps: "+v_total_lps);
        System.out.println("Sum of time (seg): "+v_sum_times);
        System.out.println("Average time (seg): "+v_average_time);
        System.out.println("The best lap (seg): "+v_best_lap);
        System.out.println("The worst lap (seg): "+v_worst_lap);    
    }
    
    //p3: crear el metodo de f_introduction()    <   nos nuestra informacion inicial del soft
    public static void f_introduction(){
        //description: shoew inicial menu/informacion of program
        System.out.println("-------------------------------------------------");
        System.out.println("--------------------SoftSportTime----------------");
        System.out.println("-----------------version 1.0 2020-oct-26---------");
        System.out.println("----------Make-by uis David Guerrero Camacho-----");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
    }
    public static String f_option_continue(){
        //description: this method return Y (yes) or N (NOT)
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Mr/Mrs athlete, do you want continue? ()Y/N");
        String v_opt= keyboard.nextLine();
        while(!v_opt.equals("Y") || !v_opt.equals("N")){
            System.out.println("ERR: Yoour option cannot be processed, Mr/Mrs Athlete, do you want continue? /(Y/N)");
            v_opt= keyboard.nextLine();
        }
        return v_opt;
       
    }

    public static Double f_time_lap(){
        //description: This method returns a value between 5 seg and 59 seg
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Mr/Mrs Athlete, Input the time lap (seg):");
        double v_time_lap= keyboard.nextDouble();
        while (v_time_lap<5 || v_time_lap>59){
            System.out.println("ERR: your value between 5 seg and 59 seg, Mr/Mrs Athlete, Input again the time lap (seg):");
            v_time_lap= keyboard.nextDouble();
        } 
        return v_time_lap;
    }
      
}
