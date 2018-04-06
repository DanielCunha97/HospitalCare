import java.util.ArrayList;
import java.util.Date;

public class Prescrição {
	
	protected Date data;
	
	protected Doente doente;
	protected Medicamento medicamento;
	protected Médico medico;
	protected ArrayList<HorarioToma> horarios;
	
	public Prescrição()
	{
		horarios = new ArrayList<HorarioToma>();
	}

	public Prescrição(Date data, Doente doente, Medicamento medicamento, Médico medico,
			ArrayList<HorarioToma> horarios) {
		this.data = data;
		this.doente = doente;
		this.medicamento = medicamento;
		this.medico = medico;
		this.horarios = horarios;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Doente getDoente() {
		return doente;
	}

	public void setDoente(Doente doente) {
		this.doente = doente;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public Médico getMedico() {
		return medico;
	}

	public void setMedico(Médico medico) {
		this.medico = medico;
	}

	public ArrayList<HorarioToma> getHorarios() {
		return horarios;
	}

	public void setHorarios(ArrayList<HorarioToma> horarios) {
		this.horarios = horarios;
	}
	
	
}
