import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao01 extends Base {

    @Override
    public void executar() {

        String texto = "12345";
        String regex = "^[0-9]+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        if (matcher.matches()) {

            System.out.println("Válido: apenas números.");
        } else {

            System.out.println("Inválido.");
        }
    }
}