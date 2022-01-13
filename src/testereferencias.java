public class testereferencias {
    public static void main(String[] args) {

        gerente novoGerente05 = new gerente();
//         novo gerente herda direto da classe funcionário ( classe mãe )
//         e é criado como uma classe gerente
        novoGerente05.setSenha(1526);
        novoGerente05.setNome("Novo Gerente 05");
        novoGerente05.setCPF("123.456.789.55");
        novoGerente05.setSalario(5.000);

//        funcionario novoFuncionario03 = new funcionario();  - CLASSE ABSTRATA NÃO PODE INSTANCIAR UM NOVO FUNCIONÁRIO
//        novoFuncionario03.setSalario(2.000);

        editordevideo novoEditor = new editordevideo();
        novoEditor.setSalario(2.500);

        designer novoDesigner = new designer();
        novoDesigner.setSalario(2.000);

        controlebonificacao controle = new controlebonificacao();
        controle.registra( novoGerente05);
        controle.registra(novoEditor);
        controle.registra(novoDesigner);

        System.out.println("\nSoma das bonificações dos funcionários informados acima.");
        System.out.println(controle.getSoma());

    }
}