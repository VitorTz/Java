package beecrowd;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Entrada {

    private static final String PATH = "/run/media/HD/Documentos/Github/Java/Algoritmos e Estrutura da Dados/src/beecrowd/files/entrada.txt";


    public static List<List<Character>> getInput(){
        final File file = new File(PATH);
        List<List<Character>> l = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                l.add(toListCharacter(sc.nextLine()));
            }
            sc.close();
        } catch (IOException e){
            Arrays.stream(e.getStackTrace()).forEach(System.out::println);
        }
        return l;
    }

    public static void printEntrada(List<List<Character>> l){
        l.forEach((n) -> System.out.println(n.toString()));
    }

    private static List<Character> toListCharacter(String n){
        List<Character> arr = new ArrayList<>();
        for (char c : n.toCharArray()){
            arr.add((Character) c);
        }
        return arr;
    }

}
