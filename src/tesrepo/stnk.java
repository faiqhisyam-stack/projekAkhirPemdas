package tesrepo;

import java.util.Scanner;
public class stnk {
    Scanner in = new Scanner(System.in);
    private String nopol, jenisKendaraan;

    public stnk() {
        nopol = null;
        jenisKendaraan = null;
    }
    
    public stnk(String nopol, String jenisKendaraan) {
        this.nopol = nopol;
        this.jenisKendaraan = jenisKendaraan;
    }
    
    public String getNopol() {
        return nopol;
    }
    
    public String getJenis() {
        return jenisKendaraan;
    }
    
    
    
    public String tampilkanMenu(Scanner in) {
        System.out.println("========================================");
        System.out.println("          M E N U   U T A M A");
        System.out.println("========================================");
        System.out.println("1. Cek STNK");
        System.out.println("2. Tambah STNK");
        System.out.println("3. Lihat Semua");
        System.out.println("4. Catat Tilang");
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
        String pilihMenu = in.nextLine();
        return pilihMenu;
    }
    
    public void cekStnk(Scanner in, stnk[] dataS) {
        System.out.println("========================================");
        System.out.println("           C E K   S T N K");
        System.out.println("========================================");
        System.out.print("Masukkan nopol: ");
        String cekNopol = in.nextLine();
        System.out.print("Masukkan jenis kendaraan: ");
        String cekJenis = in.nextLine();

        boolean valid = false;

        for (int i = 0; i < dataS.length; i++) {
            if (dataS[i].cocok(cekNopol, cekJenis)) {
                valid = true;
                break;
            }
        }

        if (valid) {
            System.out.println("Data valid, kendaraan aman!");
        } else {
            System.out.println("Data tidak sesuai atau tidak ada!");
        }
    }
    
    public boolean cocok(String cekNopol, String cekJenis) {
        return nopol.equalsIgnoreCase(cekNopol) && jenisKendaraan.equalsIgnoreCase(cekJenis);
    }
}