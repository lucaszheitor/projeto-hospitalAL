
public class Paciente {
	private int codigo;
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String tipoSanguineo;
	
	public Paciente(int codigo, String nome, String cpf, String dataNascimento, String tipoSanguineo) throws Exception {
		if(codigo <= 0) {
			throw new Exception("Código inválido.");
		}
		if(nome == null || nome.isBlank()) {
			throw new Exception("Nome inválido.");
		}
		if(cpf == null || cpf.isBlank()) {
			throw new Exception("CPF inválido.");
		}
		if(dataNascimento == null || dataNascimento.isBlank()) {
			throw new Exception("Data de nascimento inválida.");
		}
		if(tipoSanguineo == null || tipoSanguineo.isBlank()) {
			throw new Exception("Tipo sanguíneo inválido.");
		}
		
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.tipoSanguineo = tipoSanguineo;
	}

	public int getCodigo() {return codigo;}

	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}

	public String getCpf() {return cpf;}
	
	public String getDataNascimento() {return dataNascimento;}

	public String getTipoSanguineo() {return tipoSanguineo;}
	
	@Override
	public String toString() {
		return "Código: " + codigo + 
				"\nNome:" + nome + 
				"\nCPF: " + cpf + 
				"\nData de nascimento: " + dataNascimento + 
				"\nTipo sanguíneo: " + tipoSanguineo;
	}

}
