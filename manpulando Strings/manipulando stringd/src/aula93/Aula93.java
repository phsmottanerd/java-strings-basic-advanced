package aula93;

import org.w3c.dom.ls.LSOutput;

public class Aula93 {
    public static void main(String[] args) {
        String[] letras = {"B", "C", "D", "E", "F" };
        String alfabeto = "";
        for (String letra : letras) {
            alfabeto += letra;
        }
        System.out.println(alfabeto);
        StringBuffer sb = new StringBuffer();
        for (String latra : letras) {
            sb.append(latra);
        }
        alfabeto = sb.toString();
        System.out.println(alfabeto);

        alfabeto = new String(sb);
        System.out.println(sb.reverse());
        StringBuilder sb_ = new StringBuilder();
        for (String latra : letras) {
            sb_.append(latra);
            System.out.println(sb.reverse());
        }

    }
}