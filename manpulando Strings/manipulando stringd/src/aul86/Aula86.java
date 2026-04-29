package aul86;

public class Aula86 {
    public static void main(String[] args){
        String ola = "Olá";
        String ola2 = "OLÀ";
        String ola3 = "Olá";
        System.out.println("ola equais ola2 " + ola.equals(ola2));
        System.out.println("ola equais ola2 " + ola.equals(ola3));

        System.out.println("ola equais ola2 " + ola.equalsIgnoreCase(ola2));
 String a ="a";
 String b = "b";
 String aMaiuscula = "A";

 System.out.println(a.compareTo(b));
 System.out.println(b.compareTo(a));
 System.out.println(a.compareTo("a"));
 System.out.println(a.compareTo(aMaiuscula));


    }
}