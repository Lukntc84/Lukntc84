
class Conta // Criação da classe Conta
{
double saldo;
double limite;
    Conta(double saldo,double limite)
{
this.saldo = saldo;
this.limite = limite;
} // Classe com Construtor declarado
public double getSaldo() {
    return saldo;
}

public void setSaldo(Double saldo) {
    this.saldo = saldo;
}
public double getLimite() {
    return limite;
}

public void setLimite(Double limite) {
    this.limite = limite;
}

String datadeabertura;
int numero;
int numerodocliente;
int codigogerente;
void saqueConta(double saldo2)
{
saldo-=saldo2;
}
void depositoConta(double saldo2)
{
saldo+=saldo2;
}
}