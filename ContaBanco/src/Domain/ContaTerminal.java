package Domain;

import java.util.Scanner;

public class ContaTerminal {
  String nome;
  String agencia;
  Integer numero;
  Double saldo;

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getAgencia() {
    return agencia;
  }
  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }
  public Integer getNumero() {
    return numero;
  }
  public void setNumero(Integer numero) {
    this.numero = numero;
  }
  public Double getSaldo() {
    return saldo;
  }
  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }
  @Override
  public String toString() {
    return "ContaTerminal [nome=" + nome + ", agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
  }
  
  public ContaTerminal criarConta(ContaTerminal conta){
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o seu nome: ");
    conta.setNome(sc.nextLine());
    System.out.println("Informe sua agencia: ");
    conta.setAgencia(sc.nextLine());
    System.out.println("Informe o numero da conta: ");
    conta.setNumero(sc.nextInt());
    System.out.println("Informe o saldo da conta:");
    conta.setSaldo(sc.nextDouble());

    return conta;
  }
  public void imprimeDados(ContaTerminal conta){
    criarConta(conta);
    System.out.println("Olá " +conta.nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia +" , conta " + conta.numero+" e seu saldo de R$"+conta.saldo+" já está disponível para saque");
  }
}
