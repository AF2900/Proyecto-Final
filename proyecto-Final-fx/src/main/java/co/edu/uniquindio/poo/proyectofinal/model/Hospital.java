package co.edu.uniquindio.poo.proyectofinal.model;
import java.time.LocalDate;
import java.util.LinkedList;

public class Hospital {
    private String nombre;
    private String nit;
    private LinkedList<Cita> listCitas;
    private LinkedList<Medico> listMedicos;
    private LinkedList<Paciente> listPacientes;
    private LinkedList<RegistroMedico>listRegistro;
    private LinkedList<HistorialMedico>listHistorial;

    private LinkedList<Sala>listSalas;


    public Hospital(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.listCitas = new LinkedList<>();
        this.listMedicos = new LinkedList<>();
        this.listPacientes = new LinkedList<>();
        this.listSalas = new LinkedList<>();

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

    public LinkedList<RegistroMedico> getListRegistro() {
        return listRegistro;
    }

    public void setListRegistro(LinkedList<RegistroMedico> listRegistro) {
        this.listRegistro = listRegistro;
    }
    public LinkedList<HistorialMedico> getListHistorial() {
    return listHistorial;
    }

    public void setListHistorial(LinkedList<HistorialMedico> listHistorial) {
    this.listHistorial = listHistorial;
    }

    public LinkedList<Sala> getListSalas() {
        return listSalas;
    }

    public void setListSalas(LinkedList<Sala> listSalas) {
        this.listSalas = listSalas;
    }


//==================================================================================================================
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
                listMedicos.set(i, medico);
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
//====================================================================================================================
// CRUD Paciente

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
                listPacientes.set(i, paciente);
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

//==================================================================================================================
// CURD de citas

    public boolean crearCita(Cita cita) {
        for (Cita c : listCitas) {
            if (c.getId().equals(cita.getId())) {
                return false;
            }
        }
        listCitas.add(cita);
        return true;
    }

    public Cita leerCita(String idCita) {
        for (Cita c : listCitas) {
            if (c.getId().equalsIgnoreCase(idCita)) {
                return c;
            }
        }
        return null;
    }

    public boolean modificarCita(Cita cita) {
        for (int i = 0; i < listCitas.size(); i++) {
            if (listCitas.get(i).getId().equalsIgnoreCase(cita.getId())) {
                listCitas.set(i, cita);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarCita(Cita cita) {
        boolean flag = false;
        for (Cita c : listCitas) {
            if (c.getId().equalsIgnoreCase(cita.getId())) {
                listCitas.remove(c);
                flag = true;
                break;
            }
        }
        return flag;
    }


//==================================================================================================================
//solicitar Cita


    public boolean solicitarCita(Paciente paciente, Medico medico, String fecha, String hora, String idCita) {
        for (Cita c : listCitas) {
            if (c.getFecha().equals(fecha) && c.getHora().equals(hora)) {
                if (c.getMedico().equals(medico)) {
                    System.out.println("El médico no está disponible en ese horario.");
                    return false;
                }
                if (c.getPaciente().equals(paciente)) {
                    System.out.println("El paciente ya tiene una cita en ese horario.");
                    return false;
                }
            }
        }

        Cita nuevaCita = new Cita( idCita, fecha, hora, medico,paciente);
        listCitas.add(nuevaCita);
        return true;
    }


//==================================================================================================================
//cancelar Cita
public boolean cancelarCitaPorId(String idCita) {
    for (Cita c : listCitas) {
        if (c.getId().equals(idCita)) {
            listCitas.remove(c);
            System.out.println("Cita cancelada correctamente.");
            return true;
        }
    }
    System.out.println("No se encontró una cita con ese ID.");
    return false;
}


//==================================================================================================================
// Funcionalidades para Pacientes

public boolean crearRegistro(RegistroMedico registroMedico){
        boolean flag = false;
        for (RegistroMedico r : listRegistro) {
            if (r.getId().equals(registroMedico.getId())) {
                return flag;
            }
            listRegistro.add(registroMedico);
            flag = true;
        }
        return flag;
}

public RegistroMedico buscarRegistro(String id) {
        for (RegistroMedico r : listRegistro) {
            if (r.getId().equalsIgnoreCase(id)) {
                return r;
            }
        }
        return null;
     }

     //Pendiente
public void enviarRecordatorio() {
    LocalDate hoy = LocalDate.now();
    for (Cita cita : listCitas) {
        LocalDate fechaCita = cita.getFecha(); // obtengo la fecha de la cita
        if (!hoy.isAfter(fechaCita) && !hoy.isBefore(fechaCita.minusDays(1))) {
            
        }
    }
}

//==================================================================================================================
//Funciones de Médicos

public boolean crearHistorial(HistorialMedico historial){
        boolean flag = false;
        for (HistorialMedico r : listHistorial) {
            if (r.getId().equals(historial.getId())) {
                return flag;
            }
            listHistorial.add(historial);
            flag = true;
        }
        return flag;
}

public HistorialMedico buscarHistorialMedico(String id) {
        for (HistorialMedico r : listHistorial) {
            if (r.getId().equalsIgnoreCase(id)) {
                return r;
            }
        }
        return null;
     }
//==================================================================================================================
//Otro que necesita FX

public void mostrarHistorialMedico(String id) {
    HistorialMedico historial = buscarHistorialMedico(id); 

    if (historial != null) {
        
    }
}

//=====================================================================================================================
//Funciones respecto al admin

public boolean agregarSala(Sala sala) {
    boolean flag = false;
    for (Sala s : listSalas) {
        if (s.getId().equalsIgnoreCase(sala.getId())) {
            return flag;
        }
    }
    listSalas.add(sala);
    flag = true;
    return flag;
}

    public boolean modificarSala(Sala sala) {
        for (int i = 0; i < listSalas.size(); i++) {
            if (listSalas.get(i).getId().equalsIgnoreCase(sala.getId())) {
                listSalas.set(i, sala);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarSala(Sala sala) {
        return listSalas.removeIf(s -> s.getId().equalsIgnoreCase(sala.getId()));
    }

    public Sala buscarSala(String id) {
        for (Sala sala : listSalas) {
            if (sala.getId().equalsIgnoreCase(id)) {
                return sala;
            }
        }
        return null;
    }
//==================================================================================================================
//Asignar paciente al medico

    public boolean asignarPacienteAMedico(Paciente paciente, Medico medico) {
        if (medico.getListPacientes().size() >= 5) {
            return false;
        }
        medico.getListPacientes().add(paciente);
        return true;
    }
//==================================================================================================================
// Obtener Medicos Disponibles

    public LinkedList<Medico> obtenerMedicosDisponibles() {
        LinkedList<Medico> disponibles = new LinkedList<>();
        for (Medico m : listMedicos) {
            if (m.getListPacientes().size() < 5) {
                disponibles.add(m);
            }
        }
        return disponibles;
    }

//==================================================================================================================
// Generar reporte de citas
    public String generarReporteCitas() {
        StringBuilder reporte = new StringBuilder();
        for (Cita c : listCitas) {
            reporte.append("Cita ID: ").append(c.getId())
                    .append(", Paciente: ").append(c.getPaciente().getNombre())
                    .append(", Médico: ").append(c.getMedico().getNombre())
                    .append(", Fecha: ").append(c.getFecha())
                    .append("\n");
        }
        return reporte.toString();
    }
//==================================================================================================================
// Generar reporte de ocupacion

    public String generarReporteOcupacion() {
        StringBuilder reporte = new StringBuilder();
        for (Sala sala : listSalas) {
            reporte.append("Sala: ").append(sala.nombre)
                    .append(", Capacidad: ").append(sala.capacidad)
                    .append(", Ocupación actual: ").append(sala.getPacientesAsignados().size())
                    .append("\n");
        }
        return reporte.toString();
    }

}