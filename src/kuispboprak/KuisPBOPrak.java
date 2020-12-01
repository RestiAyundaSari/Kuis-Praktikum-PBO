/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispboprak;
import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KuisPBOPrak {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Form Pedaftaran PT.UDIN  ");
            System.out.println("1. Android Development");
            System.out.println("2. Web Development");
            System.out.print("PILIH : ");
            char pilih = scanner.next().charAt(0);
            
            switch (pilih){
                case '1':
                    Andro();
                    break;
                case '2':
                    Web();
                    break;
                default:
                    exit(0);
                    break;
                    
    }
    
}
    
    static void Web(){
            int tesTulis, tesCoding, tesWawancara;
            String nama,nik;
            Scanner scanner = new Scanner(System.in);
            System.out.println("FORM INPUT DATA");
            System.out.print("Nik  Pendaftar         = ");
            nik = scanner.nextLine();
            System.out.print("Nama Pendaftar         = ");
            nama = scanner.nextLine();
            System.out.print("Nilai Ujian Tulis      = ");
            tesTulis = scanner.nextInt();
            System.out.print("Nilai Ujian Coding     = ");
            tesCoding = scanner.nextInt();
            System.out.print("Nilai Ujian Wawancara  = ");
            tesWawancara = scanner.nextInt();
            
           Pendaftaran daftar = new Pendaftaran(tesTulis, tesCoding, tesWawancara,  nama, nik);
           while(true){
            System.out.println("Menu");
            System.out.println("1. Edit");
            System.out.println("2. Tampil");
            System.out.println("3. Exit");
            System.out.print("PILIH : ");
            char menu2 = scanner.next().charAt(0);
            switch (menu2){
                case '1' :
            System.out.println("FORM EDIT DATA");
            System.out.print("Nilai Ujian Tulis      = ");
            daftar.tesTulis = scanner.nextInt();
            System.out.print("Nilai Ujian Coding     = ");
            daftar.tesCoding = scanner.nextInt();
            System.out.print("Nilai Ujian Wawancara  = ");
            daftar.tesWawancara = scanner.nextInt();
                    break;
                case '2':
                    daftar.showDetailWeb();
                    break;
                 default:
                    exit(0);
                    break;             
         }

       }
   }
    
    
     static void Andro(){
            int tesTulis, tesCoding, tesWawancara;
            String nama,nik;
            Scanner scanner = new Scanner(System.in);
            System.out.println("FORM INPUT DATA");
            System.out.print("Nik  Pendaftar         = ");
            nik = scanner.nextLine();
            System.out.print("Nama Pendaftar         = ");
            nama = scanner.nextLine();
            System.out.print("Nilai Ujian Tulis      = ");
            tesTulis = scanner.nextInt();
            System.out.print("Nilai Ujian Coding     = ");
            tesCoding = scanner.nextInt();
            System.out.print("Nilai Ujian Wawancara  = ");
            tesWawancara = scanner.nextInt();
            
           Pendaftaran daftar = new Pendaftaran(tesTulis, tesCoding, tesWawancara,  nama, nik);
           while(true){
            System.out.println("Menu ");
            System.out.println("1. Edit");
            System.out.println("2. Tampil");
            System.out.println("3. Exit");
            System.out.print("PILIH : ");
            char menu2 = scanner.next().charAt(0);
            switch (menu2){
                case '1' :
            System.out.println("FORM EDIT DATA");
            System.out.print("Nilai Ujian Tulis      = ");
            daftar.tesTulis = scanner.nextInt();
            System.out.print("Nilai Ujian Coding     = ");
            daftar.tesCoding = scanner.nextInt();
            System.out.print("Nilai Ujian Wawancara  = ");
            daftar.tesWawancara = scanner.nextInt();
                    break;  
                case '2':
                    daftar.showDetailAndro();
                    break;
                default:
                    exit(0);
                    break;             
         }

       }       
           
     }
}