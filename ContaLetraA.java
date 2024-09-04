import java.util.Scanner;

public class ContaLetraA {
    public static int contaLetraA(String texto) {
        int count = 0;
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String string = scanner.nextLine();
        scanner.close();

        int quantidade = contaLetraA(string);
        System.out.println("A letra 'a' aparece " + quantidade + " vezes na string.");
    }
}
