/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ltd.dh24it02demo;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai01 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n =(int) (Math.random() * 100);
         int doan;
         System.out.println("Doan so tu 1 den 100:"); 
         
         do{
             System.out.print("Nhap so ban muon doan: ");
             doan = sc.nextInt();
             if (doan > n){
                 System.out.println("Lon hon");
             }
             else if(doan < n){
                 System.out.println("Nho hon");     
            }
             else {
                  System.out.println("Chinh xac");
             }
             
         }while(doan != n);
    }
}
