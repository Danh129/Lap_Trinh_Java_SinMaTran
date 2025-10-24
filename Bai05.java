/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ltd.dh24it02demo;

/**
 *
 * @author admin
 */
public class Bai05 {
    public static int[][] randomMaTran(int m, int n) {
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
        return a;
    }
    public static void xuatMaTran(int[][] a, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
    }
    public static long tinhTongCot(int[][] a, int n) {
        long sum = 0;
        for (int i = 0; i < a[n].length; i++) {
            sum += a[i][n];
        }
        return sum;
    }
    public static long tinhTongDong(int[][] a, int m) {
        long sum = 0;
        for (int j = 0; j < a[m].length; j++) {
            sum += a[m][j];
        }
        return sum;
    }
    public static int timGiaTriNhoNhatDong(int[][] a, int m) {
        int min = a[m][0];
        for (int j = 1; j < a[m].length; j++) {
            if (a[m][j] < min) min = a[m][j];
        }
        return min;
    }
    public static int timGiaTriLonNhatDong(int[][] a, int m) {
        int max = a[m][0];
        for (int j = 1; j < a[m].length; j++) {
            if (a[m][j] > max) max = a[m][j];
        }
        return max;
    }
    public static int timGiaTriLonNhatCot(int[][] a, int n) {
        int max = a[0][n];
        for (int i = 1; i < a.length; i++) {
            if (a[i][n] > max) max = a[i][n];
        }
        return max;
    }
    public static int timGiaTriNhoNhatCot(int[][] a, int n) {
        int min = a[0][n];
        for (int i = 1; i < a.length; i++) {
            if (a[i][n] < min) min = a[i][n];
        }
        return min;
    }
    public static void main(String[] args) {
        int m = 3, n = 3;
        int[][] a = randomMaTran(m, n);

        xuatMaTran(a, m, n);
        System.out.println("Tong cot 1 = " + tinhTongCot(a, 1));
        System.out.println("Tong dong 1 = " + tinhTongDong(a, 1));
        System.out.println("Gia tri nho nhat dong 1 = " + timGiaTriNhoNhatDong(a, 1));
        System.out.println("Gia tri lon nhat dong 1 = " + timGiaTriLonNhatDong(a, 1));
        System.out.println("Gia tri lon nhat cot 1 = " + timGiaTriLonNhatCot(a, 1));
        System.out.println("Gia ri nho nhat cot 1 = " + timGiaTriNhoNhatCot(a, 1));
    }
}


