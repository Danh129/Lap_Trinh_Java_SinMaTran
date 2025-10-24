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
public class Bai03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap email:" );
        String email = sc.nextLine();
        int vt = email.indexOf('@');
        if(vt != -1){
            String tenEmail = email.substring(0, vt);
            System.out.println(" ket qua la: " + tenEmail);
    }else{
            System.out.println("Khong hop le");
            }
        
     System.out.print("Nhap chuoi: ");
     String chuoi = sc.nextLine();
     
     int dem =0 ;
     for(int i = 0; i < chuoi.length();i++){
         char c = chuoi.charAt(i);
         if(Character.isUpperCase(c));
         dem++;
     }
     System.out.print("Ket qua la:" + dem);
    }
}
