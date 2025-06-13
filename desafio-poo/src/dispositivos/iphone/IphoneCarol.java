package dispositivos.iphone;
import dispositivos.Iphone;

public class IphoneCarol {
    public static void main(String[] args) {
        Iphone iphoneCarol = new Iphone();

        //Aparelho telefônico
        iphoneCarol.ligar("(31)99999-9999");
        iphoneCarol.atender();
        iphoneCarol.iniciarCorreioVoz();

        //Navegador de internet
        iphoneCarol.exibirPagina("google.com");
        iphoneCarol.adicionarNovaAba();
        iphoneCarol.atualizarPagina();

        //Reprodutor musical
        iphoneCarol.selecionarMusica("Only Girl In The World");
        iphoneCarol.tocar();
        iphoneCarol.pausar();

    }
}
