import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner son = new Scanner(System.in);
        int gol, jam, upah, gaji;

        System.out.print("Golongan : ");
        gol = son.nextInt();
        System.out.print("jam kerja : ");
        jam = son.nextInt();

        upah = 0;

        switch (upah) {
            case 1:
                upah = 3000;
                break;
            case 2:
                upah = 3500;
                break;
            case 3:
                upah = 4000;
                break;
            case 4:
                upah = 5000;
                break;
        
        }
        

        if (jam > 40) {
            gaji = 40 * upah;
        }else{
            gaji = jam * upah;
        }
        System.out.println("Gaji : " + gaji);
    }
}
