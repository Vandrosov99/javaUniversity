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
                   fw.write("Слово " + word + "  рядок = " + numberOfLine + " разів" + count+" у файлі " + fileToRead + "\n");
                }
            //    fw.write("Слово " + word + " зустрічаеться " + count + " разів у файлі " + fileToRead);
            }
          //  FileWriter fw = new FileWriter("C://Users/1999v/Desktop/" + fileToWrite);
         //   fw.write("Слово " + word + " зустрічаеться " + count + " разів у файлі " + fileToRead);
            fr.close();
            fw.close();
            System.out.println("Зміст файлу " + fileToWrite);
            fr = new FileReader("C://Users/1999v/Desktop/" + fileToWrite);
            scan = new Scanner(fr);
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("файл " + fileToRead + " не знайдено");
        } catch (IOException e){//не повинна бути
            System.out.println("помилка при роботі з файлами");
        }
}
}