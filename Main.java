import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        // Instansiasi Objek Mahasiswa
        Mahasiswa[] listMahasiswa = {
            new Mahasiswa("22001", "Ali Rahman", "Teknik Informatika"),
            new Mahasiswa("22002", "Budi Santoso", "Teknik Informatika"),    
            new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
            
        };
        // Instansiasi objek MataKuliah
        MataKuliah[] listMataKuliah = {
            new MataKuliah("MK001", "Struktur Data", 3),
            new MataKuliah("MK002", "Basis Data", 3),
            new MataKuliah("MK003", "Desain Web", 3)
        };
        // Instansiasi Objek Penilaian
        Penilaian[] listPenilaian = {
            new Penilaian(listMahasiswa[0], listMataKuliah[0], 80, 85, 90),
            new Penilaian(listMahasiswa[0], listMataKuliah[1], 60, 75, 70),
            new Penilaian(listMahasiswa[1], listMataKuliah[0], 75, 70, 80),
            new Penilaian(listMahasiswa[2], listMataKuliah[1], 85, 90, 95),
            new Penilaian(listMahasiswa[2], listMataKuliah[2], 80, 90, 65)
        };
        // Variabel untuk menampung pilihan menu
        int pilihan = 0;
        
        // Looping menu
        do{
            System.out.println("\n== MENU SISTEM AKADEMIK ==");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Bersarta Nilai Akhir");
            System.out.println("5. Cari Mahasiswa berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih (1-5): ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1: // Tampilkan Daftar Mahasiswa
                    for (Mahasiswa mahasiswa : listMahasiswa) {
                        mahasiswa.tampilMahasiswa();
                    }
                    break;

                case 2: // Tampilkan Daftar Mata Kuliah
                    for (MataKuliah matkul : listMataKuliah) {
                        matkul.tampilMataKuliah();
                    }
                    break;

                case 3: // Tampilkan Data Penilaian
                    for (Penilaian penilaian : listPenilaian) {
                        penilaian.tampilPenilaian();
                        System.out.println("----------------------");
                    }
                    break;

                case 4: // Urutkan Mahasiswa berdasarkan Nilai Akhir
                    // Algoaritma Bubble Sort
                    for (int i = 0; i < listPenilaian.length - 1; i++) {
                        for (int j = 0; j < listPenilaian.length - i - 1; j++) {
                            if (listPenilaian[j].hitungNilaiAkhir() < listPenilaian[j + 1].hitungNilaiAkhir()) {
                                Penilaian temp = listPenilaian[j];
                                listPenilaian[j] = listPenilaian[j + 1];
                                listPenilaian[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("Data setelah diurutkan:");
                    for (Penilaian penilaian : listPenilaian) {
                        System.out.println(penilaian.mahasiswa.nama + " | " + penilaian.matkul.nama + " | Nilai Akhir: " + penilaian.hitungNilaiAkhir());
                    }
                    break;

                case 5: // Cari Mahasiswa berdasarkan NIM
                    System.out.println();
                    System.out.println("== PENCARIAN MAHASISWA ==");
                    System.out.print("Masukkan NIM yang dicari: ");
                    String cari = input.nextLine();
                    boolean ketemu = false;
                    for (Mahasiswa m : listMahasiswa) {
                        if (m.nim.equalsIgnoreCase(cari)) {
                            m.tampilMahasiswa();
                            ketemu = true;
                            break;
                        }
                    }
                    if (!ketemu) {
                        System.out.println("Mahasiswa Tidak Ditemukan!");
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan nggak valid, coba lagi!");
            }
        }while(pilihan != 0); // Jika pilihan 0, keluar dari menu

        input.close(); // Tutup scanner
    }
} 
