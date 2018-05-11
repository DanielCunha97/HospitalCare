import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class PrescricaoRegular extends Prescricao {
	
	protected Medico medico;
	protected Doente doente;
	protected LocalDateTime data;
	protected int codigo;
	
	
	public PrescricaoRegular(int codigo,
            Medico medico,
            Doente doente,
            java.time.LocalDateTime data) {
		super();
		this.codigo=codigo;
		this.medico = medico;
		this.doente = doente;
		this.data = data;
	}

}
