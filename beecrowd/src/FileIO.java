import java.io.*;
import java.util.ArrayList;

class FileIO {
    // Lê a entrada armazenada no arquivo entrada.txt do pacote

    private static final String fileName = "beecrowd/src/entrada.txt";

    static void write(Object[] s) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (Object string : s)
                writer.write(string.toString() + "\n");
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static String readLine(BufferedReader reader){
        try {
            return reader.readLine();
        } catch (IOException e){
            return null;
        }
    }

    private static BufferedReader getReader(){
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader(fileName));
        } catch (IOException e){
            e.printStackTrace();
        }
        return reader;
    }

    static String readFirstLine(){
        return readLine(getReader());
    }

    static ArrayList<String> read(){
        ArrayList<String> lines = new ArrayList<>();
        BufferedReader reader = getReader();
        String currentLine;

        while ((currentLine = readLine(reader)) != null)
            lines.add(currentLine);

        return lines;
    }

}
