import java.util.Date;

public class AltaDoente {
	private EntradaDoente entrada;
	private M�dico medico;
	
	private Date data_hora;

	private AltaDoente(EntradaDoente entrada, M�dico medico, Date data_hora) {
		super();
		this.entrada = entrada;
		this.medico = medico;
		this.data_hora = data_hora;
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

	public Date getData_hora() {
		return data_hora;
	}

	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}
	
	
}
