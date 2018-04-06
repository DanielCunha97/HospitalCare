import java.util.ArrayList;
import java.util.Date;

public class PrescriçãoSOS extends Prescrição {

	private PrescriçãoSOS() {
		super();
		// TODO Auto-generated constructor stub
	}

	private PrescriçãoSOS(Date data, Doente doente, Medicamento medicamento, Médico medico,
			ArrayList<HorarioToma> horarios) {
		super(data, doente, medicamento, medico, horarios);
		// TODO Auto-generated constructor stub
	} //todas as prescrições herdam atributos

}
