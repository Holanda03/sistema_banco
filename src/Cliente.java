public class Cliente
{
    private String nome;
    private String cpf;

    Cliente(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome()
    {
        return nome;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void editarInfo(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
    }
}
