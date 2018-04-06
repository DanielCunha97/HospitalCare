import java.util.Date;

public class PreparacaoMedicamento {
	private Enfermeiro enfermeiro;
	private HorarioToma horarioToma;
	
	private Date data_hora;

	public PreparacaoMedicamento(Enfermeiro enfermeiro, HorarioToma horarioToma, Date data_hora) {
		this.enfermeiro = enfermeiro;
		this.horarioToma = horarioToma;
		this.data_hora = data_hora;
	}

	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}

	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}

	public HorarioToma getHorarioToma() {
		return horarioToma;
	}

	public void setHorarioToma(HorarioToma horarioToma) {
		this.horarioToma = horarioToma;
	}

	public Date getData_hora() {
		return data_hora;
	}

	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}
	
}
