//AUTHOR: LUIS DAVID GUERRERO CAMACHO
//DESCRIPTION: This program calculate men and women ages.
//DATE: 9-11-20

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        int[] v_vector_men = f_bill_vector_ages();
        int[] v_vector_women = f_bill_vector_ages();
        int[] v_totales = { 0, 0, 0, 0, 0, 0, 0, 0 };

        for (int i = 0; i < v_vector_men.length; i++) {
            if (v_vector_women[i] < 18) {
                v_totales[1] = v_totales[1] + 1;
            } else if (v_vector_women[i] < 60) {
                v_totales[3] = v_totales[3] + 1;
            } else {
                v_totales[5] = v_totales[5] + 1;

            }
            v_totales[7] = v_totales[7] + v_vector_women[i];
            if (v_vector_men[i] < 18) {
                v_totales[0] = v_totales[0] + 1;
            } else if (v_vector_men[i] < 60) {
                v_totales[2] = v_totales[2] + 1;
            } else {
                v_totales[4] = v_totales[4] + 1;

            }
            v_totales[6] = v_totales[6] + v_vector_men[i];

        }
        System.out.println("men" + v_totales[0] + "and women" + v_totales[1] + "are under the age of 18");
        System.out.println("men" + v_totales[2] + "and women" + v_totales[3] + "are equal to or over 18 but ander 60");
        System.out.println("men" + v_totales[4] + "and women" + v_totales[5] + "equal or over 60 years of age");
        System.out.println("average age of women:" + (v_totales[7] / v_vector_women.length) + "    and men :   "
                + (v_totales[6] / v_vector_men.length));
        System.out.println("ages of women");
        for (int i = 0; i < v_vector_women.length; i++) {
            System.out.println("[" + i + "]=" + v_vector_women[i]);
        }
        System.out.println("ages of men");
        for (int i = 0; i < v_vector_men.length; i++) {
            System.out.println("[" + i + "]=" + v_vector_men[i]);
        }

    }

    public static void f_introduction() {
        // DESCRIPTION: show information principal
        System.out.println("--------------------------------------------------------------");
        System.out.println("-----------------------menandwomenSOFT------------------------");
        System.out.println("-------------------------version 1.0--------------------------");
        System.out.println("---------------made by LUIS DAVID GUERRERO CAMACHO------------");
        System.out.println("--------------------------------------------------------------");

    }

    public static int[] f_bill_vector_ages() {
        int[] v_vector = new int[10];
        for (int i = 0; i < 10; i++) {
            v_vector[i] = (int) (Math.random() * 99) + 1;
        }
        return v_vector;
    }

}
