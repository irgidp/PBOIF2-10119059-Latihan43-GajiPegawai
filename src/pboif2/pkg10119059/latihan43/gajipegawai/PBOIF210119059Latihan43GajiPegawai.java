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
public class PBOIF210119059Latihan43GajiPegawai {

    public static void main(String[] args) {
        GajiPegawai gaji = new GajiPegawai();
        
        gaji.setNama("Rizki Adam Kurniawan");
        gaji.setAlamat("Jalan Semar Dlm 4 No.72/66");
        gaji.setUangTransport(250000);
        gaji.setUangTunjangan(300000);
        gaji.setGajiPokok(4500000);
        gaji.tampilData(gaji.getNama(), gaji.getAlamat(), gaji.getUangTunjangan(), 
                gaji.getUangTransport(), gaji.getGajiPokok(), gaji.totalGaji(gaji.getUangTunjangan(), gaji.getUangTransport(), gaji.getGajiPokok()));
    }
    
}
