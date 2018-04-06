import java.util.ArrayList;
import java.util.Date;

public class TomaUnica_Verbal extends Prescrição {

	private Enfermeiro enfermeiro;
	private AutorizacaoPrescricao autorizacao;

	public TomaUnica_Verbal() {}
	
	public TomaUnica_Verbal(Enfermeiro enfermeiro, AutorizacaoPrescricao autorizacao) {
		this.enfermeiro = enfermeiro;
		this.autorizacao = autorizacao;
	}

	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}

	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}

	public AutorizacaoPrescricao getAutorizacao() {
		return autorizacao;
	}

	public void setAutorizacao(AutorizacaoPrescricao autorizacao) {
		this.autorizacao = autorizacao;
	}

}
