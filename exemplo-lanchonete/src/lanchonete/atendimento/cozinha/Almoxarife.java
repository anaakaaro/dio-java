package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("Controlando a entrada dos itens");
    }

    private void controlarSaida() {
        System.out.println("Controlando a saída dos lanches");
    }

    void entregarIngredientes() {
        System.out.println("Entregando os ingredientes");
        controlarSaida();
    }

    public void prepararLanche() {
        System.out.println("Preparando lanche tipo hambúrguer");
    }

    void trocarGas() {
        System.out.println("Trocando o gás");
    }

}
