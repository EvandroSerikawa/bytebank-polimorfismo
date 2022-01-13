public class editordevideo extends funcionario{


    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de binificação do Editor de vídeo.");
        return super.getSalario()+100;
    }
}
