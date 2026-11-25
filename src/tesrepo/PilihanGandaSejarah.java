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
        String[] soalMatematika = {};
        String[] KunciJawabanMatematika = {"A", "B", "C", "B", "A"};
        String[] soalPkn = {};
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
                                    switch (pilihanSubMenu) {
                                        case 1: //sejarah
                                            System.out.println("Masukkan Token :");
                                            String cekToken = in.nextLine();
                                            if (cekToken.equals(tokenPaket[0])){
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
                                            break;
                                        case 2 : // matematika
                                            System.out.println("Masukkan Token");
                                            break;
                                        case 3 : // pkn
                                            break;
                                        default:
                                            System.out.println("INPUTAN INVALID!!!");
                                    }
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
