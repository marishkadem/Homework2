import java.util.Scanner;

/* 
Разработайте программу, которая выбросит Exception, когда пользователь вводит
пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/

public class Task4 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            if (sc.nextLine().isEmpty()) {
                throw new RuntimeException();
            }

        } catch (RuntimeException e) {
            System.out.println("Пустые строки вводить нельзя.");
        }

    }
}