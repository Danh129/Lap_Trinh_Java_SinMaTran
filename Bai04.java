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
public class Bai04 {
    public static boolean lasonguyento(int n){
        if(n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n);i++){
            if(n % i == 0)
                return false;
                
            }
           return true;
        }
    public static void xuatmang(int [] a){
        for(int i = 0; i <a.length; i++)
            System.out.printf("%d\t", a[i]);
            
        for (var x : a)
            System.out.printf("%d\t", x);
        System.out.print("");
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ") ;
        for(int i = 0; i < n; i++){
            System.out.print("a[" + i + "]=");
            a[i] = sc.nextInt();
        }
        
        int tong = 0;
        for(int x : a){
            if(lasonguyento(x)){
                tong += x;
            }
        }
        System.out.println("Tong so nguyen to la: " + tong);
        
        Integer maxDuong = null;
        Integer minAm = null;
        for (int x : a) {
            if (x > 0) {
                if (maxDuong== null || x > maxDuong) 
                    maxDuong = x;
            } else if (x < 0) {
                if (minAm == null || x < minAm)
                    minAm = x;
            }
        }
        System.out.println("So duong lon nhat: ");
        if(maxDuong != null)
           System.out.print(maxDuong);
        else
           System.out.print("***");
       
        System.out.println("So am nho nhat: ");
        if(minAm != null)
           System.out.print(minAm);
        else
           System.out.print("***");
        
        Integer ntMin = null;
        for (int x : a) {
            if (lasonguyento(x)) {
                if (ntMin == null || x < ntMin) ntMin = x;
            }
        }

        System.out.print("So nguyen to nho nhat: ");
        if (ntMin != null)
            System.out.println(ntMin);
    }
}
