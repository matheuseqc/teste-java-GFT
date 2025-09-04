//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Questao 1
        Caneta canetaAzul = new Caneta("Caneta Azul", 50);
        canetaAzul.retirar(10);
        canetaAzul.exibirDados();


        //Questao 2
        Cliente cliente = new Cliente("Clara", 1234);
        System.out.println(cliente.saudacao());

    }
}