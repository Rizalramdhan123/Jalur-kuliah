/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalurkuliah;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Jalurkuliah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("pilih jalur kuliah=");
        System.out.println("SBMPTN,SNMPTN,MANDIRI");
        String jalurkuliah ;
        Scanner scan =new Scanner(System.in);
        jalurkuliah=scan.next();
        
        if(jalurkuliah.equalsIgnoreCase("sbmptn")){

            String golonganpendapatan;
            System.out.println("Golongan pendapatan=");
            System.out.println("===A===");
            System.out.println("===B===");
            System.out.println("===C===");
            System.out.println("masukkan golongan pendapatan");
            golonganpendapatan=scan.next();
            
            if(golonganpendapatan.equals("A")){
                System.out.println("DSP= Rp.5.000.000");
                System.out.println("SPP= Rp.500.000");
            }else if(golonganpendapatan.equals("B")){
                System.out.println("DSP= Rp.15.000.000");
                System.out.println("SPP= Rp.1.000.000");
            }else if(golonganpendapatan.equals("C")){
                System.out.println("DSP= Rp.30.000.000");
                System.out.println("SPP= Rp.2.000.000");
            }else{
                System.out.println("anda salah memasukkan golongan pendapatan");
            }
            
        }else if(jalurkuliah.equalsIgnoreCase("snmptn")){

            String golonganpendapatan;
            System.out.println("Golongan pendapatan=");
            System.out.println("===A===");
            System.out.println("===B===");
            System.out.println("===C===");
            System.out.println("masukkan golongan pendapatan");
            golonganpendapatan=scan.next();
            
            if(golonganpendapatan.equals("A")){
                System.out.println("DSP= Rp.7.000.000");
                System.out.println("SPP= Rp.500.000");
            }else if(golonganpendapatan.equals("B")){
                System.out.println("DSP= Rp.12.000.000");
                System.out.println("SPP= Rp.1.000.000");
            }else if(golonganpendapatan.equals("C")){
                System.out.println("DSP= Rp.35.000.000");
                System.out.println("SPP= Rp.2.000.000");
            }else{
                System.out.println("anda salah memasukkan golongan pendapatan");
            }
    
        }else if(jalurkuliah.equalsIgnoreCase("mandiri")){

            String golonganpendapatan;
            System.out.println("Golongan pendapatan=");
            System.out.println("===A===");
            System.out.println("===B===");
            System.out.println("===C===");
            System.out.println("masukkan golongan pendapatan");
            golonganpendapatan=scan.next();
            
            if(golonganpendapatan.equals("A")){
                System.out.println("DSP= Rp.10.000.000");
                System.out.println("SPP= Rp.1.000.000");
            }else if(golonganpendapatan.equals("B")){
                System.out.println("DSP= Rp.25.000.000");
                System.out.println("SPP= Rp.2.000.000");
            }else if(golonganpendapatan.equals("C")){
                System.out.println("DSP= Rp.50.000.000");
                System.out.println("SPP= Rp.3.000.000");
            }else{
                System.out.println("anda salah memasukkan golongan pendapatan");
            }
        }else{
            System.out.println("maaf anda salah memasukkan jurusan");
        }
        System.out.println("terimakasih");    
    }
}
