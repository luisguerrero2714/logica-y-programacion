//AUTHOR: LUIS DAVID GUERRERO CAMACHO
//DESCRIPTION: Generate random princes (1000 to 99000) for N products and save them to the vector
//DATE: 3-11-20


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    f_introduction();
    int v_N_products = f_total_products();
    double v_IVA=0, v_total_bill=0, v_average_price=0;
    int v_vector_products[]= f_fill_vector_age_people(v_N_products);
    for (int i=0; i<v_N_products; i++){
    if(v_vector_products[i]>10000){
        v_IVA=v_IVA+(v_vector_products[i]*0.19);
    }
    v_total_bill+=v_vector_products[i];
    
    }
    v_average_price=(v_total_bill+v_IVA)/v_N_products;
    System.out.println("gross value: $" +v_total_bill);
    System.out.println("tax (19%): $" +v_IVA);
    System.out.println("TOTAL BILL: $" +(v_total_bill+v_IVA));
    System.out.println("Average bill: "+ v_average_price);

    

    }

    
    

    public static void f_introduction() {
        //description: show inicial information
        System.out.println("--------------------------------------------------------------");
        System.out.println("---------------------vectoragewithpriceSOFT-------------------");
        System.out.println("---------------------------version 1.0------------------------");
        System.out.println("---------------made by LUIS DAVID GUERRERO CAMACHO------------");
        System.out.println("--------------------------------------------------------------");
        
    }
    public static int f_total_products() {
        //descriptioon: this method ¿returns the total products between 1 nd 10000
        Scanner tECLADOScanner = new Scanner(System.in);
        System.out.println(" input the total products do you need?");
        int v_total_product = keyboard.nextInt();
        while(v_total_product<1 || v_total_product>10000){
            System.out.println("ERROOOOR, the value should be betwwen 1 to 10000, input again the total products do you want");
            v_total_product= keyboard.nextInt();
        }
        return v_total_product;

        
    }
    public static int[] f_fill_vector_age_people(int N) {
        //description: this method returns a vector with age for N people
        int[] v_vector_age = new int[N];
        for(int i=0; i<N; i++){
            v_vector_age[i]= (int) (Math.random()*100)+1;
        }
        return v_vector_age;
        
    }
}
