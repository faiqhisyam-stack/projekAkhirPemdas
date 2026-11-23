package tesrepo;

import java.util.Scanner;
public class tilang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        stnk[] dataStnk = {
            new stnk("N1234AL", "Beat"),
            new stnk("N5678AD", "Vario"),
            new stnk("N0987AU", "Fazzio"),
            new stnk("N3412PR", "KLX")
        };

        System.out.print("Masukkan nopol: ");
        String cekNopol = in.next();
        System.out.print("Masukkan jenis kendaraan: ");
        String cekJenis = in.next();

        boolean valid = false;
        
        for (int i = 0; i < dataStnk.length; i++) {
            if (dataStnk[i].cocok(cekNopol, cekJenis)) {
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
}