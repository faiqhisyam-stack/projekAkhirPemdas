package tesrepo;

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
    public boolean cocok(String cekNopol, String cekJenis) {
        return nopol.equalsIgnoreCase(cekNopol) && jenisKendaraan.equalsIgnoreCase(cekJenis);
    }
}