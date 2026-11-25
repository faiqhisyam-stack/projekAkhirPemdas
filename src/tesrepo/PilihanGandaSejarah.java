package tesrepo;

import java.util.Scanner;
public class PilihanGandaSejarah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //paket soal
        String[] soal = {"1. Kapan Indonesia Merdeka? \nA. 17 Agustus 1945  \nB. 28 Oktober 1928  \nC. 30 September 1965",
            "2. Tanggal berapa hari pahlawan? \nA. 1 Juni \nB. 10 November \nC. 4 Desember",
            "3. Kapan sumpah pemuda terjadi? \nA. 17 Agustus 1945 \nB. 28 Oktober 1945 \nC. 28 Oktober 1928",
            "4. Hari Kelahiran Pancasila adalah \nA. 1 Januari 1988 \nB. 1 Juni 1945\nC. 4 November 1253",
            "5. Kapan Hari Kesaktian Pancasila? \nA. 1 Oktober 1965 \nB. 17 Agustus 2007 \nC. 13 Maret 2008"};
        String[] kunciJawaban = {"A", "B", "C", "B", "A"};
        String[] soalMatematika = {"1. Aldo pergi kepasar membeli apel 2, Dikasih lima. Berapa apel yang mbul miliki? \nA. 0 \nB. 3 \nC. 1000",
        "2.Diketahui Seekor kucing mengejar tikus yang berjarak 10 meter di depannya. Setiap 1 detik, kucing melompat sejauh 3 meter, sedangkan tikus berlari sejauh 2 meter. Berapa detik yang dibutuhkan kucing untuk menangkap tikus? \nA. 3 detik \nB. 10 detik \nC. 5 detik",
        "3. Kamu punya 1 loyang kue bulat. Kamu mengirisnya dengan 3 kali sayatan lurus tanpa memindahkan potongan kue. Berapa jumlah potongan kue maksimal yang bisa kamu dapatkan? \nA. 7 potong \nB. 8 potong \nC. 9 potong",
        "4. Dari angka 1 sampai 100, berapa kali angka 9 muncul? \nA. 9 kali \nB. 11 kali \nC. 20 kali",
        "5. Di dalam laci gelap gulita ada 10 pasang sepatu hitam dan 10 pasang sepatu putih yang tercampur acak (semua ukurannya sama). Berapa minimal sepatu yang harus kamu ambil agar pasti mendapatkan sepasang sepatu yang cocok (kiri dan kanan dengan warna yang sama)? \nA. 21 pasang \nB. 30 pasang \nC. 19 pasang "};
        String[] KunciJawabanMatematika = {"A", "B", "A", "C", "A"};
        String[] soalPkn = {"1. Dalam kedudukannya sebagai sumber dari segala sumber hukum negara, bagaimana hubungan antara Pancasila dengan pasal-pasal dalam UUD NRI Tahun 1945? \nA.Pancasila menjiwai dan dijabarkan dalam pasal-pasal UUD 1945. \nB. Pasal-pasal UUD 1945 kedudukannya lebih tinggi karena bersifat operasional. \nC. Pancasila hanya berlaku pada Pembukaan UUD 1945, sedangkan batang tubuhnya berdiri sendiri.",
        "2. Amandemen UUD NRI Tahun 1945 mengubah kedudukan Majelis Permusyawaratan Rakyat (MPR). Pernyataan manakah yang tepat mengenai kedudukan MPR setelah amandemen? \nA. MPR tetap menjadi lembaga tertinggi negara pemegang kedaulatan penuh. \nB. MPR menjadi lembaga negara yang kedudukannya sejajar dengan Presiden dan Mahkamah Konstitusi.\nC. MPR berwenang mengangkat dan memberhentikan Presiden secara langsung kapan saja.",
        "3. Seorang WNA yang telah tinggal di Indonesia selama 5 tahun berturut-turut (atau 10 tahun tidak berturut-turut) ingin mengajukan kewarganegaraan Indonesia melalui jalur naturalisasi biasa. Syarat substantif apa yang wajib ia penuhi? \nA. Memiliki surat keterangan bebas pajak dari negara asalnya saja. \nB. Menikah dengan warga negara Indonesia minimal selama 3 tahun. \nC. Dapat berbahasa Indonesia serta mengakui dasar negara Pancasila dan UUD NRI Tahun 1945.",
        "4. Dalam pembagian kekuasaan secara horizontal di Indonesia pasca-amandemen UUD 1945, Badan Pemeriksa Keuangan (BPK) menjalankan kekuasaan... \nA. Konstitutif \nB. Eksaminatif \nC.Yudikatif",
        "5. Pelimpahan sebagian urusan pemerintahan yang menjadi kewenangan Pemerintah Pusat kepada Gubernur sebagai wakil Pemerintah Pusat dan/atau kepada instansi vertikal di wilayah tertentu disebut asas... \nA. Dekonsentrasi \nB. Desentralisasi \nC. Tugas pembantuan"};
        String[] KunciJawabanPkn = {"A", "B", "C", "B", "A"};
        //array judul soal (berurutan)
        String[] judulPaket={
            "Paket Soal Sejarah", "Paket Soal Matematika", "Paket Soal Pkn"
        };
        //Token Soal (berurutan)
        String[] tokenPaket={
            "ABCDEG","QWERTY","FGHJKL"
        };
        
        //List Mahasiswa
        String [] listMahasiswa={
            "Adi","Edo","Lani","Siti"
        };
        
        //List Dosen
        String[] listDosen={
          "Ali","Raib","Seli","Gill"  
        };
        String passwordDosen="12345678";
        
        String pilihan = "";
        int poin = 0;

        // Header
        System.out.println("======================================");
        System.out.println("      SOAL PILIHAN GANDA SEJARAH");
        System.out.println("======================================");
        //System.out.println("  Jumlah soal : " + soal.length + "\n");
        
        //menu
        int pilihanMenu=3;
        
        do{//loop menu (yg diatasi : apabila login gagal kembali ke sini
        System.out.println("======================================");
        System.out.println("              M  E  N  U              ");
        System.out.println("======================================");
        System.out.println("1. Login Mahasiswa");
        System.out.println("2. Login Dosen");
        System.out.println("0. Keluar");
        System.out.print("Ketik :");
        pilihanMenu=in.nextInt();
        in.nextLine();
        switch(pilihanMenu){
            case 1://mahasiswa
                System.out.println("Masukkan Nama :");
                String namaLogin=in.nextLine();
                boolean statusLogin=false;
                //cek valid
                        for (String listMahasiswa1 : listMahasiswa) {
                            if (namaLogin.equalsIgnoreCase(listMahasiswa1)) {
                                statusLogin=true;
                                System.out.println("Login Berhasil");
                                break;
                            }
                        }
                            if(statusLogin==false){
                            System.out.println("Nama mahasiswa tidak terdaftar");
                            }
                    
                    if (statusLogin==true){
                        /* Next menu mahasiswa:
                        cek jadwal
                            ->Mapel + token
                        Kerjakan soal
                            ->input token
                        */
                        do{
                        System.out.println("======================================");
                        System.out.println("   M  E  N  U   M A H A S I S W A     ");
                        System.out.println("======================================");
                        System.out.println("1. Lihat Jadwal");
                        System.out.println("2. Kerjakan Soal");
                        System.out.println("0. Keluar");
                        System.out.print("Ketik :");
                        pilihanMenu=in.nextInt();
                            switch(pilihanMenu){
                                case 1://lihat jadwal
                                int pilihanSubMenu;
                                do{
                                    for(int i=0;i<judulPaket.length;i++){
                                        System.out.println((i+1)+". "+judulPaket[i]+", Token : "+tokenPaket[i]);
                                    }
                                    System.out.println("0. Kembali");
                                    System.out.println("ketik :");
                                    pilihanSubMenu =in.nextInt();
                                }while(pilihanSubMenu !=0);
                                break;
                                case 2://kerjakan soal (soal yg dah ada)
                        
                                for(int i=0;i<judulPaket.length;i++) {
                                    System.out.println((i+1)+ ". " + judulPaket[i]);
                                }
                                System.out.println("ketik :");
                                pilihanSubMenu = in.nextInt();
                                in.nextLine();
                                String[] soalDipilih;
                                String[] kunciDipilih;
                                       switch (pilihanSubMenu) {
                                           case 1: //sejarah
                                               soalDipilih = soal;
                                               kunciDipilih = kunciJawaban;
                                               break;
                                           case 2: //matematika
                                               soalDipilih = soalMatematika;
                                               kunciDipilih = KunciJawabanMatematika;
                                               break;
                                           case 3: //pkn
                                               soalDipilih = soalPkn;
                                               kunciDipilih = KunciJawabanPkn;
                                               break;
                                           default:
                                               System.out.println("INPUTAN INVALID!!!");
                                               continue;
                                       }
                                       System.out.println("Masukkan Token :");
                                       String cekToken = in.nextLine();
                                       if (cekToken.equals(tokenPaket[pilihanSubMenu - 1])) {
                                           poin = 0; //reset poin tiap mulai kuis
                                           for (int i = 0; i < soalDipilih.length; i++) {
                                               System.out.println(soalDipilih[i]);
                                               System.out.print("Pilihan Anda: ");
                                               pilihan = in.next();

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
                                       /*switch pilih soal
                                       ...
                                       */
                                    /*switch pilih soal
                                    1. Sejarah
                                    2. Matematika
                                    3. Pkn
                                    
                                    Setiap case cek token
                                    jika token benar lanjut pengerjaan soal
                                    jika token salah:
                                    -print pesan salah
                                    -keluar (pilihanSubMenu)
                                    */
                                    break;
                                case 0://keluar
                                    break;
                                default:
                                    System.out.println("Pilihan invalid");
                            }
                        }while(pilihanMenu!=0);
                    }
                break;

            case 2://dosen
                System.out.println("Masukkan Nama Dosen :");
                namaLogin=in.nextLine();
                System.out.println("Masukkan Password Dosen :");
                String passwordLogin=in.nextLine();
                statusLogin=false;
                //cek valid
                        for (String listDosen1 : listDosen) {
                            if (namaLogin.equalsIgnoreCase(listDosen1)&&passwordLogin.equals(passwordDosen)) {
                                statusLogin=true;
                                System.out.println("Login Berhasil");
                                break;
                            }
                        }
                            if(statusLogin==false){
                            System.out.println("Nama dosen tidak terdaftar atau password salah");
                            }
                    
                    if (statusLogin==true){
                        /* Next menu dosen:
                        edit soal
                            ->Mapel
                        edit peserta
                            ->edit array list mahasiswa
                        */
                        do{
                        System.out.println("======================================");
                        System.out.println("      M  E  N  U   D  O  S  E  N      ");
                        System.out.println("======================================");
                        System.out.println("1. Edit Soal");
                        System.out.println("2. Edit Token");
                        System.out.println("2. Edit Peserta");
                        System.out.println("0. Keluar");
                        System.out.print("Ketik :");
                        pilihanMenu=in.nextInt();
                            switch(pilihanMenu){
                                case 1://edit soal
                                    /*
                                    Cetak daftar soal
                                    switch case pilihan soal
                                    1. Sejarah
                                    2. Matematika
                                    3. Pkn
                                    
                                    Setiap case, tampilkan semua soal dalam paket (indeks+1 = nomor soal)
                                    tampilkan format penggantian soal
                                    [soal]\n[A. opsi a]\n[B. opsi B]\n[C. Opsi C]
                                    pilih indeks untuk diganti
                                    */
                                    break;
                                case 2://edit token
                                    /*
                                    switch pilihan paket soal
                                    1. Sejarah
                                    2. Matematika
                                    3. Pkn
                                    
                                    Setiap case langsung merujuk pada indeks array token
                                    -input token baru
                                    -assignment token baru ke token lama
                                    */
                                    break;
                                case 3:
                                    /*
                                    switch pilihan paket soal
                                    1. Sejarah
                                    2. Matematika
                                    3. Pkn
                                    
                                    setiap case tampilkan semua peserta
                                    pilih indeks untuk di re assignment
                                    */
                                    break;
                                case 0://keluar
                                    break;
                                default:
                                    System.out.println("Pilihan invalid");
                            }
                        }while(pilihanMenu!=0);
                        }
                break;
                default:
        }
        }while(pilihanMenu !=0);
        /*
        case 1
        input username
        cek username
        valid -> lanjut
        invalid -> print nama tidak ada
                   lalu ulang login
        
        case 2
        input usndosen
        cek usndosen
        valid -> dosen pengampu
        invalid -> bukan dosen pengampu
        input pw khusus dosen (bukan per dosen)
        true -> masuk
        else -> ulang
        
        
        
        */
        int menu = in.nextInt();

        
    }
}
