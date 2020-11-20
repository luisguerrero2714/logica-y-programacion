//p1: lineas de comentarios de author,date y description y description
//AUTHOR: luis david guerrero camacho
//DATE: 2020-oct-23
//DESCRIPTION: calculates the average salary total salary and highest salary of N empleyes,where salary = (salary / 30)* working_days

//p2: importar las librerias requeridas
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_intruduction();

        double v_salary_average=0, v_salary_total=0, salary_higher=0;
        int N_employees=F_N_employees();

        for(int i=1; i<N_employees;i++){
            v_salary_tmp=f_salary_one_employee(i);
            v_salary_total=v_salary_total+v_salary_tmp;
            if(v_salary_higher>v_salary_tmp){
                v_salary_higher=v_salary_tmp;
            }
        }
        v_salary_average=v_salary_total/N_employees;
        System.out.println("The total salary is $"+v_salary_total+", average salary is $"+v_salary_average+" and the higher salary is $"+v_salary_higher);    
               
    }
    v_salary_average=v_salary_total/N_employees;
    System.out.println(x);
    //p3: crear el metodo de f_introduction()   <   nos muestra informacion inicial del soft
    public static void f_intruduction(){
        //description: show inicial menu/information of program
        System.out.println("--------------------------------------------");
        System.out.println("--------------------------------------------");
        System.out.println("----------SoftSalarys_of_N_Employees--------");
        System.out.println("-------------Verion 1.0 2020-oct-23---------");
        System.out.println("-----Mke by LUis david guerrero camacho-----");
        System.out.println("--------------------------------------------");
        System.out.println("--------------------------------------------");
    }

    public static int f_N_employees(){
        //description: this method returns the total employees to calculate.
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Input the total emplpyees: ");
        int N_employees= keyboard.nextInt();
        while(N_employees=< || N_employes>100){
            System.out.println("ERR: your should be between 1 and 100, input again the total employees:  ");
            N_employees= keyboard.nextInt();
        }
        return N_employees;
    }   
    
    public static double f_salary_one_employee(int i){
        //description: this method calculate the saary by one employee (SALARY_EMPLOYEE= SALARY/DAYS_WORK)
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Input the salary by the employee "+i+" $: ");
        int salary= keyboard.nextInt();
        while(salary<1){
           System.out.println("ERR: this salary should be greater than zero, Input again the salary for the employee "+i+" $: ");
            salary= keyboard.nextInt();
        }
        
        System.out.println("input the workdays in this month for rhe employee "+i+" $:");
        int workdays= keyboard.nextInt();
        while(workdays<1 || workdays>30){
            System.out.println("ERR: The workdays should be between 1 and 30 Input again the workdays for the employee "+i+" $: ");
            workdays= keyboard.nextInt();
        }
        double salary_employee= (salary/30*workdays);
        return salary_employee;    
    }
}

