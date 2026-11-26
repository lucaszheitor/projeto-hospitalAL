
public class Enfermeiro extends Profissional{
	private String coren;
	private String setor;
	
	public Enfermeiro(int codigo, String nome, String cpf, String coren, String setor) throws Exception {
		super(codigo, nome, cpf);
		
		if(coren == null || coren.isBlank()) {
			throw new Exception("CRM inválido.");
		}
		if(setor == null || setor.isBlank()) {
			throw new Exception("CRM inválido.");
		}
		this.coren = coren;
		this.setor = setor;
	}
	
	public String getCoren() {
		return coren;
	}
	
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	@Override
	public void atender() {
		System.out.println("Enfermeiro " + getNome() + " está realizando um atendimento no setor " + setor + ".");
	}
	@Override
	public String toString() {
		return super.toString() + 
				"\nCOREN: " + coren + 
				"\nSetor" + setor;
	}
}
