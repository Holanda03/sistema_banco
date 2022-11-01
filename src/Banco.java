import java.util.HashMap;
import java.util.Map;

public class Banco
{
    private String nome;
    private String nomeGerente;
    private Map<Integer, Conta> contas = new HashMap<>();

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNomeGerente()
    {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente)
    {
        this.nomeGerente = nomeGerente;
    }

    public Map<Integer, Conta> getContas()
    {
        return contas;
    }

    public void setContas(Map<Integer, Conta> contas)
    {
        this.contas = contas;
    }
}
