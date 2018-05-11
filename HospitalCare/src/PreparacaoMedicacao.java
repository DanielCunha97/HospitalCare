import java.time.LocalDateTime;
import java.util.Date;

public class PreparacaoMedicacao {
	private Enfermeiro enfermeiro;
	private HorarioToma horarioToma;
	
	private LocalDateTime data_hora;

	public PreparacaoMedicacao(Enfermeiro enfermeiro, HorarioToma horarioToma, LocalDateTime data_hora) {
		this.enfermeiro = enfermeiro;
		this.horarioToma = horarioToma;
		this.data_hora = data_hora;
	}

	public Object getDateTime() {
		return data_hora;
	}
	
}
