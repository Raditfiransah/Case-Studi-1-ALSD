public class MataKuliah {
    // Membuat Variable 
    String kode, nama;
    int sks;
    
    // Construktor
    public MataKuliah(){}
    public MataKuliah(String kode, String nama, int sks){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }
    
    // Tampil data
    void tampilMataKuliah(){
       System.out.println("Kode: " + kode + "| Nama: " + nama + "| SKS: " + sks);
    }
}