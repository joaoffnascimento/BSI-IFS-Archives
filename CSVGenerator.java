import org.apache.commons.io.IOUtils;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CSVGenerator {

    private static String matriculaPath = "C:\\matricula";

    private static String csvPath = "C:\\resultado";

    private static void generateCsvFile(int numMatricula, int numMatriculaFinal) throws Exception {
        try {
            FileWriter writer = new FileWriter(csvPath + "//" + "csv.csv");

            while (numMatricula <= numMatriculaFinal) {
                writer.append(Integer.toString(numMatricula));
                writer.append(';');
                writer.append(readTxtFile(matriculaPath, numMatricula));
                writer.append('\n');
                System.out.println("Matricula " + numMatricula + " Ok !");
                numMatricula++;
            }

            writer.flush();
            writer.close();

            System.out.println("Concluido !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readTxtFile(String path, int numMatricula) throws Exception {
        FileInputStream inputStream = new FileInputStream(path + "\\" + numMatricula + ".txt");
        try {
            String a = IOUtils.toString(inputStream).replaceAll("\n", " ");
            String b = a.replaceAll("\r", " ");
            String c = b.replaceAll("\t", " ");
            String d = c.replaceAll("    ", " ");
            return d;
        } finally {
            inputStream.close();
        }
    }

    public static void main(String[] args) throws Exception {
        generateCsvFile(1, 18611);
    }
}
