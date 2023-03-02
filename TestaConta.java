import java.util.Scanner;
import java.util.ArrayList;
class TestaConta
{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    
    VetorObjeto vetor = new VetorObjeto(5);
    
    Conta c1 = new Conta(0.00, 4000);
    Conta c2 = new Conta(1000,2000);
    try{
    vetor.adiciona(c1);
    vetor.adiciona(c2);
    } catch (Exception e) {
        e.printStackTrace();
    }
    Conta contax = (c1);
    contax.numero=171955;
    contax.numerodocliente=1347;
    contax.datadeabertura="12/05/2012";
    contax.codigogerente=771;
    
    Conta contax2 = (c2);
    contax2.numero=4234;
    contax2.numerodocliente=4234;
    contax2.datadeabertura="12/05/2012";
    contax2.codigogerente=333;
    //contax
    System.out.println("Digite o valor do deposito");
    double depositoContaC1 = sc.nextDouble();
    contax.depositoConta(depositoContaC1);
    System.out.println("Digite o valor do saque");
    double saqueContaC1 = sc.nextDouble();
    contax.saqueConta(saqueContaC1);
    //contax2
    contax2.depositoConta(2000);
    contax2.saqueConta(500);
    
    System.out.println(vetor.toString());
    System.out.println(" O saldo atual é:" + (contax.saldo+contax.limite)+"\n O saldo atual é:"+(contax2.saldo+contax2.limite));
}
}
