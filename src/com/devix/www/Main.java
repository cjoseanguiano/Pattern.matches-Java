package com.devix.www;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String[] inputs = {"dog", "dance", "cat", "dirt"};

        for (String input : inputs) {
            boolean b = Pattern.matches("d.+", input);
            System.out.println(b);
        }
    }
}
