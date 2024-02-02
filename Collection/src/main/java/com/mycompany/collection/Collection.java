/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.collection;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Collection {

    private static HashMap<String, String> map = new HashMap<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        map.put("Majestic", "Hung vi");
        map.put("Mystery", "Bi an");
        map.put("Gorgeous", "Long lay");
        map.put("Cucious", "To mo");
        map.put("Command", "Yeu cau");
        map.put("Disappointed", "That vong");
        map.put("Immense", "Bao la");
        map.put("Picturesque", "Dep nhu tranh ve");
        map.put("Broad-minded", "Thong suot");
        map.put("Translucent", "Trong suot");
        String word;
        int menu;
        Collection wordfind = new Collection();
        do {
            System.out.printf("\n1: Check if a word exists in the dictionary\n"
                    + "2: Find the meaning of a word\n"
                    + "3: Finish\nInput ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    wordfind.exist();
                    break;
                case 2:
                    wordfind.meaning();
                    break;
                case 3:

            }
        } while (menu != 3);
    }

    public void exist() {
        System.out.println("Enter the word: ");
        String word = sc.next();
        if (!map.containsKey(word)) {
            System.out.println("The word does not exist");
        } else {
            System.out.println("The word exist");
        }
    }
    public void meaning()
    {
        System.out.println("Enter the word: ");
        String word = sc.next();
        if(map.containsKey(word)){
            String a = map.get(word);
            System.out.println(a);
        }
    }

}
