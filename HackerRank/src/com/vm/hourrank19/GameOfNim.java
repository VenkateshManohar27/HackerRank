package com.vm.hourrank19;

import java.util.Scanner;

public class GameOfNim {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        // Print the number of ways Alice can select the range to ensure she wins the game.
    }

}
