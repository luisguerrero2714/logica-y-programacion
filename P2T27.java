//AUTHOR: LUIS DAVID GUERRERO CAMACHO
//DESCRIPTION: This program calculates a vector with salary
//DATE: 27-10-20 


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
        System.out.println("--------------------------------------------------------------");
        System.out.println("---------------------vectorwith salarySOFT--------------------");
        System.out.println("-------------------------version 1.0--------------------------");
        System.out.println("---------------made by LUIS DAVID GUERRERO CAMACHO------------");
        System.out.println("--------------------------------------------------------------");
    }

    
}
