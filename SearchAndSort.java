public class SearchAndSort {
    static void bubbleSort (Penilaian[] listPenilaian) {
        // Bubble Sort dari terbesar ke terkecil (DECSENDING)
        for (int i = 0; i < listPenilaian.length - 1; i++) {
            for (int j = 0; j < listPenilaian.length - i - 1; j++) {
                if (listPenilaian[j].hitungNilaiAkhir() < listPenilaian[j + 1].hitungNilaiAkhir()) {
                    Penilaian temp = listPenilaian[j];
                    listPenilaian[j] = listPenilaian[j + 1];
                    listPenilaian[j + 1] = temp;
                }
            }
        }
        // Tampilkan data setelah diurutkan
        System.out.println("Data setelah diurutkan:");
        for (Penilaian p : listPenilaian) {
            System.out.println(p.mahasiswa.nama + " | " + p.matkul.nama + " | Nilai Akhir: " + p.hitungNilaiAkhir());
        }
    }

    // Cari Mahasiswa berdasarkan NIM
    static void cariNim(Mahasiswa[] listMahasiswa, String cariNim) {
        boolean ketemu = false;
        for (Mahasiswa m : listMahasiswa) {
            if (m.nim.equalsIgnoreCase(cariNim)) {
                m.tampilMahasiswa();
                ketemu = true;
                break;
            }
        }

        if (!ketemu) { // jika tidak ditemukan
            System.out.println("Mahasiswa Tidak Ditemukan!");
        }
    }
}
