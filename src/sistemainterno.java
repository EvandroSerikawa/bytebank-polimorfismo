public class sistemainterno {

    private int senha =  2222;

    public void autenticacao( funcionarioautenticavel fa){
       boolean autentica =  fa.autenticacao( this.senha );
       if( autentica ){
           System.out.println("Seja bem vindo.");
       }else{
           System.out.println("Senha incorreta.");
       }
    }
}
