package com.company;
import java.io.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            FileReader fReader = new FileReader("src\\com\\company\\notes.txt");
            BufferedReader bReader = new BufferedReader(fReader);
            String line = bReader.readLine();
            while(line != null){
                System.out.println(line);
                line = bReader.readLine();
            }
            fReader.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Bir metin giriniz : ");
        String text = input.nextLine();

        try{
            FileWriter fWriter = new FileWriter("src\\com\\company\\notes.txt");
            if(text.equals(null)){
                fWriter.write(text);
            }else{
                fWriter.write(text + "\n");
            }
            fWriter.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
