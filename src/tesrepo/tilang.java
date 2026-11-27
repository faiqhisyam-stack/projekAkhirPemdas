package tesrepo;

import java.util.Scanner;
public class tilang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        stnk menu = new stnk();

        stnk[] dataStnk = {
            new stnk("N1234AL", "Beat"),
            new stnk("N5678AD", "Vario"),
            new stnk("N0987AU", "Fazzio"),
            new stnk("N3412PR", "KLX")
        };

        String pilihanUser = "";
        do {
            pilihanUser = menu.tampilkanMenu(in);
            switch (pilihanUser) {
                case "1":
                    menu.cekStnk(in, dataStnk);
                    break;
                case "2":
                    // tambah stnk
                    break;
                case "3":
                    // lihat semua
                    break;
                case "4":
                    //catat tilang
                    break;
                case "0":
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (!pilihanUser.equals("0"));
    }
}