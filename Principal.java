import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.UIManager;

public class Principal {
    public static void main(String[] args) throws IOException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            //----------
        }

        JFileChooser fileChooser = new JFileChooser();
        int res = fileChooser.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            String rutaArchivo = fileChooser.getSelectedFile().getAbsolutePath();
            if (!rutaArchivo.endsWith(".txt")) {
                System.err.println("El archivo seleccionado no es un archivo de texto (.txt).");
                return;
            }
            String codigo = Files.readString(Paths.get(rutaArchivo));
            new Parser(codigo);
        } else {
            System.out.println("No se seleccionó ningún archivo.");
        }
    }
}