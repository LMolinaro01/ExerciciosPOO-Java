import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ler {
    public static void lerArquivo(String nomeArquivo){
        try(BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null){
                System.out.println(linha);
            }
        } catch (IOException e){
            System.out.println("Erro ao ler o Arquivo: " + e.getMessage());
        }
    }

}
