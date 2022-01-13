public class testasistema {
    public static void main(String[] args) {

        gerente novoGerente04 = new gerente();
        novoGerente04.setSenha(2222);

        sistemainterno novoSistemaInterno = new sistemainterno();
//        novoSistemaInterno.autenticacao(novoGerente04);

        adminisrador novoAdministrador = new adminisrador();
        novoAdministrador.setSenha(3333);

        sistemainterno novoSistema = new sistemainterno();
//        novoSistema.autenticacao(novoGerente04);
//        novoSistema.autenticacao(novoAdministrador);

    }
}
