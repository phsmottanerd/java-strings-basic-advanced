package aul84;

import java.util.Arrays;

public class Aula84 {
    public static void main(String[] args) {

        char[] jav = new char[3];
        String java = "Java";
        java.getChars(0, 3, jav, 0);
        System.out.println(jav);

        for (int i = 0, j = 0; i < 3; i++, j++) {
            jav[i] = java.charAt(i);
            System.out.println(jav);
            byte[] javaBytes = new byte[3];
            java.getBytes(0, 3, javaBytes, 0);
            System.out.println(Arrays.toString(javaBytes));
          char[] javaChars =java.toCharArray();
            System.out.println(javaChars);
        }

    }
}