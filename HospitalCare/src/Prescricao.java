import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Prescricao {
	
	//Atributos dos relacionamentos
		protected Medico medico;
		protected Doente doente;
		protected ArrayList<HorarioToma>  horariosToma= new ArrayList<HorarioToma>();
		//Atributos da Prescricao
		protected LocalDateTime data;
		protected int codigo;
		
		public Prescricao() {
			
		}

		public Prescricao(int codigo,Medico medico,
                Doente doente,
                java.time.LocalDateTime data) {
			super();
			this.medico = medico;
			this.doente = doente;
			this.codigo = codigo;
			this.data = data;
		}
		

		public void adicionarHToma(HorarioToma ht) {
			this.horariosToma.add(ht);
		}
		
		public ArrayList<HorarioToma> getHorariosTomas(){
			return horariosToma;
		}
		
	
}
