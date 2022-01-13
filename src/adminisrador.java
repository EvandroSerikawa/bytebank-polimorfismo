public class adminisrador extends funcionario implements autenticavel{

    private autencicacaoutil autenticador;

    public adminisrador(){
        this.autenticador = new autencicacaoutil();
    }

    public void setSenha(int senha) {

        this.autenticador.setSenha(senha);
    }

    public boolean autenticacao(int senha){
        return this.autenticador.autenticacao(senha);
    }

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do Administrador.");
        return super.getSalario()*2;
    }
}
