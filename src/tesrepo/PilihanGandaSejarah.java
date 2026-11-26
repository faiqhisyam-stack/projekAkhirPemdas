package tesrepo;

import java.util.Scanner;

public class PilihanGandaSejarah {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //paket soal
        String[] soalSejarah = {"1. Kapan Indonesia Merdeka? \nA. 17 Agustus 1945  \nB. 28 Oktober 1928  \nC. 30 September 1965",
            "2. Tanggal berapa hari pahlawan? \nA. 1 Juni \nB. 10 November \nC. 4 Desember",
            "3. Kapan sumpah pemuda terjadi? \nA. 17 Agustus 1945 \nB. 28 Oktober 1945 \nC. 28 Oktober 1928",
            "4. Hari Kelahiran Pancasila adalah \nA. 1 Januari 1988 \nB. 1 Juni 1945\nC. 4 November 1253",
            "5. Kapan Hari Kesaktian Pancasila? \nA. 1 Oktober 1965 \nB. 17 Agustus 2007 \nC. 13 Maret 2008"};
        String[] kunciJawabanSejarah = {"A", "B", "C", "B", "A"};

        String[] soalMatematika = {"1. Aldo pergi kepasar membeli apel 2, Dikasih lima. Berapa apel yang mbul miliki? \nA. 0 \nB. 3 \nC. 1000",
            "2.Diketahui Seekor kucing mengejar tikus yang berjarak 10 meter di depannya. Setiap 1 detik, kucing melompat sejauh 3 meter, sedangkan tikus berlari sejauh 2 meter. Berapa detik yang dibutuhkan kucing untuk menangkap tikus? \nA. 3 detik \nB. 10 detik \nC. 5 detik",
            "3. Kamu punya 1 loyang kue bulat. Kamu mengirisnya dengan 3 kali sayatan lurus tanpa memindahkan potongan kue. Berapa jumlah potongan kue maksimal yang bisa kamu dapatkan? \nA. 7 potong \nB. 8 potong \nC. 9 potong",
            "4. Dari angka 1 sampai 100, berapa kali angka 9 muncul? \nA. 9 kali \nB. 11 kali \nC. 20 kali",
            "5. Di dalam laci gelap gulita ada 10 pasang sepatu hitam dan 10 pasang sepatu putih yang tercampur acak (semua ukurannya sama). Berapa minimal sepatu yang harus kamu ambil agar pasti mendapatkan sepasang sepatu yang cocok (kiri dan kanan dengan warna yang sama)? \nA. 21 pasang \nB. 30 pasang \nC. 19 pasang "};
        String[] kunciJawabanMatematika = {"A", "B", "A", "C", "A"};

        String[] soalPkn = {"1. Dalam kedudukannya sebagai sumber dari segala sumber hukum negara, bagaimana hubungan antara Pancasila dengan pasal-pasal dalam UUD NRI Tahun 1945? \nA.Pancasila menjiwai dan dijabarkan dalam pasal-pasal UUD 1945. \nB. Pasal-pasal UUD 1945 kedudukannya lebih tinggi karena bersifat operasional. \nC. Pancasila hanya berlaku pada Pembukaan UUD 1945, sedangkan batang tubuhnya berdiri sendiri.",
            "2. Amandemen UUD NRI Tahun 1945 mengubah kedudukan Majelis Permusyawaratan Rakyat (MPR). Pernyataan manakah yang tepat mengenai kedudukan MPR setelah amandemen? \nA. MPR tetap menjadi lembaga tertinggi negara pemegang kedaulatan penuh. \nB. MPR menjadi lembaga negara yang kedudukannya sejajar dengan Presiden dan Mahkamah Konstitusi.\nC. MPR berwenang mengangkat dan memberhentikan Presiden secara langsung kapan saja.",
            "3. Seorang WNA yang telah tinggal di Indonesia selama 5 tahun berturut-turut (atau 10 tahun tidak berturut-turut) ingin mengajukan kewarganegaraan Indonesia melalui jalur naturalisasi biasa. Syarat substantif apa yang wajib ia penuhi? \nA. Memiliki surat keterangan bebas pajak dari negara asalnya saja. \nB. Menikah dengan warga negara Indonesia minimal selama 3 tahun. \nC. Dapat berbahasa Indonesia serta mengakui dasar negara Pancasila dan UUD NRI Tahun 1945.",
            "4. Dalam pembagian kekuasaan secara horizontal di Indonesia pasca-amandemen UUD 1945, Badan Pemeriksa Keuangan (BPK) menjalankan kekuasaan... \nA. Konstitutif \nB. Eksaminatif \nC.Yudikatif",
            "5. Pelimpahan sebagian urusan pemerintahan yang menjadi kewenangan Pemerintah Pusat kepada Gubernur sebagai wakil Pemerintah Pusat dan/atau kepada instansi vertikal di wilayah tertentu disebut asas... \nA. Dekonsentrasi \nB. Desentralisasi \nC. Tugas pembantuan"};
        String[] kunciJawabanPkn = {"A", "B", "C", "B", "A"};

