import java.util.ArrayList;
import java.util.HashMap;

public class SistemaHospital {

    private HashMap<Integer, Paciente> pacientes;
    private HashMap<Integer, Profissional> profissionais;
    private ArrayList<Agendavel> atendimentos;

    public SistemaHospital() {

        pacientes = new HashMap<>();
        profissionais = new HashMap<>();
        atendimentos = new ArrayList<>();
    }
    
	public boolean cadastrarPaciente(Paciente paciente) throws Exception {
		
		if (pacientes.containsKey(paciente.getCodigo())) {
			throw new Exception("Já existe um paciente cadastrado com esse código.");
		}
		
		pacientes.put(paciente.getCodigo(), paciente);
		return true;
	}    
	
	public boolean cadastrarMedico(Medico medico) throws Exception {

	    if (profissionais.containsKey(medico.getCodigo())) {
	        throw new Exception(
	            "Já existe um profissional cadastrado com esse código."
	        );
	    }

	    profissionais.put(medico.getCodigo(), medico);

	    return true;
	}
	

	public boolean cadastrarEnfermeiro(Enfermeiro enfermeiro) throws Exception {

	    if (profissionais.containsKey(enfermeiro.getCodigo())) {
	        throw new Exception(
	            "Já existe um profissional cadastrado com esse código."
	        );
	    }

	    profissionais.put(enfermeiro.getCodigo(), enfermeiro);

	    return true;
	}

	public boolean cadastrarAtendimento(Agendavel atendimento) throws Exception {

	    for (Agendavel a : atendimentos) {
	        if (a.getCodigo() == atendimento.getCodigo()) {
	            throw new Exception(
	                "Já existe um atendimento com esse código."
	            );
	        }
	    }

	    atendimentos.add(atendimento);

	    return true;
	}
	
	public String consultarPaciente(int codigo) {
		
		Paciente paciente = buscarPaciente(codigo);
		if (paciente == null) {
			return "Paciente não encontrado.";
			
		}
		
		return paciente.toString();
	}
	
	public String consultarProfissional(int codigo) {
		Profissional profissional = buscarProfissional(codigo);
		
		if (profissional == null) {
			return "Profissional não encontrado.";
			
		}
		
		return profissional.toString();
	}
	
	public String consultarAtendimento(int codigo) {
		Agendavel atendimento = buscarAtendimento(codigo);
		
		if (atendimento == null) {
			return "Atendimento não encontrado.";
			
		}
		
		return atendimento.toString();
	}

    private Paciente buscarPaciente(int codigo) {
        return pacientes.get(codigo);
    }

	private Profissional buscarProfissional(int codigo) {
		return profissionais.get(codigo);
	}
	
	private Agendavel buscarAtendimento(int codigo) {
		for (Agendavel atendimento : atendimentos) {
			if (atendimento.getCodigo() == codigo) {
				return atendimento;
			}
		}
		return null;
	}
	
	public String listarPacientes() {
		String resultado = "";
		
		for (Paciente paciente : pacientes.values()) {
			resultado += paciente + "\n\n";
			
		}
		
		return resultado;
	}
	
	public String listarProfissionais() {

	    String resultado = "";

	    for (Profissional profissional : profissionais.values()) {
	        resultado += profissional + "\n\n";
	    }

	    return resultado;
	}
	
	public String listarAtendimentos() {

	    String resultado = "";

	    for (Agendavel atendimento : atendimentos) {
	        resultado += atendimento + "\n\n";
	    }

	    return resultado;
	}
	
	public String agendarAtendimento(int codigo) throws Exception {

	    Agendavel atendimento = buscarAtendimento(codigo);

	    if (atendimento == null) {
	        throw new Exception("Atendimento não encontrado.");
	    }

	    atendimento.agendar();

	    return "Atendimento agendado com sucesso.";
	}

	public String cancelarAtendimento(int codigo) throws Exception {

	    Agendavel atendimento = buscarAtendimento(codigo);

	    if (atendimento == null) {
	        throw new Exception("Atendimento não encontrado.");
	    }

	    atendimento.cancelar();

	    return "Atendimento cancelado com sucesso.";
	}

	public String realizarAtendimento(int codigo) throws Exception {

	    Agendavel atendimento = buscarAtendimento(codigo);

	    if (atendimento == null) {
	        throw new Exception("Atendimento não encontrado.");
	    }

	    atendimento.realizar();

	    return "Atendimento realizado com sucesso.";
	}


}