
public class Consulta implements Agendavel{
	private int codigo;
	private String data;
	private String horario;
	private StatusAtendimento status;
	private Paciente paciente;
	private Medico medico;
	
	public Consulta(int codigo, String data, String horario, StatusAtendimento status, Paciente paciente, Medico medico) throws Exception {
		if(codigo <= 0) {
			throw new Exception("Código inválido.");
		}
		if(data == null || data.isBlank()) {
			throw new Exception("Data inválida.");
		}
		if(horario == null || horario.isBlank()) {
			throw new Exception("Horário inválido.");
		}
		if(status == null) {
			throw new Exception("Status inválido.");
		}
		if(paciente == null) {
			throw new Exception("Paciente inválido.");
		}
		if(medico == null) {
			throw new Exception("Médico inválido.");
		}
		
		this.codigo = codigo;
		this.data = data;
		this.horario = horario;
		this.status = status;
		this.paciente = paciente;
		this.medico = medico;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public String getData() {
		return data;
	}

	public String getHorario() {
		return horario;
	}

	public StatusAtendimento getStatus() {
		return status;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	@Override
	public void agendar() {
		if (status != StatusAtendimento.AGENDADO) {
			System.out.println("Não é possível agendar esta consulta.");
		}
		System.out.println("Consulta agendada com sucesso.");
	}
	
	@Override
	public void cancelar() {
		
		if (status == StatusAtendimento.REALIZADO) {
			System.out.println("Não é possível cancelar uma consulta já realizada.");
		}
		
		if (status == StatusAtendimento.CANCELADO) {
			System.out.println("A consulta já está cancelada.");
		}
		
		status = StatusAtendimento.CANCELADO;
		System.out.println("Consulta cancelada com sucesso.");
	}
	
	@Override
	public void realizar() throws Exception {
		if (status != StatusAtendimento.AGENDADO) {
			throw new Exception("Somente consultas agendadas podem ser realizadas.");
		}
		status = StatusAtendimento.REALIZADO;
	}


	@Override
	public String toString() {
		return "Código da consulta: " + codigo + 
				"\nData: " + data + 
				"\nHorário: " + horario + 
				"\nPaciente: " + paciente.getNome() + 
				"\nMédico: " + medico.getNome() + 
				"\nEspecialidade: " + medico.getEspecialidade() + 
				"\nStatus: " + status;
	}
}
