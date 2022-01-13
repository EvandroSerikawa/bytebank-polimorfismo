public class cliente extends funcionario implements autenticavel{
// Implements - implementação dos métodos da interface.

    private autencicacaoutil autenticador;

    public cliente(){
         this.autenticador = new autencicacaoutil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autenticacao(int senha) {
        return this.autenticador.autenticacao(senha);
    }

    @Override
    public double getBonificacao() {
        return 0;
    }
}
