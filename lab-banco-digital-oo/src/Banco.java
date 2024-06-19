import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private static List<Conta> contas;

	public Banco(){
		Banco.contas = new ArrayList<>();
	}

	public static void adicionarConta(Conta conta){
		contas.add(conta);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void exibirContas(){
		for(Conta c : contas){
			c.imprimirInfosComuns();
		}
	}

}
