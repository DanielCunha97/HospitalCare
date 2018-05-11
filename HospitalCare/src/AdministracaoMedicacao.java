import java.time.LocalDateTime;
import java.util.Date;

public class AdministracaoMedicacao {
	private PreparacaoMedicacao preparacao;
	private Enfermeiro enfermeiro;
	
	private LocalDateTime data_hora;

	public AdministracaoMedicacao(PreparacaoMedicacao preparacao, Enfermeiro enfermeiro, LocalDateTime data_hora) {
		this.preparacao = preparacao;
		this.enfermeiro = enfermeiro;
		this.data_hora = data_hora;
	}
	
	
	
}
