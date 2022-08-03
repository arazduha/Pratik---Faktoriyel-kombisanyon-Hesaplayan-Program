import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, r, u=1, t=1, k=1, komb;

        System.out.println("Kombinasyon Hesaplama");
        System.out.print("N kumesinin elemean sayisini giriniz: ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++){
            t*=i;
        }

        System.out.print("N kumesinin elemean sayisini giriniz: ");
        r = inp.nextInt();
        for (int y = 1; y <= r; y++){
            k*=y;
        }
        int fark = n - r;
        for (int a = 1; a <= fark; a++) {
            u*=a;
        }

        komb = t/(u*k);
        System.out.println("C(" + n + "," + r + ")= " +komb);

    }

}





