package lab2class;


import java.io.FileReader;
import java.util.Scanner;

public class Test {
    Scanner scanner = new Scanner(System.in);
    public void test(){
        System.out.println("Яке слово шукати ?");
        String word = scanner.nextLine();
        System.out.println("У якому файлі (на робочому столі) шукати ?");
        String fileToRead = scanner.nextLine();
        System.out.println("До якого файлу (на робочому столі) записати результат ?");
        String fileToWrite = scanner.nextLine();

        Filereader.go(word, fileToRead, fileToWrite);
    }
}
