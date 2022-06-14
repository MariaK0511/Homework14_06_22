import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    /*
    Улучшить предыдущее задание. А именно:
Валидные номера документов следует записать в один файл-отчет.
Невалидные номера документов следует записать в другой файл-отчет,
но после номеров документов следует добавить информацию о том, почему этот документ невалиден.
     */
        BufferedReader bufferedReader2;
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2;
        Scanner sc = new Scanner(System.in);
        String line;
        String path = sc.nextLine();
        try {
            bufferedReader2 = new BufferedReader(new FileReader(path));
            bufferedWriter = new BufferedWriter(new FileWriter("valid_numbers.txt"));
            bufferedWriter2 = new BufferedWriter(new FileWriter("invalid_numbers.txt"));
            while ((line = bufferedReader2.readLine()) != null) {
                if (line.length() == 15 && (line.startsWith("docnum") || line.startsWith("contract")) && line.matches("\\p{Alnum}*")) {
                    bufferedWriter.write(line + "\n");
                    System.out.println(line);
                } else if (line.length() != 15) {
                    bufferedWriter2.write(line  + " - Строка не имеет длину 15 " + "\n");
                } else if (!line.startsWith("docnum")||!line.startsWith("contract")) {
                    bufferedWriter2.write(line + " - Строка не начинается с docnum или contract" + "\n");
                } else if (!line.matches("\\p{Alnum}*")) {
                    bufferedWriter2.write(line + " - Строка не содержит ни букв, ни цифр" + "\n");
                } else {
                    throw new RuntimeException();
                }
            }
            bufferedReader2.close();
            bufferedWriter.close();
            bufferedWriter2.close();

        } catch (IOException e) {
            System.out.println("File is not found");
            throw new RuntimeException(e);
        }
    }
}
