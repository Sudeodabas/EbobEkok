import java.util.Scanner;
public class EbokEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ebob = 1, ekok;
        int a, b;//kullanıcıdan alıcağımız değerler

        System.out.println("1. sayıyı giriniz: ");
        a = input.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        b = input.nextInt();

        if (b > a) {
            for (int i = a; i >= 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                    System.out.println("EBOB: "+ebob);
                    break;
                }
            }//bu kısımda ebob bulunuyor.
            for (int i = 1; i <= (a * b); i++) {
                if (i % a == 0 && i % b == 0) {
                    System.out.println("EKOK: "+i);
                    break;
                }

            }
        } else  {
            for (int i = b; i >= 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                    System.out.println("EBOB: "+ebob);
                    break;
                }
            }//bu kısımda ebob bulunuyor.
            for (int i = 1; i <= (a * b); i++) {
                if (i % a == 0 && i % b == 0) {
                    System.out.println("EKOK: "+i);
                    break;
                }

            }
        }




    }
}