import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringTokenizer;

public class DatabaseProject {

    public static void main(String[] args) {

        try (BufferedReader br = Files.newBufferedReader(Paths.get("C:\\Users\\drago\\OneDrive\\Desktop\\Database\\table (3).csv"))){

            String str = "";
            StringBuilder stringBuilder = new StringBuilder();



            while((str = br.readLine()) != null){

                StringTokenizer tokenizer = new StringTokenizer(str, ",");

                while (tokenizer.hasMoreElements()) {

                    System.out.println(tokenizer.nextElement());

                }
            }

            System.out.println(stringBuilder.toString());

        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
