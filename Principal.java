import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<String> emailsGerados = new HashSet<>();
        List<Map<String, String>> dadosUsuarios = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Nomes nome = new Nomes();
            String email = nome.gerarEmail(emailsGerados);
            Map<String, String> dados = new HashMap<>();
            dados.put(nome.nome, email);
            dadosUsuarios.add(dados);
        }

        System.out.println("E-mails gerados:");
        for (Map<String, String> par : dadosUsuarios) {
            for (Map.Entry<String, String> entry : par.entrySet()) {
                System.out.println("Nome: " + entry.getKey() + " | E-mail: " + entry.getValue());
            }
        }

        input.close();
    }
}