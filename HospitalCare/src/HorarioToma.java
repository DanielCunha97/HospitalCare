import java.time.LocalDateTime;
import java.util.Date;

public class HorarioToma {

	private LocalDateTime data_hora;
	private String medicamento;
	public HorarioToma(LocalDateTime data_hora,String medicamento) {
		super();
		this.data_hora = data_hora;
		this.medicamento = medicamento;
	}

	public LocalDateTime getDateTime() {
		return data_hora;
	}


}
