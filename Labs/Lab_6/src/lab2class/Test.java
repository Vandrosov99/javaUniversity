package lab2class;


import java.io.FileReader;
import java.util.Scanner;

public class Test {
    Scanner scanner = new Scanner(System.in);
    public void test(){
        System.out.println("��� ����� ������ ?");
        String word = scanner.nextLine();
        System.out.println("� ����� ���� (�� �������� ����) ������ ?");
        String fileToRead = scanner.nextLine();
        System.out.println("�� ����� ����� (�� �������� ����) �������� ��������� ?");
        String fileToWrite = scanner.nextLine();

        Filereader.go(word, fileToRead, fileToWrite);
    }
}
