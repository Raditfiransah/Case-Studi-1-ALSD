public class Mahasiswa {
    // Membuat Variable 
    String nim, nama, prodi;

    // Construktor
    public Mahasiswa(){}
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    // Tampil Data Mahasiswa
    void tampilMahasiswa(){
       System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}
