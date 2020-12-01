/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispboprak;

/**
 *
 * @author DELL
 */
public class CalonPelamar {
    private String nama;
    private String nik;

    public CalonPelamar(String nama, String nik) {
        this.nama = nama;
        this.nik = nik;
    }
    
    public CalonPelamar(){
        this.nama = "";
        this.nik = "";
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
    
    
}
