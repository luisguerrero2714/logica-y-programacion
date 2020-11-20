//AUTHOR: LUIS DAVID GUERRERO CAMACHO
//DESCRIPTION : create a method that returns the firs letter of a word entered as a paraneter
//DATE: 19-10-2020

import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
    f_menu();
    System.out.println("input word:");
    String word = keyboard.nextLine();
    while(word.length()<5){
        System.out.println("ERROOOOO, your word should have at least five letters, input again your word");
     word= keyboard.nextLine();
    
    }

    }
    
    public static void f_menu(){
        //DESCRIPTION: show inicial menu/information of program 
        System.out.println("firstletterSOFT------version 1.0-------made by Luis David Guerrero Camacho");

    }
    public static void f_first_letter(String word){

        String first_letter = word.substring(0,1);
        System.out.println("the first letter is"+first_letter);
    }
    public static void f_final_letter(String word){
        String final_letter = word. substring()-1;
        System.out.println("the final letter is "+final_letter);
    }
    public static void f_replace_letter(String word, String letter){
        String new_word= word.replace("a", letter);
        System.out.println("old word is"+word+"new word is: "+new_word);
    }
}

