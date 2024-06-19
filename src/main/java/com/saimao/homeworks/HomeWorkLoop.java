package com.saimao.homeworks;

import java.util.Scanner;

/*

input - 5
*
**
***
****
*****

input - 3
*
**
***

input - 1
*

 */
public class HomeWorkLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input - ");
        int level = sc.nextInt();
        for (int i = 1; i <= level; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
input - 3
   *
  **
 ***

 input - 5
      *
     **
    ***
   ****
  *****

 */
