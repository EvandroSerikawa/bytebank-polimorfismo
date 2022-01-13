public abstract class funcionario {


    private String nome;
    private String CPF;
    private double salario;
    //protected double salario02; // Protected - publico para os filhos e privado para quem não é da classe


    // Método sem corpo , sem implementação na classe mãe
    // O método abstrato é implementado direto em cada objeto criado abaixo na hierarquia.
    public abstract double getBonificacao();//{
    //    System.out.println("Chamando o método de bonificação do funcionário.");
    //    return this.salario*0.05;
    //}

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){

        this.nome = nome;
    }
    public String getCPF(){

        return CPF;
    }
    public void setCPF(String CPF){

        this.CPF = CPF;
    }
    public double getSalario(){

        return salario;
    }
    public void setSalario(double salario){

        this.salario = salario;
    }

}
