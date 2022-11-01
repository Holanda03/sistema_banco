public abstract class Conta
{
    private static final int agencia_default = 1;
    private static int num_conta_default = 0;

    protected int agencia;
    protected int numero;
    protected Cliente cliente;
    protected double saldo = 0;

    Conta(Cliente cliente)
    {
        this.cliente = cliente;
        this.agencia = agencia_default;
        this.numero = num_conta_default++;
    }

    public int getNumero()
    {
        return numero;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public int getAgencia()
    {
        return agencia;
    }
}
