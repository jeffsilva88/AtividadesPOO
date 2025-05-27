package exercicios.Ex04;

public class Consulta {
    private Paciente paciente;
    private String data;
    private String hora;

    public Consulta(Paciente paciente, String data, String hora) {
        this.paciente = paciente;
        this.data = data;
        this.hora = hora;
    }

    public void exibirConsulta() {
        System.out.println("==== Consulta Agendada ====");
        paciente.exibirDados();
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("===========================\n");
    }

    // Getters e Setters
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
