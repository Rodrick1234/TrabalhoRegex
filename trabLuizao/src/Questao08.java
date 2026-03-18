public class Questao08 extends Base {

    @Override
    public void executar() {

        String texto = "Telefone: (67) 99876-1234";
        
        String resultado = texto.replaceAll(
                "\\((\\d{2})\\)\\s?9(\\d{4})-(\\d{4})",
                "($1) 9****-$3");

        System.out.println(resultado);
    }
}