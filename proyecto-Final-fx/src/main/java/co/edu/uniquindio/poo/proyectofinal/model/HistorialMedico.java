package co.edu.uniquindio.poo.proyectofinal.model;
import java.util.List;
import java.util.LinkedList;

//movi el constructor y una variable ;)

public class HistorialMedico {
    private String idHistorialMedico;
    private Paciente paciente;
    private List<RegistroMedico> lista = new LinkedList<RegistroMedico>();
    
    public HistorialMedico(String idHistorialMedico, Paciente paciente, List<RegistroMedico> lista) {
        this.lista = lista;
        this.paciente = paciente;
        this.idHistorialMedico = idHistorialMedico;
    }

    public HistorialMedico() {

    }

    public HistorialMedico(String number, Object o) {
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public List<RegistroMedico> getLista() {
        return lista;
    }

    public void setLista(List<RegistroMedico> lista) {
        this.lista = lista;
    }

    public String getIdHistorialMedico() {
        return idHistorialMedico;
    }

    public void setIdHistorialMedico(String idHistorialMedico) {
        this.idHistorialMedico = idHistorialMedico;
    }



    public void buscarPaciente(String id, List<Paciente> pacientes){
for(Paciente p : pacientes){
    if(p.getId().equals(id)){
        this.paciente=p;
        break;
        }
    }

}
//Requiero su ayuda en esta   
public void agregarRegistro(){

}

public void mostrarRegistro(){
    
}
    
}
