/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispboprak;

public class Pendaftaran extends CalonPelamar implements TahapSeleksi{
     int tesTulis;
     int tesWawancara;
     int tesCoding;

    public Pendaftaran(int tesTulis, int tesCoding, int tesWawancara, String nama, String nik) {
        super(nama, nik);
        this.tesTulis = tesTulis;
        this.tesWawancara = tesWawancara;
        this.tesCoding = tesCoding;
    }

    public Pendaftaran() {
        super();
        this.tesTulis = 0;
        this.tesWawancara = 0;
        this.tesCoding = 0;
    }

    @Override
    public double nilaiAkhirWeb() {
        return (0.4 * tesTulis)+(0.35 * tesCoding)+(0.25 * tesWawancara);
        
    }

    @Override
    public double nilaiAkhirAndroid() {
       return (0.2 *tesTulis)+ (0.5 * tesCoding)+ (0.3 * tesWawancara); 
    }
    
    String kategori(){
        String kategori;
        kategori = "";
        if (nilaiAkhirAndroid() >=85){
               kategori = "LOLOS ";
        }
        else {
               kategori = "GAGAL ";
        }
        return kategori;
    }
    
    @Override
    public void showDetailAndro(){
        System.out.println("Nilai Akhir     : " + nilaiAkhirAndroid());
        System.out.println("Kategori        : " + kategori());
         if (nilaiAkhirAndroid() >=85){
               System.out.print("Selamat kepada " + super.getNama());
               System.out.println(" Lolos seleksi Android");
        }
        else {
               System.out.print("Maaf kepada " + super.getNama());
               System.out.println(" Gagal seleksi Android");
        }
    }

    @Override
    public void showDetailWeb(){
        System.out.println("Nilai Akhir     : " + nilaiAkhirWeb());
        System.out.println("Kategori        : " + kategori());
         if (nilaiAkhirAndroid() >=85){
               System.out.print("Selamat kepada " + super.getNama());
               System.out.println(" Lolos seleksi Web dev");
        }
        else {
               System.out.print("Maaf kepada " + super.getNama());
               System.out.println(" Gagal seleksi Web dev");
        }
    }

}
