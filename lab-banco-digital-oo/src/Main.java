
public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		Cliente cliente1 = new Cliente("Elksandro");
		Cliente cliente2 = new Cliente("José");

		Conta cc = new ContaCorrente(cliente1);
		Conta cp = new ContaCorrente(cliente2);

		cc.depositar(150.0);
		cc.transferir(50.0, cp);

		System.out.println("\nExibindo clientes do banco:");
		banco.exibirContas();

	}

}
