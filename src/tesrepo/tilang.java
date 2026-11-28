package tesrepo;

import java.util.Scanner;
public class tilang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        stnk menu = new stnk();

        stnk[] dataStnk = new stnk[67];
        dataStnk[0] = new stnk("N1234AL", "Beat");
        dataStnk[1] = new stnk("N5678AD", "Vario");
        dataStnk[2] = new stnk("N0987AU", "Fazzio");
        dataStnk[3] = new stnk("N3333PR", "KLX");
        int jumlah = 4;

        String pilihanUser = "";
        do {
            pilihanUser = menu.tampilkanMenu(in);
            switch (pilihanUser) {
                case "1":
                    // cek stnk
                    menu.cekStnk(in, dataStnk, jumlah);
                    break;
                case "2":
                    // edit stnk
                    jumlah = menu.editStnk(in, dataStnk, jumlah);
                    break;
                case "3":
                    // lihat semua
                    menu.tampilkanStnk(in, dataStnk, jumlah);
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