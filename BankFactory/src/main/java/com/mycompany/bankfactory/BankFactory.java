/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bankfactory;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BankFactory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k;
        do {
            System.out.printf("\n1: VPBank\n"
                    + "2: VietcomBanl\n"
                    + "3: Finish\nInput ");
            k = sc.nextInt();
            switch (k) {
                case 1:
                    TPBank tp = new TPBank();
                    System.out.println(tp.getBankName());
                    break;
                case 2:
                    VietcomBank vc = new VietcomBank();
                    System.out.println(vc.getBankName());
                    break;
                case 3:
            }
        } while (k != 3);
    }
}
