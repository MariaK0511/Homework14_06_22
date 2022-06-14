import javax.swing.text.Document;
import java.io.*;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        1. Допустим есть txt файл с номерами документов.+
Номером документа является строка, состоящая из букв и цифр(без служебных символов).
Пусть этот файл содержит каждый номер документа с новой строки и в
строке никакой другой информации, только номер документа.+
Валидный номер документа должен иметь длину 15 символов и
начинаться с последовательности docnum(далее любая последовательность букв/цифр)
или contract(далее любая последовательность букв/цифр).+
Написать программу для чтения информации из входного файла - путь к
входному файлу должен задаваться через консоль. +
Программа должна проверять номера документов на валидность.
         */
        BufferedReader bufferedReader;
        Scanner sc = new Scanner(System.in);
        String line;
        String path = sc.nextLine();
        try {
            bufferedReader = new BufferedReader(new FileReader(path));

            while ((line = bufferedReader.readLine()) != null) {
                if (line.length() == 15 && (line.startsWith("docnum") || line.startsWith("contract")) && line.matches("\\p{Alnum}*")) {
                    System.out.println("Длина документа 15 символов");
                } else {
                    throw new RuntimeException();
                }
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("File is not found");
            throw new RuntimeException(e);
        }
    }
}