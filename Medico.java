
public class Medico extends Profissional{
	private String crm;
	private Especialidade especialidade;
	
	public Medico(int codigo, String nome, String cpf, String crm, Especialidade especialidade) throws Exception {
		super(codigo, nome, cpf);
		
		if(crm == null || crm.isBlank()) {
			throw new Exception("CRM inválido.");
		}
		
		if(especialidade == null) {
			throw new Exception("Especialidade inválida.");
		}
		
		this.crm = crm;
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public void atender() {
		System.out.println("O médico " + getNome()+ " está realizando um procedimento.");
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nCRM: " + crm + 
				"\nEspecialidade: " + especialidade;
	}
	
	
}
