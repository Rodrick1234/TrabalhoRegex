import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao05 extends Base {

    @Override

    public void executar() {

        String texto = "Maria tem 23 anos e comprou 5 livros por 120 reais.";
        String regex = "\\d{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Números encontrados com 2 ou mais digitos:");
        while (matcher.find()) {
            System.out.println(matcher.group());

        }

    }

}