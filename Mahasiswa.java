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
    
    // Tampil data
    void tampilMahasiswa(){
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
    }
}