        //array judul soal (berurutan)
        String[] judulPaket = {
            "Paket Soal Sejarah", "Paket Soal Matematika", "Paket Soal Pkn"
        };
        //Token Soal (berurutan)
        String[] tokenPaket = {
            "ABCDEG", "QWERTY", "FGHJKL"
        };

        //List Mahasiswa
        String[] listMahasiswa = {
            "Adi", "Edo", "Lani", "Siti"
        };

        //List Dosen
        String[] listDosen = {
            "Ali", "Raib", "Seli", "Gill"
        };
        String passwordDosen = "12345678";

        String pilihan = "";
        int poin = 0;

        //menu
        String pilihanMenu = "";

        do {//loop menu (yg diatasi : apabila login gagal kembali ke sini
            System.out.println("======================================");
            System.out.println("              M  E  N  U              ");
            System.out.println("======================================");
            System.out.println("1. Login Mahasiswa");
            System.out.println("2. Login Dosen");
            System.out.println("0. Keluar");
            System.out.print("Ketik : ");
            pilihanMenu = in.nextLine();
            switch (pilihanMenu) {
                case "1"://mahasiswa
                    System.out.print("Masukkan Nama :");
                    String namaLogin = in.nextLine();
                    boolean statusLogin = false;
                    //cek valid
                    for (String listMahasiswa1 : listMahasiswa) {
                        if (namaLogin.equalsIgnoreCase(listMahasiswa1)) {
                            statusLogin = true;
                            System.out.println("Login Berhasil");
                            break;
                        }
                    }
                    if (statusLogin == false) {
                        System.out.println("Nama mahasiswa tidak terdaftar");
                    }

                    if (statusLogin == true) {
                        String menuMahasiswa = "";
                        do {
                            System.out.println("======================================");
                            System.out.println("   M  E  N  U   M A H A S I S W A     ");
                            System.out.println("======================================");
                            System.out.println("1. Lihat Jadwal");
                            System.out.println("2. Kerjakan Soal");
                            System.out.println("0. Keluar");
                            System.out.print("Ketik :");
                            menuMahasiswa = in.nextLine();
                            String pilihanSubMenu = "";
                            switch (menuMahasiswa) {
                                case "1"://lihat jadwal
                                    for (int i = 0; i < judulPaket.length; i++) {
                                        System.out.println((i + 1) + ". " + judulPaket[i] + ", Token : " + tokenPaket[i]);
                                    }
                                    System.out.print("Tekan Enter untuk kembali...");
                                    in.nextLine();
                                    break;
                                case "2"://kerjakan soal (soal yg dah ada)
                                    for (int i = 0; i < judulPaket.length; i++) {
                                        System.out.println((i + 1) + ". " + judulPaket[i]);
                                    }
                                    System.out.print("ketik :");
                                    pilihanSubMenu = in.nextLine();
                                    String[] soalDipilih;
                                    String[] kunciDipilih;
                                    int indeks;
                                    switch (pilihanSubMenu) {
                                        case "1": //sejarah
                                            soalDipilih = soalSejarah;
                                            kunciDipilih = kunciJawabanSejarah;
                                            indeks = 0;
                                            break;
                                        case "2": //matematika
                                            soalDipilih = soalMatematika;
                                            kunciDipilih = kunciJawabanMatematika;
                                            indeks = 1;
                                            break;
                                        case "3": //pkn
                                            soalDipilih = soalPkn;
                                            kunciDipilih = kunciJawabanPkn;
                                            indeks = 2;
                                            break;
                                        default:
                                            System.out.println("INPUTAN INVALID!!!");
                                            continue;
                                    }
                                    System.out.println("Masukkan Token :");
                                    String cekToken = in.nextLine();
                                    if (cekToken.equals(tokenPaket[indeks])) {
                                        poin = 0; //reset poin tiap mulai kuis
                                        for (int i = 0; i < soalDipilih.length; i++) {
                                            System.out.println(soalDipilih[i]);
                                            System.out.print("Pilihan Anda: ");
                                            pilihan = in.nextLine();

                                            if (pilihan.equalsIgnoreCase(kunciDipilih[i])) {
                                                System.out.println("Benar!");
                                                poin += 1;
                                            } else {
                                                System.out.println("Salah!");
                                            }
                                            System.out.println();
                                        }
                                        int nilai = (poin * 100) / soalDipilih.length;
                                        System.out.println("Jumlah jawaban benar: " + poin);
                                        System.out.println("Nilai: " + nilai);
                                    } else {
                                        System.out.println("Token salah!");
                                    }
                                    break;
                                case "0"://keluar
                                    break;
                                default:
                                    System.out.println("Pilihan invalid");
                            }
                        } while (!menuMahasiswa.equals("0"));
                    }
                    break;

                case "2"://dosen
                    System.out.print("Masukkan Nama Dosen : ");
                    namaLogin = in.nextLine();
                    System.out.print("Masukkan Password Dosen : ");
                    String passwordLogin = in.nextLine();
                    statusLogin = false;
                    //cek valid
                    for (String listDosen1 : listDosen) {
                        if (namaLogin.equalsIgnoreCase(listDosen1) && passwordLogin.equals(passwordDosen)) {
                            statusLogin = true;
                            System.out.println("Login Berhasil");
                            break;
                        }
                    }
                    if (statusLogin == false) {
                        System.out.println("Nama dosen tidak terdaftar atau password salah");
                    }

                    if (statusLogin == true) {
                        String menuDosen = "";
                        do {
                            System.out.println("======================================");
                            System.out.println("      M  E  N  U   D  O  S  E  N      ");
                            System.out.println("======================================");
                            System.out.println("1. Edit Soal");
                            System.out.println("2. Edit Token");
                            System.out.println("3. Edit Peserta");
                            System.out.println("0. Keluar");
                            System.out.print("Ketik : ");
                            menuDosen = in.nextLine();

                            switch (menuDosen) {
                                case "1": { //edit soal
                                    for (int i = 0; i < judulPaket.length; i++) {
                                        System.out.println((i + 1) + ". " + judulPaket[i]);
                                    }
                                    System.out.print("Ketik : ");
                                    String pilihanEdit = in.nextLine();

                                    String[] soalDipilih;
                                    String[] kunciDipilih;
                                    switch (pilihanEdit) {
                                        case "1":
                                            soalDipilih = soalSejarah;
                                            kunciDipilih = kunciJawabanSejarah;
                                            break;
                                        case "2":
                                            soalDipilih = soalMatematika;
                                            kunciDipilih = kunciJawabanMatematika;
                                            break;
                                        case "3":
                                            soalDipilih = soalPkn;
                                            kunciDipilih = kunciJawabanPkn;
                                            break;
                                        default:
                                            soalDipilih = null;
                                            kunciDipilih = null;
                                    }
                                    if (soalDipilih == null) {
                                        System.out.println("Paket soal tidak tersedia.");
                                        break;
                                    }

                                    System.out.println("Soal dan Opsi:");
                                    for (String soal : soalDipilih) {
                                        System.out.println(soal + "\n");
                                    }
                                    System.out.print("Nomor soal yang diganti: ");
                                    String noTeks = in.nextLine();
                                    int no = 0;
                                    for (int i = 1; i <= soalDipilih.length; i++) {
                                        if (noTeks.equals(i + "")) {
                                            no = i;
                                        }
                                    }
                                    if (no == 0) {
                                        System.out.println("Nomor soal tidak valid");
                                        break;
                                    }

                                    System.out.print("Teks soal : ");
                                    String teks = in.nextLine();
                                    System.out.print("Opsi A : ");
                                    String a = in.nextLine();
                                    System.out.print("Opsi B : ");
                                    String b = in.nextLine();
                                    System.out.print("Opsi C : ");
                                    String c = in.nextLine();
                                    System.out.print("Kunci jawaban (A/B/C) : ");
                                    String kunci = in.nextLine();
                                    if (!kunci.equalsIgnoreCase("A") && !kunci.equalsIgnoreCase("B") && !kunci.equalsIgnoreCase("C")) {
                                        System.out.println("Kunci harus A, B, atau C. Perubahan dibatalkan");
                                        break;
                                    }

                                    soalDipilih[no - 1] = no + ". " + teks + " \nA. " + a + " \nB. " + b + " \nC. " + c;
                                    kunciDipilih[no - 1] = kunci;
                                    System.out.println("Soal berhasil diganti");
                                    break;
                                }
                                case "2": { //edit token
                                    for (int i = 0; i < judulPaket.length; i++) {
                                        System.out.println((i + 1) + ". " + judulPaket[i] + ", Token : " + tokenPaket[i]);
                                    }
                                    System.out.print("Pilih paket : ");
                                    String paketTeks = in.nextLine();
                                    int pilihanToken = 0;
                                    for (int i = 1; i <= tokenPaket.length; i++) {
                                        if (paketTeks.equals(i + "")) {
                                            pilihanToken = i;
                                        }
                                    }
                                    if (pilihanToken == 0) {
                                        System.out.println("Pilihan paket tidak valid");
                                        break;
                                    }

                                    System.out.print("Token baru (kosongkan untuk batal) : ");
                                    String tokenBaru = in.nextLine();
                                    if (tokenBaru.equals("")) {
                                        System.out.println("Dibatalkan");
                                        break;
                                    }

                                    boolean kembar = false;
                                    for (int i = 0; i < tokenPaket.length; i++) {
                                        if (i != pilihanToken - 1 && tokenPaket[i].equals(tokenBaru)) {
                                            kembar = true;
                                        }
                                    }
                                    if (kembar) {
                                        System.out.println("Token sudah dipakai paket lain");
                                        break;
                                    }

                                    tokenPaket[pilihanToken - 1] = tokenBaru;
                                    System.out.println("Token berhasil diganti");
                                    break;
                                }
                                case "3": { //edit peserta
                                    for (int m = 0; m < listMahasiswa.length; m++) {
                                        System.out.println((m + 1) + ". " + listMahasiswa[m]);
                                    }
                                    System.out.print("Pilih nomor peserta : ");
                                    String mhsTeks = in.nextLine();
                                    int pilihanMhs = 0;
                                    for (int i = 1; i <= listMahasiswa.length; i++) {
                                        if (mhsTeks.equals(i + "")) {
                                            pilihanMhs = i;
                                        }
                                    }
                                    if (pilihanMhs == 0) {
                                        System.out.println("Nomor peserta tidak valid");
                                        break;
                                    }

                                    System.out.print("Nama baru (kosongkan untuk batal) : ");
                                    String namaBaru = in.nextLine();
                                    if (namaBaru.equals("")) {
                                        System.out.println("Dibatalkan");
                                        break;
                                    }

                                    listMahasiswa[pilihanMhs - 1] = namaBaru;
                                    System.out.println("Peserta berhasil diganti");
                                    break;
                                }
                                case "0"://keluar
                                    System.out.println("Keluar dari menu dosen");
                                    break;
                                default:
                                    System.out.println("Pilihan invalid");
                            }
                        } while (!menuDosen.equals("0"));
                    }
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Input invalid.");
            }
        } while (!pilihanMenu.equals("0"));
    }
}
