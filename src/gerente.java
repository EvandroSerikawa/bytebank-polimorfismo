public class gerente extends funcionario implements autenticavel{

    private autencicacaoutil autenticador;

    public gerente(){
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
        System.out.println("Chamando o método de bonificação do gerente.");
        return super.getSalario();
    }
}
