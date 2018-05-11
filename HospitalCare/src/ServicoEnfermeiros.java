import java.util.Date;

public class ServicoEnfermeiros {

	private Enfermeiro enfermeiro;
	private FuncionarioAdministrativo funcionario;
	
	private Date data_hora_inicio;
	private Date data_hora_fim;
	
	public ServicoEnfermeiros(Enfermeiro enfermeiro, FuncionarioAdministrativo funcionario, Date data_hora_inicio,
			Date data_hora_fim) {

		this.enfermeiro = enfermeiro;
		this.funcionario = funcionario;
		this.data_hora_inicio = data_hora_inicio;
		this.data_hora_fim = data_hora_fim;
	}
}
