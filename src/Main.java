import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String yildiz="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi= scanner.nextInt();
        for (int i = sayi; i > 0 ; i--) {
            for (int j = 1; j <= i * 2 - 1; j++) {
                yildiz += "*";
            }
            System.out.println(yildiz);
            yildiz = "";
        }
    }
}