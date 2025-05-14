package co.edu.uniquindio.poo.proyectofinal.Model;
import java.util.List;
import java.util.LinkedList;

//movi el constructor y una variable ;)

public class HistorialMedico {
    private String id;
    private Paciente paciente;
    private List<RegistroMedico> lista = new LinkedList<RegistroMedico>();
    
    public HistorialMedico(String id, List<RegistroMedico> lista) {
        this.lista = lista;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
