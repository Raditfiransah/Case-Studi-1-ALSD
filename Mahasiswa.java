public class Mahasiswa {
    String nim, nama, prodi;

    public Mahasiswa(){}
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    void tampilMahasiswa(){
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
    }
}
