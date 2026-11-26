
public abstract class Profissional {
	private int codigo;
	private String nome;
	private String cpf;
	
	public Profissional(int codigo, String nome, String cpf) throws Exception{
		
		if(codigo <= 0) {
			throw new Exception("Código inválido.");
		}
		
		if(nome == null || nome.isBlank()) {
			throw new Exception("Nome inválido.");
		}
		
		if(cpf == null || cpf.isBlank()) {
			throw new Exception("CPF inválido.");
		}
		
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	public int getCodigo() {return codigo;}
	
	public String getNome() {return nome;}
	
	public String getCpf() {return cpf;}

    public abstract void atender();

    @Override
    public String toString() {
        return "Código: " + codigo +
               "\nNome: " + nome +
               "\nCPF: " + cpf;
    }

}
