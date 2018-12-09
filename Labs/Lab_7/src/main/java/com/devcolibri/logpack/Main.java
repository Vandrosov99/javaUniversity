package com.devcolibri.logpack;


import org.apache.log4j.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class);
    private static OrderLogic logic;
    static Scanner scanner = new Scanner(System.in);
    static byte [][] array;
    static int N;
    public static void main(String[] args) {
        log.info("Program starts");
        System.out.println(" ");
        while(true){
            start();
            String answer = scanner.nextLine();
            log.info("User input at the end of the program - " + answer);
            if(!answer.equals("go")){
                break;
            }

        }
        log.info("Program finished");
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
                System.out.printf("Vvedite razmernost matricu  N = ");
                N = Integer.parseInt(scanner.nextLine());
                log.info("User input a matrix shift: " + N);
                isParseable = true;
                if(N < 0){
                    throw new IntIsMinusExeption("");
                }
                if(N == 0){
                    throw new IntIsZeroException("");
                }
            }
            catch (NumberFormatException e){
               // System.out.println("Not a number·");
                log.error("not a number");
                isParseable = false;
            }
            catch (IntIsMinusExeption e){
               // System.out.println("You get wrote " + e.getMessage() + ", Try again");
                log.error("try not a minus int");
                isParseable = false;
            }
            catch (IntIsZeroException e){
              //  System.out.println("size of matrix cant be  0");
                log.error("size of matrix cant be 0");
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
        System.out.println(" Dly obrabotki :");
        showMatrix();
        System.out.println(" ");



        int s = 0;
        isParseable = false;
        do {
            try{
                System.out.printf("Vvedite stolbec dly sortirovki(s 0) K=: ");
                s = Integer.parseInt(scanner.nextLine());
                isParseable = true;
                if(s < 0){
                    throw new IntIsMinusExeption("");
                }
            }
            catch (NumberFormatException e){
                System.out.println("Not a number·");
                log.error("not a number");
                isParseable = false;
            }
            catch (IntIsMinusExeption e){
                System.out.println("You wrote " + e.getMessage() + ", Try again·");
                log.error("try not minus int");
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
        System.out.println("Posle sortirvki:");
        showMatrix();
        System.out.println(" ");
    }
}