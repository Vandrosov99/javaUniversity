package lab2class;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class Filereader {
    static int count = 0;
    static int numberOfLine = 0;
    public static void go(String word, String fileToRead, String fileToWrite){
        try {
            FileReader fr = new FileReader("C://Users/1999v/Desktop/" + fileToRead);
            FileWriter fw = new FileWriter("C://Users/1999v/Desktop/" + fileToWrite);
            Scanner scan = new Scanner(fr);
            String line = "";
           
            while (scan.hasNextLine()){
                line = scan.nextLine();
                numberOfLine++;
                if(line.indexOf(word) == 0){
                    count++;
                   fw.write("����� " + word + "  ����� = " + numberOfLine + " ����" + count+" � ���� " + fileToRead + "\n");
                }
            //    fw.write("����� " + word + " ������������ " + count + " ���� � ���� " + fileToRead);
            }
          //  FileWriter fw = new FileWriter("C://Users/1999v/Desktop/" + fileToWrite);
         //   fw.write("����� " + word + " ������������ " + count + " ���� � ���� " + fileToRead);
            fr.close();
            fw.close();
            System.out.println("���� ����� " + fileToWrite);
            fr = new FileReader("C://Users/1999v/Desktop/" + fileToWrite);
            scan = new Scanner(fr);
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("���� " + fileToRead + " �� ��������");
        } catch (IOException e){//�� ������� ����
            System.out.println("������� ��� ����� � �������");
        }
}
}