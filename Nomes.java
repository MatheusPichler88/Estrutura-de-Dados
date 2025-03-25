import java.util.Scanner;
import java.util.Set;

public class Nomes {
    String nome;
    Scanner input = new Scanner(System.in);
    String nomeSplit[];
    String email;

    public String gerarEmail(Set<String> emailsExistentes) {
        System.out.println("Nome: ");
        nome = input.nextLine();
        nome = nome.toUpperCase();
        nomeSplit = nome.split(" ");

        String emailBase = nomeSplit[0] + "." + nomeSplit[nomeSplit.length - 1] + "@ufn.edu.br";
        emailBase = emailBase.toLowerCase();

        email = emailBase;
        int contador = 1;
        while (emailsExistentes.contains(email)) {
            email = emailBase.replace("@ufn.edu.br", "") + contador + "@ufn.edu.br";
            contador++;
        }

        emailsExistentes.add(email);
        System.out.println("E-mail: " + email + "\n");
        return email;
    }
}