import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner son = new Scanner(System.in);
        int masuk, keluar, lama;

        System.out.print("Jam masuk : ");
        masuk = son.nextInt();
        System.out.print("Jam keluar : ");
        keluar = son.nextInt();

        if (keluar >= masuk) {
            lama = keluar - masuk;
        }else{
            lama = (12-masuk)+keluar;
        }
        System.out.println("Keluaran/Tampilan : Lama bekerja "+ lama);
        son.close();
    }
}