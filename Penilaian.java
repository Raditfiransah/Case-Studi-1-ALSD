public class Penilaian {
    // Variabel
    Mahasiswa mahasiswa;
    MataKuliah matkul;
    double nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;

    // Constructor
    public Penilaian(){}
    public Penilaian(Mahasiswa mahasiswa, MataKuliah matkul, double nilaiTugas, double nilaiUts, double nilaiUas) {
        this.mahasiswa = mahasiswa;
        this.matkul = matkul;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }

    // Method Hitung Nilai Akhir
    public double hitungNilaiAkhir() {
        return (0.3 * nilaiTugas) + (0.3 * nilaiUts) + (0.4 * nilaiUas);
    }

    //Tampil Nilai Akhir
    public void tampilPenilaian() {
        System.out.println("Mata Kuliah: " + matkul.nama);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
    }
}
