
public class Enfermeiro {

	private String nome;
	private int codigo;
	
	public Enfermeiro(int codigo,String nome) {
		super();
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
