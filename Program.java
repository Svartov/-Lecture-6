// Подключаем библиотеку
import java.util.Arrays;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        // Переменные и массивы и строки.
        Scanner sc = new Scanner(System.in);
        System.out.print("Input you code: ");
        String text = sc.nextLine();
        int b = 0;

        // Подсчёт сколько букв 'b'
        char[] texten = text.toCharArray();
        for(int i = 0; i < texten.length; i++){
            if(texten[i] == 'b'  ){
                b += 1; // Добавляем 1
            }
        }

        // Проверка на количество и дополнение.
        if(b == 2 || b == 3 || b == 4){
            System.out.println("Буква b встречается: " + b + " раза");
        }else{
            System.out.println("Буква b встречается: " + b + " раз");
        }
    }
}