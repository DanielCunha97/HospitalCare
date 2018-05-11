import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class PrescricaoVerbalTUnica extends Prescricao {

	private Enfermeiro enfermeiro;
	private AutorizacaoPrescricao autorizacao;
	protected LocalDateTime data;
	protected int codigo;
	protected Medico medico;
	protected Doente doente;
	
	public PrescricaoVerbalTUnica(int codigo,
            Medico medico,
            Doente doente,
            java.time.LocalDateTime data,
            Enfermeiro enfermeiro,
            AutorizacaoPrescricao autorizacao) {
		super();
		this.codigo = codigo;
		this.medico= medico;
		this.data=data;
		this.doente=doente;
		this.enfermeiro = enfermeiro;
		this.autorizacao = autorizacao;
		
	}


	public PrescricaoVerbalTUnica() {}
}
