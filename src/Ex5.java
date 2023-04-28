import java.util.Scanner;

public class Ex5 {
    // 5) Escreva um programa que inverta os caracteres de um string.
    //
    //IMPORTANTE:
    //
    //a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser
    // previamente definida no código;
    //
    //b) Evite usar funções prontas, como, por exemplo, reverse;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String texto = input.nextLine();

        String textoInvertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }

        System.out.println("String invertida: " + textoInvertido);
    }
}
