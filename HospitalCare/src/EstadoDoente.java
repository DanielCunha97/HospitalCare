
public class EstadoDoente {
	private EntradaDoente entrada;
	private M�dico medico;
	private Enfermeiro enfermeiro;
	
	
	private String estado;


	public EstadoDoente(EntradaDoente entrada, M�dico medico, String estado) {
		this.entrada = entrada;
		this.medico = medico;
		this.estado = estado;
	}


	public EntradaDoente getEntrada() {
		return entrada;
	}


	public void setEntrada(EntradaDoente entrada) {
		this.entrada = entrada;
	}


	public M�dico getMedico() {
		return medico;
	}


	public void setMedico(M�dico medico) {
		this.medico = medico;
	}


	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}


	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
