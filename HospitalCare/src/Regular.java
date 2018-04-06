import java.util.ArrayList;
import java.util.Date;

public class Regular extends Prescrição {

	private Regular() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Regular(Date data, Doente doente, Medicamento medicamento, Médico medico, ArrayList<HorarioToma> horarios) {
		super(data, doente, medicamento, medico, horarios);
		// TODO Auto-generated constructor stub
	}

}
