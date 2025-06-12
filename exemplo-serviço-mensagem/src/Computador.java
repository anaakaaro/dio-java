import apps.Facebook;
import apps.Msn;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class Computador {
    public static void main(String[] args){
        ServicoMensagemInstantanea smi = null;
        /*
            NÃO SE SABE QUAL APP
            MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
        */

        String appEscolhido = "msn";

        if(appEscolhido.equals("msn")){
            smi = new Msn();
        } else if(appEscolhido.equals("facebook")){
            smi = new Facebook();
        } else if(appEscolhido.equals("telegram")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
