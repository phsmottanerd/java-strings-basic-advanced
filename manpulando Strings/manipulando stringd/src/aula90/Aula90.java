package aula90;

public class Aula90 {
    public static void main(String[] args){

        String teste = "Isso e um teste";
        System.out.println(teste);
        System.out.println(teste.substring(10));
        System.out.println(teste.substring(10, 15));
        String ola = "Ola";
        String mundo = "Mundo";
        String olaMundo = ola.concat(mundo); // ola + mundo
        System.out.println(olaMundo);
        String espacos = "ispaços";
        String semEspacos = espacos.replace('i', 'e');
        System.out.println(semEspacos);
        semEspacos = semEspacos.replaceAll(" ", " ");

        String nome = " meu nome é: ";
        System.out.println(nome);
        System.out.println(nome.trim());
    }
}