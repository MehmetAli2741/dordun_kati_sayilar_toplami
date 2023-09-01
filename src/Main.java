import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,total=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Lütfen Bir Sayı Giriniz: ");
            n = input.nextInt();
            if ((n % 4 == 0) && (n > 0)){
                total += n;
            }
        }while (n > 0);
        System.out.print("Toplam: "+total);
    }
}