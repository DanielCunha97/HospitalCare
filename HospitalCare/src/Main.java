import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		precondicoes();
		inserirEntrada();
		registarPrescricao();
	}

	public static void inserirEntrada() {
		//O código do diagrama de sequência "Inserir Entrada"
		int codigoDoente = 1;
		Doente d = RegistoObjetos.devolverDoente(codigoDoente);
		System.out.println(d.getNome());
		
		int codigoMedico=1;
		Medico m = RegistoObjetos.devolverMedico(codigoMedico);
		System.out.println(m.getNome());
		
		int codigoEnfermeiro=1;
		Enfermeiro enf = RegistoObjetos.devolverEnfermeiro(codigoEnfermeiro);
		System.out.println(enf.getNome());
		
		int codigoFunc = 1;
		FuncionarioAdministrativo f = RegistoObjetos.devolverFuncAdmin(codigoFunc);
		System.out.println(f.getNome());
		
		Entrada e = new Entrada(1,f,d, LocalDateTime.parse("2015-02-20T06:30:00"));
		
		RegistoObjetos.inserirEntrada(1, e);
	}

	public static void precondicoes() {
		//Precondições
		Medico medico = new Medico(1,"Antonio");
		RegistoObjetos.inserirMedico(1, medico);
		
		Doente doente= new Doente(1,"Maria");
		RegistoObjetos.inserirDoente(1, doente);
		
		Enfermeiro enfermeiro = new Enfermeiro(1,"Jose");
		RegistoObjetos.inserirEnfermeiro(1, enfermeiro);
		
		FuncionarioAdministrativo fadmin = new FuncionarioAdministrativo(1, "Ana");
		RegistoObjetos.inserirFuncAdmin(1, fadmin);
	}

	public static void registarPrescricao() {
		Doente d = RegistoObjetos.devolverDoente(1);
		System.out.println(d.getNome());
	}
	
}
