import java.util.ArrayList;
import java.util.Date;

public class Prescri��o {
	
	protected Date data;
	
	protected Doente doente;
	protected Medicamento medicamento;
	protected M�dico medico;
	protected ArrayList<HorarioToma> horarios;
	
	public Prescri��o()
	{
		horarios = new ArrayList<HorarioToma>();
	}

	public Prescri��o(Date data, Doente doente, Medicamento medicamento, M�dico medico,
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

	public M�dico getMedico() {
		return medico;
	}

	public void setMedico(M�dico medico) {
		this.medico = medico;
	}

	public ArrayList<HorarioToma> getHorarios() {
		return horarios;
	}

	public void setHorarios(ArrayList<HorarioToma> horarios) {
		this.horarios = horarios;
	}
	
	
}
