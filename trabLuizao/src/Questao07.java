public class Questao07 extends Base {

    @Override
    public void executar() {
        String texto = "CPF: 123.456.789-00";
        String resultado = texto.replaceAll(
                "(\\d{3})\\.(\\d{3})\\.(\\d{3})-(\\d{2})",
                "***.***.***-$4");
        System.out.println(resultado);
    }
}
