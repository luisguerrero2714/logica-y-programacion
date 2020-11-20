//p1: lineas de comentarios de author, date y description
//AUTHOR: LUIS DAVID GUERRERO CAMACHO
//DATE: 2020-oct-27
//DESCRIPTION:saves the salaries of 5 employes using arrangement (vector), where the salaries are a random values
//            between $ 1,000,000 and $ 2,000,000, use a fuction to calculate the salary and save it in the vector 

//p2:importar las librerias requeridas
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
    f_introduction();
    int [] v_salary = new int [4];
    v_salary[0]=(int) (Math.random()*(50-10)+10);
    v_salary[1]=(int) (Math.random()*(50-10)+10);
    v_salary[2]=(int) (Math.random()*(50-10)+10);
    v_salary[3]=(int) (Math.random()*(50-10)+10);

    System.out.println("[0]: "+v_salary[0]);
    System.out.println("[1]: "+v_salary[1]);
    System.out.println("[2]: "+v_salary[2]);
    System.out.println("[3]: "+v_salary[3]);
    }
    public static void f_introduction(){
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------------vectorwith salarySOFT----------------");
        System.out.println("------------------------version 1.0---------------------");
        System.out.println("------------make by Luis david Guerrero Camacho---------");
        System.out.println("--------------------------------------------------------");  
    }

    
}
