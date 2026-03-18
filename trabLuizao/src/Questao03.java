import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao03 extends Base {

    @Override
    public void executar() {
        String texto = "15/03/2025";
        String regex = "^(0[1-9]|[12][0-9]|3[0-1])/(0[1-9]|1[0-2])/\\d{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        if (matcher.matches()) {
            System.out.println("Data válida.");
        } else {
            System.out.println("Data inválida.");
        }
    }
}
