/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan Gaji Pegawai
 */
package pboif2.pkg10119059.latihan43.gajipegawai;
/**
 *
 * @author Corazon
 */
public class GajiPegawai {
    private String nama;
    private String alamat;
    private int uangTunjangan, uangTransport, gajiPokok, totalGaji;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
    return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public int getUangTransport() {
        return uangTransport;
    }
    
    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }
    
    public int getUangTunjangan(){
        return uangTunjangan;
    }
    
    public void setUangTunjangan(int uangTunjangan){
        this.uangTunjangan = uangTunjangan;
    }
    
    public int getGajiPokok(){
        return gajiPokok;
    }
    
    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    
    public int getTotalGaji(){
    return totalGaji;
    }
    
    public void setTotalGaji(int totalGaji){
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        return uangTunjangan + uangTransport + gajiPokok;
    }
    
    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji){
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        System.out.println("Nama Karyawan  : " +nama) ;
        System.out.println("Alamat         : " +alamat);
        System.out.println("Uang Transport : " +uangTransport);
        System.out.println("Uang Tunjangan : " +uangTunjangan);
        System.out.println("Gaji Pokok     : " +gajiPokok);
        System.out.println("Total Gaji     : " +totalGaji);
    }
}
