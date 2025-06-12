package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    //pode ser default
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando lanche natural hambúrguer no balcão");
    }

    //pode ser default
    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco no balcão");
    }

    //pode ser default
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        System.out.println("Preparando lanche tipo hambúrguer");
    }

    private void prepararVitamina() {
        baterVitaminaLiquidificador();
        System.out.println("Preparando vitamina");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("Selecionando o pão, salada, ovo e carne");
    }

    private void lavarIngredientes() {
        selecionarIngredientesLanche();
        System.out.println("Lavando ingredientes");
    }

    private void baterVitaminaLiquidificador() {
        lavarIngredientes();
        System.out.println("Batendo vitamina no liquidificador");
    }

    public void fritarIngredientesLanche() {
        System.out.println("Fritando a carne e ovo para o hambúrguer");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
