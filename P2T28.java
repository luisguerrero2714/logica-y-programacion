//AUTHOR: LUIS DAVID GUERRERO CAMACHO
//DESCRIPTION: A Java program that allows storing the salaries of employees grouped by shift.
//DATE: 29-10-20

public class App {
    public static void main(String[] args) throws Exception {
          f_introduction();
          int[] v_salary_day = f_turn_day();
          int[] v_salary_nigth = f_turn_night();
          int v_total_salary_day =0, v_total_salary_night=0, v_total_salary=0;
          System.out.println("turn day");
          for(int i=0; i<8; i++){
              v_total_salary_day+= v_salary_day[i];
              System.out.println("employeed ["+i+"] $ "+v_salary_day[i]);
        }
        System.out.println("turn night");
          for(int i=0; i<8; i++){
              v_total_salary_night+= v_salary_nigth[i];
              System.out.println("employeed ["+i+"] $ "+v_salary_nigth[i]);
    }
    System.out.println("total salary");
    System.out.println(" total salary day $ "+v_total_salary_day);
    System.out.println(" total salary night $ "+v_total_salary_night);
    System.out.println(" total (day+night) $ "+ (v_total_salary_day+v_total_salary_night));

    }
    public static void f_introduction() {
        //description: show principal information of program
        System.out.println("------------------------------------------------------------------");
        System.out.println("-------------------vectorswith salaryandtwoturnsSOFT--------------");
        System.out.println("-----------------------------version 1.0--------------------------");
        System.out.println("---------------made by LUIS DAVID GUERRERO CAMACHO----------------");
        System.out.println("------------------------------------------------------------------");

    }

    public static int[] f_turn_day(){
        //description: this method returns a vector with 8 salary
        int[] v_salary_day = new int [8];
        for(int i=0; i<8; i++){
            v_salary_day[1]=(int) ((Math.random()*8)*29260);
        }
        return v_salary_day;
    }
    public static int[] f_turn_night(){
        //description: this method returns a vector with 8 salary more 35%
        int[] v_salary_nigth = new int[8];
        for(int i=0; i<8; i++){
            v_salary_nigth[1]=(int) ((Math.random()*8)*38151);
    
        }
        return v_salary_nigth;
    }

}
