
public class Exame implements Agendavel{
	private int codigo;
	private String tipo;
	private String data;
	private String horario;
	private Paciente paciente;
	private StatusAtendimento status;
	
	
	public Exame(int codigo, String tipo, String data, String horario, Paciente paciente,StatusAtendimento status) throws Exception {
		if(codigo <= 0) {
			throw new Exception("Código inválido.");
		}
		if(tipo == null || data.isBlank()) {
			throw new Exception("Tipo inválido.");
		}
		if(data == null || data.isBlank()) {
			throw new Exception("Data inválida.");
		}
		if(horario == null || horario.isBlank()) {
			throw new Exception("Horário inválido.");
		}
		if(paciente == null) {
			throw new Exception("Paciente inválido.");
		}
	
		
		this.codigo = codigo;
		this.tipo = tipo;
		this.data = data;
		this.horario = horario;
		this.paciente = paciente;
		this.status = status;
		
	}
	
	public int getCodigo() {
		return codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public String getData() {
		return data;
	}

	public String getHorario() {
		return horario;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public StatusAtendimento getStatus() {
		return status;
	}

	@Override
	public void agendar() {
		if (status != StatusAtendimento.AGENDADO) {
			System.out.println("Não é possível agendar este exame.");
		}
		System.out.println("Exame agendado com sucesso.");
	}
	
	@Override
	public void cancelar() {
		
		if (status == StatusAtendimento.REALIZADO) {
			System.out.println("Não é possível cancelar um exame já realizado.");
		}
		
		if (status == StatusAtendimento.CANCELADO) {
			System.out.println("O exame já está cancelado.");
		}
		
		status = StatusAtendimento.CANCELADO;
		System.out.println("Exame cancelado com sucesso.");
	}
	
	@Override
	public void realizar() throws Exception {
		if (status != StatusAtendimento.AGENDADO) {
			throw new Exception("Somente exames agendados podem ser realizados.");
		}
		status = StatusAtendimento.REALIZADO;
	}

	@Override
	public String toString() {
		return "Código do exame: " + codigo + 
				"\nTipo: " + tipo + 
				"\nData: " + data + 
				"\nHorário: " + horario + 
				"\nPaciente: " + paciente.getNome() + 
				"\nStatus: " + status;
	}
}
