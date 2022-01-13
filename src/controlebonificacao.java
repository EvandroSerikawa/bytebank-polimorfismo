public class controlebonificacao {


    private double soma;

//    public void registra(gerente g){
//        double bonif = g.getBonificacao();
//        this.soma = this.soma + bonif;
//    }

    public void registra( funcionario f ){
        double bonif = f.getBonificacao();
        this.soma = this.soma + bonif;
    }

//    public void registra( editordevideo ev ){
//        double bonif = ev.getBonificacao();
//        this.soma = this.soma + bonif;
//    }

    public double getSoma(){
        return soma;
    }




}
