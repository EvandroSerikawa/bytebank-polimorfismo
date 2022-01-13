public abstract interface autenticavel {
    // Contrato autenticavel - quem assina esse contrato, precisa implementar
    // método setSenha
    // método autenticacao

    // Interfaces são classes abstratas com métodos abstratos e não pode ter implementações.

    public abstract void setSenha( int senha );

    public abstract boolean autenticacao(int senha);

}
