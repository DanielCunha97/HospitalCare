import java.util.ArrayList;
import java.util.Date;

public class TomaUnica_Verbal extends Prescri��o {

	private TomaUnica_Verbal() {
		super();
		// TODO Auto-generated constructor stub
	}

	private TomaUnica_Verbal(Date data, Doente doente, Medicamento medicamento, M�dico medico,
			ArrayList<HorarioToma> horarios) {
		super(data, doente, medicamento, medico, horarios);
		// TODO Auto-generated constructor stub
	}

}
