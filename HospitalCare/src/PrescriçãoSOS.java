import java.util.ArrayList;
import java.util.Date;

public class Prescri��oSOS extends Prescri��o {

	private Prescri��oSOS() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Prescri��oSOS(Date data, Doente doente, Medicamento medicamento, M�dico medico,
			ArrayList<HorarioToma> horarios) {
		super(data, doente, medicamento, medico, horarios);
		// TODO Auto-generated constructor stub
	} //todas as prescri��es herdam atributos

}
