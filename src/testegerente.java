public class testegerente {
    public static void main(String[] args) {

        gerente novoGerente = new gerente();

        novoGerente.setNome("Novo Gerente 01");
        novoGerente.setCPF("123.456.789-11");
        novoGerente.setSalario(5.000);

        System.out.println("Nome do novo gerente" + novoGerente.getNome());
        System.out.println("CPF do novo gerente" + novoGerente.getCPF());
        System.out.println("Salario do novo gerente" + novoGerente.getSalario());

        //boolean autenticou = novoGerente.autenticacao(2525);
        //System.out.println(autenticou);

        System.out.println("Bonificação do novo Gerente: " + novoGerente.getBonificacao());

    }
}
