package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static byte [][] array;
    static int N;
    public static void main(String[] args) {
  
        System.out.println(" ");
        while(true){
            start();
            String answer = scanner.nextLine();
            if(!answer.equals("go")){
                break;
            }

        }
    }
    public static void showMatrix(){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.printf("%6d", array[i][j]);
            }
            System.out.println("");
        }
    }
    public static void start(){


        boolean isParseable = false;
        do {
            try{
                System.out.printf("Vvedite razmer matricu N: ");
                N = Integer.parseInt(scanner.nextLine());
                isParseable = true;
                if(N < 0){
                    throw new IntIsMinusExeption("");
                }
                if(N == 0){
                    throw new IntIsZeroException("");
                }
            }
            catch (NumberFormatException e){
                System.out.println("Not a number·");
                isParseable = false;
            }
            catch (IntIsMinusExeption e){
                System.out.println("You get wrote " + e.getMessage() + ", Try again");
                isParseable = false;
            }
            catch (IntIsZeroException e){
                System.out.println("size of matrix cant be  0");
                isParseable = false;
            }
        }
        while (!isParseable);


        array = new byte[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                array[i][j] = (byte)(Math.random()*100);
            }
        }//
        System.out.println(" ");
        System.out.println(" do Obrobki :");
        showMatrix();
        System.out.println(" ");



        int s = 0;
        isParseable = false;
        do {
            try{
                System.out.printf("Write your  k dly stolbca(s 0): ");
                s = Integer.parseInt(scanner.nextLine());
                isParseable = true;
                if(s < 0){
                    throw new IntIsMinusExeption("");
                }
            }
            catch (NumberFormatException e){
                System.out.println("Not a number·");
                isParseable = false;
            }
            catch (IntIsMinusExeption e){
                System.out.println("You wrote " + e.getMessage() + ", Try again·");
                isParseable = false;
            }
        }
        while (!isParseable);

        for( int i = 0; i < N; i++ )
        	for(int k =i+1;k<N;k++){
        		if (array[i][s] > array[k][s]) {
        			for(int j=0;j<N;j++) {
        				byte temp =array[i][j];
        				array[i][j]=array[k][j];
        				array[k][j]=temp;
        			}
        		}
        }

        System.out.println(" ");
        System.out.println("Posle peredvijeniy:");
        showMatrix();
        System.out.println(" ");
    }
}