import java.util.HashMap;

public class RegistoObjetos {
	private static HashMap<Integer,Doente> doentes = new HashMap<Integer,Doente>(); 
	private static HashMap<Integer,Medico> medicos = new HashMap<Integer,Medico>(); 
	private static HashMap<Integer,Enfermeiro> enfermeiros = new HashMap<Integer,Enfermeiro>(); 
	private static HashMap<Integer,FuncionarioAdministrativo> funcadmin = new HashMap<Integer,FuncionarioAdministrativo>();
	private static HashMap<Integer,Prescricao> prescricao = new HashMap<Integer,Prescricao>();  
	private static HashMap<Integer,Entrada> entradas = new HashMap<Integer,Entrada>();
	private static HashMap<Integer,AdministracaoMedicacao> adminMed = new HashMap<Integer,AdministracaoMedicacao>();
	private static HashMap<Integer,PreparacaoMedicacao> PreparaMed = new HashMap<Integer,PreparacaoMedicacao>();
	
	public static void adicionarAdminMedicacao(int codigo, AdministracaoMedicacao am) {
		adminMed.put(codigo, am);
	}

	
	public static void adicionarPreparacaoMedicacao(int codigo, PreparacaoMedicacao pm) {
		PreparaMed.put(codigo, pm);
	}
	
	public static PreparacaoMedicacao devolverPrepMedicacao(int codigo) {
		return PreparaMed.get(codigo);
	}
	
	
	
	public static void inserirDoente(Integer codigo, Doente doente) {
		doentes.put(codigo, doente);
	}
	
	public static Doente devolverDoente(Integer codigo) {
		return doentes.get(codigo);
	}
	
	
	public static void inserirEnfermeiro(int codigo, Enfermeiro enf) {
		enfermeiros.put(codigo, enf);
	}
	
	public static Enfermeiro devolverEnfermeiro(int codigo) {
		return enfermeiros.get(codigo);
	}
	
	
	
	public static Medico devolverMedico(Integer codigo) {
		return medicos.get(codigo);
	}
	
	public static void inserirMedico(int codigo, Medico medico) {
		medicos.put(codigo, medico);
	}
	
	public static void inserirFuncAdmin(Integer codigo, FuncionarioAdministrativo func) {
		funcadmin.put(codigo, func);
	}
	
	public static FuncionarioAdministrativo devolverFuncAdmin(Integer codigo) {
		return funcadmin.get(codigo);
	}
	
	public static void inserirEntrada(Integer codigo, Entrada entrada) {
		entradas.put(codigo, entrada);
	}
	
	public static Entrada devolverEntrada(Integer codigo) {
		return entradas.get(codigo);
	}
	public static void adicionarPrescricao(int codigo,Prescricao p) {
		prescricao.put(codigo, p);
	}
	
	public static Prescricao devolverPrescricao(int codigo) {
		return prescricao.get(codigo);
	}
}
