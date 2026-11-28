package tesrepo;

import java.util.Scanner;
public class stnk {
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
    
    public void setNopol(String nopol) {
        this.nopol = nopol;
    }

    public void setJenis(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }
    
    public String tampilkanMenu(Scanner in) {
        System.out.println("========================================");
        System.out.println("          M E N U   U T A M A");
        System.out.println("========================================");
        System.out.println("1. Cek STNK");
        System.out.println("2. Edit STNK");
        System.out.println("3. Lihat Semua");
        System.out.println("4. Catat Tilang");
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
        String pilihMenu = in.nextLine();
        return pilihMenu;
    }
    
    public void cekStnk(Scanner in, stnk[] dataS, int jumlah) {
        System.out.println("========================================");
        System.out.println("           C E K   S T N K");
        System.out.println("========================================");
        System.out.print("Masukkan nopol: ");
        String cekNopol = in.nextLine();
        System.out.print("Masukkan jenis kendaraan: ");
        String cekJenis = in.nextLine();

        boolean valid = false;

        for (int i = 0; i < jumlah; i++) {
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
        System.out.print("Tekan Enter untuk lanjut...");
        in.nextLine();
    }
    
    public boolean cocok(String cekNopol, String cekJenis) {
        return nopol.equalsIgnoreCase(cekNopol) && jenisKendaraan.equalsIgnoreCase(cekJenis);
    }
    
    public void listStnk(stnk[] dataS, int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.println(i + 1 + ". Nopol: " + dataS[i].getNopol() + " | Jenis: " + dataS[i].getJenis());
        }
    }
    
    public int editStnk(Scanner in, stnk[] dataS, int jumlah) {
        String pilihEdit;
        do {
            System.out.println("========================================");
            System.out.println("          E D I T   S T N K");
            System.out.println("========================================");
            System.out.println("1. Ubah STNK");
            System.out.println("2. Tambah STNK");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            pilihEdit = in.nextLine();

            switch (pilihEdit) {
                case "1":
                    ubahStnk(in, dataS, jumlah);
                    break;
                case "2":
                    jumlah = tambahStnk(in, dataS, jumlah);
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Input tidak valid.");
            }
        } while (!pilihEdit.equals("0"));
        return jumlah;
    }
    
    public void ubahStnk(Scanner in, stnk[] dataS, int jumlah) {
        listStnk(dataS, jumlah);
        System.out.print("Pilih nomor data yang ingin diubah: ");
        String teksUbah = in.nextLine();
        int pilihanUbah = 0;
        for (int u = 1; u <= dataS.length; u++) {
            if (teksUbah.equals(u + "")) {
                pilihanUbah = u;
            }
        }
        if (pilihanUbah == 0) {
            System.out.println("Nomor data tidak valid.");
        }
        else {
            stnk target = dataS[pilihanUbah - 1];

            System.out.print("Nopol baru: ");
            String nopolBaru = in.nextLine();
            System.out.print("Jenis baru: ");
            String jenisBaru = in.nextLine();
            
            boolean sudahAda = false;
            for (int i = 0; i < jumlah; i++) {
                if (dataS[i].getNopol().equalsIgnoreCase(nopolBaru)) {
                    sudahAda = true;
                }
            }
            if (nopolBaru.equals("") || jenisBaru.equals("")) {
                System.out.println("Nopol dan jenis tidak boleh kosong!");
            } 
            else if (sudahAda) {
                System.out.println("Nopol sudah terdaftar!");
            } 
            else {
                target.setNopol(nopolBaru);
                target.setJenis(jenisBaru);
                System.out.println("Data berhasil diubah!");
            }
        }
    }
    
    public int tambahStnk(Scanner in, stnk[] dataS, int jumlah) {
        System.out.println("========================================");
        System.out.println("         T A M B A H   S T N K");
        System.out.println("========================================");
        if (jumlah == dataS.length) {
            System.out.println("Data penuh!");
        } 
        else {
            System.out.print("Nopol: ");
            String nopolBaru = in.nextLine();
            System.out.print("Jenis kendaraan: ");
            String jenisBaru = in.nextLine();
            
            boolean sudahAda = false;
            for (int i = 0; i < jumlah; i++) {
                if (dataS[i].getNopol().equalsIgnoreCase(nopolBaru)) {
                    sudahAda = true;
                }
            }
            
            if (nopolBaru.equals("") || jenisBaru.equals("")) {
                System.out.println("Nopol dan jenis tidak boleh kosong!");
            } 
            else if (sudahAda) {
                System.out.println("Nopol sudah terdaftar!");
            } 
            else {
                dataS[jumlah] = new stnk(nopolBaru, jenisBaru);
                jumlah++;
                System.out.println("Data berhasil ditambahkan!");
            }
        }
        return jumlah;
    }
    
    public void tampilkanStnk(Scanner in, stnk[] dataS, int jumlah) {
        System.out.println("========================================");
        System.out.println("         D A F T A R   S T N K");
        System.out.println("========================================");
        listStnk(dataS, jumlah);
        System.out.print("Tekan Enter untuk lanjut...");
        in.nextLine();
    }
}