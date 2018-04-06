import java.util.Date;

public class EntradaDoente {
	private Administrativo funcionario;
	private Doente doente;
	
	private Date data_hora;

	public EntradaDoente(Administrativo funcionario, Doente doente, Date data_hora) {
		super();
		this.funcionario = funcionario;
		this.doente = doente;
		this.data_hora = data_hora;
	}

	public Administrativo getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Administrativo funcionario) {
		this.funcionario = funcionario;
	}

	public Doente getDoente() {
		return doente;
	}

	public void setDoente(Doente doente) {
		this.doente = doente;
	}

	public Date getData_hora() {
		return data_hora;
	}

	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}
	
}
