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
public class Bai02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap bac cua da thuc: ");
        int n = sc.nextInt();
        int[] a =  new int[n+1];
        System.out.println("Nhap: ");
        for(int i =0; i <= n; i++){
            System.out.println("a" + i + "=");
            a[i] = sc.nextInt();
        }
        System.out.println("Nhap gia tri x: ");
        int x = sc.nextInt();
        
        int kq =0;
        for(int i = 0; i <= n; i++){
            kq += a[i] * Math.pow(x, i);
        }
        System.out.println("Dap an tong :" + kq);
    }
}
