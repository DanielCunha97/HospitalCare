import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class PrescricaoSOS extends Prescricao {

	protected Medico medico;
	protected Doente doente;
	protected LocalDateTime data;
	
	public PrescricaoSOS(int codigo,
            Medico medico,
            Doente doente,
            java.time.LocalDateTime data) {
		super();
		this.medico=medico;
		this.doente=doente;
		this.data=data;
	}
	
}
