import java.util.Scanner;

public class task3_simple_calk {
    public static void main(String[] args) {
        System.out.println("вы запустили калькулятор");
            
        Scanner sc = new Scanner(System.in);

        System.out.printf("Введите 1 число: ");
        int x = sc.nextInt();   
        Scanner sc2 = new Scanner(System.in);
        System.out.printf("Введите 2 число: ");
        int y = sc.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.printf("Введите оператор(+, -, *, /): ");
        String z = sc3.nextLine();
        System.out.println("--------------------");
        System.out.println(x+z+y);
        sc.close();
        sc2.close();
        sc3.close();
        int result = 0;
            switch (z) {
            case "+":
            result = x+y;
            System.out.println(result);
            break;
            case "-":
            result = x-y;
            System.out.println(result);
            break;
            case "*":
            result = x*y;
            System.out.println(result);
            break;
            case "/":
                if (y ==0)
                {
                System.out.println("делить на ноль нельзя");
                break;
                }
                else 
                {
                result = x/y;
                System.out.println(result);
                break;
                }
               
            }
        }
}



