import java.util.Date;

public class ServicoEnfermeiro {

	private Enfermeiro enfermeiro;
	private Administrativo funcionario;
	
	private Date data_hora_inicio;
	private Date data_hora_fim;
	
	public ServicoEnfermeiro(Enfermeiro enfermeiro, Administrativo funcionario, Date data_hora_inicio,
			Date data_hora_fim) {
		this.enfermeiro = enfermeiro;
		this.funcionario = funcionario;
		this.data_hora_inicio = data_hora_inicio;
		this.data_hora_fim = data_hora_fim;
	}

	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}

	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}

	public Administrativo getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Administrativo funcionario) {
		this.funcionario = funcionario;
	}

	public Date getData_hora_inicio() {
		return data_hora_inicio;
	}

	public void setData_hora_inicio(Date data_hora_inicio) {
		this.data_hora_inicio = data_hora_inicio;
	}

	public Date getData_hora_fim() {
		return data_hora_fim;
	}

	public void setData_hora_fim(Date data_hora_fim) {
		this.data_hora_fim = data_hora_fim;
	}
}
