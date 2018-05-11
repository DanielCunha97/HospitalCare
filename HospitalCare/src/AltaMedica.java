import java.util.Date;

public class AltaMedica {
	private Entrada entrada;
	private Medico medico;
	
	private Date data_hora;

	public AltaMedica(Entrada entrada, Medico medico, Date data_hora) {
		this.entrada = entrada;
		this.medico = medico;
		this.data_hora = data_hora;
	}
}
