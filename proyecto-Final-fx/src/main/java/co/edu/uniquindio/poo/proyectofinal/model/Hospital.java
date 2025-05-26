package co.edu.uniquindio.poo.proyectofinal.model;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Hospital {
    private String nombre;
    private String nit;
    private LinkedList<Cita> listCitas;
    private LinkedList<Medico> listMedicos;
    private LinkedList<Paciente> listPacientes;
    private LinkedList<RegistroMedico>listRegistro;
    private LinkedList<HistorialMedico>listHistorial;
    private LinkedList<Medicamiento> listMedicamiento;

    private LinkedList<Sala>listSalas;


    public Hospital(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.listCitas = new LinkedList<>();
        this.listMedicos = new LinkedList<>();
        this.listPacientes = new LinkedList<>();
        this.listSalas = new LinkedList<>();
        this.listHistorial = new LinkedList<>();
        this.listMedicamiento = new LinkedList<>();

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

    public LinkedList<Medicamiento> getListMedicamiento() {
        return listMedicamiento;
    }

    public void setListMedicamiento(LinkedList<Medicamiento> listMedicamiento) {
        this.listMedicamiento = listMedicamiento;
    }

    //==================================================================================================================
    //CRUD de Medico

    public boolean addMedico(Medico medico) {
    for (Medico m : listMedicos) {
       if (m.getId().equals(medico.getId())) {
            return false;
        }
    }
    listMedicos.add(medico);
    return true;
    }

    public Medico leerMedico(String id) {
        for (Medico m : listMedicos) {
            if (m.getId().equalsIgnoreCase(id)) {
                return m;
            }
        }
        return null;
    }

    public boolean modificarMedico(String id, String nuevoNombre, String nuevoApellido, String nuevoTelefono) {
        for (Medico m : listMedicos) {
            if (m.getId().equalsIgnoreCase(id)) {
                m.setNombre(nuevoNombre);
                m.setApellido(nuevoApellido);
                m.setTelefono(nuevoTelefono);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarMedico(String id) {
        for (int i = 0; i < listMedicos.size(); i++) {
            if (listMedicos.get(i).getId().equalsIgnoreCase(id)) {
                listMedicos.remove(i);
                return true;
            }
        }
        return false;
    }
//====================================================================================================================
// CRUD Paciente

    public boolean addPaciente(Paciente paciente) {
    for (Paciente p : listPacientes) {
       if (p.getId().equals(paciente.getId())) {
            return false;
        }
    }
    listPacientes.add(paciente);
    return true;
}

    public Paciente leerPaciente(String id) {
        for (Paciente p : listPacientes) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminarPaciente(String id) {
        for (int i = 0; i < listPacientes.size(); i++) {
            if (listPacientes.get(i).getId().equalsIgnoreCase(id)) {
                listPacientes.remove(i);
                return true;
            }
        }
        return false;
    }

//==================================================================================================================
// CURD de citas

    public boolean crearCita(Cita cita) {
        for (Cita c : listCitas) {
            if (c.getidCita().equals(cita.getidCita())) {
                return false;
            }
        }
        listCitas.add(cita);
        return true;
    }

    public Cita leerCita(String idCita) {
        for (Cita c : listCitas) {
            if (c.getidCita().equalsIgnoreCase(idCita)) {
                return c;
            }
        }
        return null;
    }
    public boolean modificarCita(String id, Cita nuevaCita) {
        for (int i = 0; i < listCitas.size(); i++) {
            if (listCitas.get(i).getidCita().equalsIgnoreCase(id)) {
                listCitas.set(i, nuevaCita);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarCita(String id) {
        for(int i = 0; i < listCitas.size(); i++) {
            if (listPacientes.get(i).getId().equalsIgnoreCase(id)) {
                listCitas.remove(i);
                return true;
            }
        }
        return false;
    }

//==================================================================================================================
//CRUD MEDICAMENTO

public boolean addMedicamento(Medicamiento medicamento ) {
    for (Medicamiento m : listMedicamiento) {
        if (m.getIdMedicamiento().equals(medicamento.getIdMedicamiento())) {
            return false;
        }
    }
    listMedicamiento.add(medicamento);
    return true;
}

    public Medicamiento leerMedicamento(String idMedicamento) {
        for (Medicamiento m : listMedicamiento) {
            if (m.getIdMedicamiento().equalsIgnoreCase(idMedicamento)) {
                return m;
            }
        }
        return null;
    }

    public boolean modificarMedicamento(String id, String nuevoNombre, double nuevaDosis) {
        for (int i = 0; i < listMedicamiento.size(); i++) {
            if (listMedicamiento.get(i).getIdMedicamiento().equalsIgnoreCase(id)) {
                listMedicamiento.get(i).setNombre(nuevoNombre);
                listMedicamiento.get(i).setDosis(nuevaDosis);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarMedicamento(Medicamiento medicamiento) {
        boolean flag = false;
        for (Cita c : listCitas) {
            if (c.getidCita().equalsIgnoreCase(medicamiento.getIdMedicamiento())) {
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

        Cita nuevaCita = new Cita( idCita, LocalDate.parse(fecha), hora, medico,paciente);
        listCitas.add(nuevaCita);
        return true;
    }


//==================================================================================================================
//cancelar Cita
public boolean cancelarCitaPorId(String idCita) {
    for (Cita c : listCitas) {
        if (c.getidCita().equals(idCita)) {
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
        for (RegistroMedico r : listRegistro) {
            if (r.getIdRegistro().equals(registroMedico.getIdRegistro())) {
                return false;
            }
        }
        listRegistro.add(registroMedico);
        return true;
}

public RegistroMedico buscarRegistro(String id) {
        for (RegistroMedico r : listRegistro) {
            if (r.getIdRegistro().equalsIgnoreCase(id)) {
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
        for (HistorialMedico r : listHistorial) {
            if (r.getIdHistorialMedico().equals(historial.getIdHistorialMedico())) {
                return false;
            }
        }
        listHistorial.add(historial);
        return true;
}

public HistorialMedico buscarHistorialMedico(String id) {
        for (HistorialMedico r : listHistorial) {
            if (r.getIdHistorialMedico().equalsIgnoreCase(id)) {
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
        System.out.println("=== Historial Médico ===");
        System.out.println("ID Historial: " + historial.getIdHistorialMedico());
        System.out.println("Paciente: " + historial.getPaciente().getNombre());

        List<RegistroMedico> registros = historial.getLista();

        if (registros.isEmpty()) {
            System.out.println("No hay registros médicos.");
        } else {
            System.out.println("Registros Médicos:");
            for (RegistroMedico registro : registros) {
                System.out.println("- Fecha: " + registro.getFecha());
                System.out.println("  Diagnóstico: " + registro.getDiagnostico());
                System.out.println("  Tratamiento: " + registro.getTratamiento());
                System.out.println();
            }
        }
    } else {
        System.out.println("No se encontró historial médico para el ID: " + id);
    }
}

//=====================================================================================================================
//Funciones respecto al admin

public boolean agregarSala(Sala sala) {
    for (Sala s : listSalas) {
        if (s.getIdSala().equalsIgnoreCase(sala.getIdSala())) {
            return false;
        }
    }
    listSalas.add(sala);
    return true;
}
    public boolean modificarSala(Sala nuevaSala) {
        String id = nuevaSala.getIdSala();

        for (int i = 0; i < listSalas.size(); i++) {
            Sala salaExistente = listSalas.get(i);
            if (salaExistente.getIdSala().equalsIgnoreCase(id)) {
                listSalas.set(i, nuevaSala);
                return true;
            }
        }
        return false;
    }
    public boolean eliminarSala(Sala sala) {
        return listSalas.removeIf(s -> s.getIdSala().equalsIgnoreCase(sala.getIdSala()));
    }

    public Sala buscarSala(String id) {
        for (Sala sala : listSalas) {
            if (sala.getIdSala().equalsIgnoreCase(id)) {
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
            reporte.append("Cita ID: ").append(c.getidCita())
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
    //==================================================================================================================
// modificar Datos Personales

    public boolean modificarDatosPersonales(String id,String nuevoNombre, String nuevoApellido, String nuevoTelefono, String nuevaDireccion){
        Paciente paciente= leerPaciente(id);
        if(paciente!= null){
            paciente.setNombre(nuevoNombre);
            paciente.setApellido(nuevoApellido);
            paciente.setTelefono(nuevoTelefono);
            return true;
        }
        return false;
    }
}