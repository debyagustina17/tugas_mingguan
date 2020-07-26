/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1955201148debyagustinatugasmingguan;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class array_1_dimensi {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      int SLN[] = new int [3];
      int SLL[] = new int [3];
      int SLM[] = new int [3];
      String[]mahasiswa = new String[3];
      int SA;
      //SLN= skor lomba nari, SLL= skor lomba lari
      //SLM= skor lomba melukis, SA= skor  akhir
      
      Scanner input = new Scanner (System.in);
      
      for (int i= 0; i < mahasiswa.length; i++){
          System.out.println("----------------------");
          System.out.println("Input Nama Mahasiswa Ke-" + (i+1) +" = ");
          mahasiswa [i] = input.next();
          System.out.println("----------------------");
          System.out.println(" Skor lomba nari = ");
          SLN[i] = input.nextInt();
          System.out.println(" Skor lomba lari = ");
          SLL [i] = input.nextInt();
          System.out.println(" Skor lomba melukis = ");
          SLM [i] = input.nextInt();
          System.out.println("---------------------");
          
           SA = (int) ((SLN[i]*0.2) + (SLL[i]*0.3) + (SLM[i]*0.5));
           System.out.println("Skor Akhir: " + SA);
           
      
      }
      
      
              
              
              
         }
      
    }
