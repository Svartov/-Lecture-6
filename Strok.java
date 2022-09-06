// Подключаем библиотеку
import java.util.Arrays;
import java.util.Scanner;


public class Strok {
    public static void main(String[] args) {

        // Переменные и массивы и строки.
        int b = 2;

        for(int i = 0; i < 10; i++){
            b += 1;
            String text = String.format("%." + b + "f", Math.PI);
            System.out.println("PI " + i + ": " +  text);
        }


    }
}
