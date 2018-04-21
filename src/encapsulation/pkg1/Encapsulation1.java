/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation.pkg1;
/**
 *
 * @author inialdan
 */
public class Encapsulation1 {
    String nama;
    int nis;
    double umur;
    
    // Variable nama;
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    // Variable nis;
    public int getNis(){
        return nis;
    }
    public void setNis(int nis){
        this.nis = nis;
    }
    
    // Variable umur;
    public double getUmur(){
        return umur;
    }
    public void setUmur(double umur){
        this.umur = umur;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Encapsulation1 kap = new Encapsulation1();
        
        kap.setNama("Aldan Rizki Santosa");
        kap.setNis(11504738);
        kap.setUmur(1.5);
        
        System.out.println("Ambil Nama = " + kap.getNama());
        int nis = kap.getNis();
        System.out.println("Ambl Nis   = " + nis);
        double umur = kap.getUmur();
        System.out.println("Ambil Umur = " + umur + " Bulan");
    }
   
}
