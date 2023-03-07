/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class sapxep_va_timkiem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // sap xep mang bang Bubble Sort
        int[] mang = {1, 4, 8, 6, 8, 3};
        int n = mang.length;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (mang[i] > mang[j]) {
                    int temp = mang[i];
                    mang[i] = mang[j];
                    mang[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(mang));
        
        // tim kiem phan tu trong mang
        int m = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (mang[i] == m) {
                a.add(mang[i]);
                System.out.println(m + " được tìm thấy tại vị trí " + i);
                System.out.println(a.toString());
            }
        }
    }
}
    
  
        
    

