// Подключаем библиотеку
import java.util.Arrays;
import java.util.Scanner;

public class str {
    public static void main(String[] args) {

        //
        Scanner sc = new Scanner(System.in);

        // Переменные
        int texten = 0;
        System.out.print("Введите ваше предложение: ");
        String pred = sc.nextLine();

        // Разбиваем строку на основании регулярного выражения exp.
        String[] wr = pred.split("[ ]");

        System.out.println();
        // Находим максимальное слово
        for (int i = 0; i < wr.length; i++) {
            if(wr[i].length() > wr[texten].length()) {
                texten = i;
            }
        }
        System.out.println("Самое длинное слово: " + wr[texten]); //
    }
}