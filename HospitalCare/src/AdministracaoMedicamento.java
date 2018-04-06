import java.util.Date;

public class AdministracaoMedicamento {
	private Enfermeiro enfermeiro;
	private PreparacaoMedicamento preparacao;
	
	private Date data_hora;

	private AdministracaoMedicamento(Enfermeiro enfermeiro, PreparacaoMedicamento preparacao, Date data_hora) {
		super();
		this.enfermeiro = enfermeiro;
		this.preparacao = preparacao;
		this.data_hora = data_hora;
	}

	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}

	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}

	public PreparacaoMedicamento getPreparacao() {
		return preparacao;
	}

	public void setPreparacao(PreparacaoMedicamento preparacao) {
		this.preparacao = preparacao;
	}

	public Date getData_hora() {
		return data_hora;
	}

	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}
	
	
	
}
