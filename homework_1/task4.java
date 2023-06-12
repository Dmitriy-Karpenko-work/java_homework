import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner Sc1 = new Scanner(System.in);
        System.out.printf("Введите q: ");
        String q_str= Sc1.nextLine();
        Scanner Sc2 = new Scanner(System.in);
        System.out.printf("Введите w: ");
        String w_str = Sc2.nextLine();
        Scanner Sс3 = new Scanner(System.in);
        System.out.printf("Введите e: ");
        String e_str = Sс3.nextLine();
        boolean flag = true;
        Sc1.close();
        Sc2.close();
        Sс3.close();
        for (int i = 0; i < 10; i++) {
            int q_num = Integer.parseInt(q_str.replace("?", Integer.toString(i)));
             for (int j =0; j < 10; j++) {
                 int w_num = Integer.parseInt(w_str.replace("?", Integer.toString(j)));
                 for (int k = 0; k < 10; k++) {
                     int e_num = Integer.parseInt(e_str.replace("?", Integer.toString(k)));
                     if (q_num + w_num == e_num) {
                         System.out.printf("Решение уравнения %s + %s = %s => %d + %d = %d\n", q_str, w_str, e_str, q_num, w_num, e_num);
                         flag = false;
                         break;
                     }
                 }
                 if (flag == false) break;
             }
             if (flag == false) break;
         } 
         if (flag) System.out.println("Решений нет!");         
    }
}