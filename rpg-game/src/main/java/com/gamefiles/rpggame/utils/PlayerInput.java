package com.gamefiles.rpggame.utils;

import java.util.Scanner;

public class PlayerInput {

    public static String playerInputString(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static int playerInputInt(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }


}
