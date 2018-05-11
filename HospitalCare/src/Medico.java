
public class Medico {
	private String nome;
	private int codigo;

	public Medico(int codigo,String nome) {
		this.nome = nome;
		this.codigo=codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
