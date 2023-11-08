import java.util.*;

public class Problem {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        leitor.nextLine(); // Lê a quebra de linha após o valor de N.

        for (int n = 0; n < N; n++) {
            String jogador1 = leitor.nextLine();
            String jogador2 = leitor.nextLine();

            if (jogador1.equals(jogador2)) {
                System.out.println("Sem ganhador");
            } else if ((jogador1.equals("pedra") && jogador2.equals("ataque")) ||
                       (jogador1.equals("ataque") && jogador2.equals("papel")) ||
                       (jogador1.equals("papel") && jogador2.equals("pedra"))) {
                System.out.println("Jogador 1 venceu");
            } else if ((jogador2.equals("pedra") && jogador1.equals("ataque")) ||
                       (jogador2.equals("ataque") && jogador1.equals("papel")) ||
                       (jogador2.equals("papel") && jogador1.equals("pedra"))) {
                System.out.println("Jogador 2 venceu");
            } else {
                System.out.println("Ambos venceram");
            }
        }
    }
}

}
