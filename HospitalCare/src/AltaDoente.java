import java.util.Date;

public class AltaDoente {
	private EntradaDoente entrada;
	private Médico medico;
	
	private Date data_hora;

	private AltaDoente(EntradaDoente entrada, Médico medico, Date data_hora) {
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

	public Médico getMedico() {
		return medico;
	}

	public void setMedico(Médico medico) {
		this.medico = medico;
	}

	public Date getData_hora() {
		return data_hora;
	}

	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}
	
	
}
