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
	
	
}
