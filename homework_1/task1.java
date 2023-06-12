import java.util.Scanner;

/**
 * homework
 */
public class task1 {
        
        public static void main(String[] args) {
        System.out.println("Введите число");    
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close(); // закрываем скан
        int num = Integer.parseInt(s);
        var temp = 0;
            for (int i = 0 ;i<=num;i++) 
            temp = temp+i;
        System.out.println(temp);

            
            
    }
}