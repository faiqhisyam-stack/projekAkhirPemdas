package tesrepo;

import java.util.Scanner;
public class PilihanGandaSejarah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] soal = {"1. Kapan Indonesia Merdeka? \nA. 17 Agustus 1945  \nB. 28 Oktober 1928  \nC. 30 September 1965",
            "2. Tanggal berapa hari pahlawan? \nA. 1 Juni \nB. 10 November \nC. 4 Desember",
            "3. Kapan sumpah pemuda terjadi? \nA. 17 Agustus 1945 \nB. 28 Oktober 1945 \nC. 28 Oktober 1928",
            "4. Hari Kelahiran Pancasila adalah \nA. 1 Januari 1988 \nB. 1 Juni 1945\nC. 4 November 1253",
            "5. Kapan Hari Kesaktian Pancasila? \nA. 1 Oktober 1965 \nB. 17 Agustus 2007 \nC. 13 Maret 2008"};
        String[] kunciJawaban = {"A", "B", "C", "B", "A"};
        String pilihan = "";
        int poin = 0;

        // Header
        System.out.println("======================================");
        System.out.println("      SOAL PILIHAN GANDA SEJARAH");
        System.out.println("======================================");
        System.out.println("  Jumlah soal : " + soal.length + "\n");
        
        //menu
        int menu = in.nextInt();

        for (int i = 0; i < soal.length; i++) {
            System.out.println(soal[i]);
            System.out.print("Pilihan Anda: ");
            pilihan = in.next();

            if (pilihan.equalsIgnoreCase(kunciJawaban[i])) {
                System.out.println("Benar!");
                poin += 1;
            } else {
                System.out.println("Salah!");
            }
            System.out.println();
        }

        int nilai = (poin * 100) / soal.length;
        System.out.println("Jumlah jawaban benar: " + poin);
        System.out.println("Nilai: " + nilai);
    }
}
