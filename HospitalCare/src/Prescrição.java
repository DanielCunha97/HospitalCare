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
	
	
}
