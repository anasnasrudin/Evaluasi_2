import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner son = new Scanner(System.in);
        int kode, harga, diskon;
        String jenis;

        System.out.print("Jenis=");
        jenis = son.nextLine();
        System.out.print("Kode=");
        kode = son.nextInt();
        System.out.print("Harga=");
        harga = son.nextInt();

        switch (jenis) {
            case A:
                diskon = 0,9 * harga;
                break;
        }
    }
}
