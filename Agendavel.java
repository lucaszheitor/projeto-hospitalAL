
public interface Agendavel {

    int getCodigo();

    void agendar() throws Exception;

    void cancelar() throws Exception;

    void realizar() throws Exception;
}
