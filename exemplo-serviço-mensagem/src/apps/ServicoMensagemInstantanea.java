package apps;
public abstract class ServicoMensagemInstantanea {
    // na abstração eu precisa determinar como cada classe filha vai implementar cada método
    // todos precisam fazer a mesma coisa mas cada um faz da sua maneira

    //nas classes abstratas os métodos são abstratos e não têm corpo
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //mais um método que todos os filhos deverão implementar
    public abstract void salvarHistoricoMensagem();

    //somente os filhos conhecem este método
    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
}
