import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner son = new Scanner(System.in);
        int masuk, keluar, lama, biaya;

        System.out.print("JAm masuk : ");
        masuk = son.nextInt();
        System.out.print("JAm keluar : ");
        keluar = son.nextInt();

        if (keluar >= masuk) {
            lama = keluar - masuk;
        }else{
            lama = (12-masuk) + keluar
        }
        
        if (lama > 2) {
            biaya = 2000 + ((lama-2)*500)
        }else{
            biaya = 2000;
        }
        System.out.println("Keluaran/tampilan : "+biaya);
    }
}
