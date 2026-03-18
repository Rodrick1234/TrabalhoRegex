import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao02 extends Base {

    @Override
    public void executar() {

        String texto = "10.5";
        String regex = "\\d+\\.\\d+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        if (matcher.matches()) {

            System.out.println("Número decimal válido. ");
        } else {

            System.out.println("Inválido. ");
        }
    }
}