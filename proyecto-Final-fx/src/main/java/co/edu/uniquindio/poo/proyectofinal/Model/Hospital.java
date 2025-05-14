package co.edu.uniquindio.poo.proyectofinal.Model;
import java.util.LinkedList;

public class Hospital {
    private String nombre;
    private String nit;
    private LinkedList<Cita> listCitas;
    private LinkedList<Medico> listMedicos;
    private LinkedList<Paciente> listPacientes;


    public Hospital(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.listCitas = new LinkedList<>();
        this.listMedicos = new LinkedList<>();
        this.listPacientes = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public LinkedList<Cita> getListCitas() {
        return listCitas;
    }

    public void setListCitas(LinkedList<Cita> listCitas) {
        this.listCitas = listCitas;
    }

    public LinkedList<Medico> getListMedicos() {
        return listMedicos;
    }

    public void setListMedicos(LinkedList<Medico> listMedicos) {
        this.listMedicos = listMedicos;
    }

    public LinkedList<Paciente> getListPacientes() {
        return listPacientes;
    }

    public void setListPacientes(LinkedList<Paciente> listPacientes) {
        this.listPacientes = listPacientes;
    }

    //CRUD de Medico
    public boolean addMedico(Medico medico) {
        boolean flag = false;
        for (Medico m : listMedicos) {
            if (m.getNombre().equals(medico.getNombre())) {
                return flag;
            }
            listMedicos.add(medico);
            flag = true;
        }
        return flag;
    }

    public Medico leerMedico(String nombre) {
        for (Medico m : listMedicos) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                return m;
            }
        }
        return null;
    }

    public boolean modificarMedico(Medico medico) {
        for (int i = 0; i < listMedicos.size(); i++) {
            if (listMedicos.get(i).getNombre().equalsIgnoreCase(medico.getNombre())) {
                listMedicos.set(i, medico); // Reemplaza con nuevos datos
                return true;
            }
        }
        return false;
    }

    public boolean eliminarMedico(Medico medico) {
        boolean flag = false;
        for (Medico m : listMedicos) {
            if (m.getId().equalsIgnoreCase(medico.getId())) {
                listMedicos.remove(m);
                flag = true;
                break;
            }
        }
        return flag;
    }

    //CRUD Paciente
    public boolean addPaciente(Paciente paciente) {
        boolean flag = false;
        for (Paciente p : listPacientes) {
            if (p.getNombre().equals(paciente.getNombre())) {
                return flag;
            }
            listPacientes.add(paciente);
            flag = true;
        }
        return flag;
    }

    public Paciente leerPaciente(String nombre) {
        for (Paciente p : listPacientes) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
    public boolean modificarPaciente(Paciente paciente) {
        for (int i = 0; i < listPacientes.size(); i++) {
            if (listPacientes.get(i).getNombre().equalsIgnoreCase(paciente.getNombre())) {
                listPacientes.set(i, paciente); // Reemplaza con nuevos datos
                return true;
            }
        }
        return false;
    }

    public boolean eliminarPaciente(Paciente paciente) {
        boolean flag = false;
        for (Paciente p : listPacientes) {
            if (p.getId().equalsIgnoreCase(paciente.getId())) {
                listPacientes.remove(p);
                flag = true;
                break;
            }
        }
        return flag;
    }
    
}
