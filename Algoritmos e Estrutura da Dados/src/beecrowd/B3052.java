package beecrowd;

import java.util.List;

public class B3052 {

    // https://www.beecrowd.com.br/judge/pt/problems/view/3052

    private final static char ESTANTE = '#';
    private final static char LIVRE = '.';
    private final static char GOTA = 'o';

    public static void main(String[] args) {
        final List<List<Character>> input = Entrada.getInput();
        final int linhas = input.get(0).get(0);
        final int colunas = input.get(0).get(2);
        final List<List<Character>> gotas = input.subList(1, input.size());
        final int posicaoInicialGota = gotas.get(0).indexOf(GOTA);

    }

    private void andarVertical(List<List<Character>> gotas, int i, int j, int linhas, int colunas){

    }

    private void andarHozirontal(List<List<Character>> gotas, int i, int j, int deltaJ, int linhas, int colunas){
        if (i > linhas - 2 || j < 0 || j >= colunas) return;
        final int linhaDeBaixo = i + 1;
        while (gotas.get(linhaDeBaixo).get(j) == ESTANTE && j >= 0 && j < colunas){

            j += deltaJ;
        }
    }


}
