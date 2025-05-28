package co.edu.uniquindio.poo.hospital.Model;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Hospital Hospital = new Hospital("San Juan de Dios");

        HistorialMedico hm = new HistorialMedico("H1");
        HistorialMedico hm2 = hm.clone();
        hm2.setCodigoHistorial("H2");
        HistorialMedico hm3 = hm.clone();
        hm3.setCodigoHistorial("H3");

        Paciente paciente1 = new Paciente("Dutch", "Vanderlinde", "0001", "445521", "Nowhere", 54, new HistorialMedico("232320"));
        Paciente paciente2 =new Paciente(null, null, null, null, null, 32, new HistorialMedico("232321"));
        Paciente paciente3 = new Paciente(null, null, null, null, null, 23, new HistorialMedico("232322"));

        Doctor doctor1 = new Doctor("King", "Grimlock", "004321", "55501'-SMASH", 33, Especialidad.CARDIOLOGIA);
        Doctor doctor2 = new Doctor("Ratchet", "Bot", "09862131", "00001", 29, Especialidad.MEDICINA_GENERAL);
        Doctor doctor3 = new Doctor("WD", "Gaster", "null", "000.1-VOID", 38, Especialidad.PSIQUIATRIA);

        Medicamento medicamento3 = new Medicamento("M3","Ibuprofeno",4);
        Medicamento medicamento2 = new Medicamento("M2","Acetaminofen",10);
        Medicamento medicamento = new Medicamento("M1","metacarbamol",100);

        /**Consulta consulta1 = new Consulta("Con1", LocalDate.of(2014,4,8),"dhhsdhg", paciente1, doctor1, medicamento);
        Consulta consulta2 = new Consulta("Con2",LocalDate.now(),"Cancer",paciente2,doctor2,medicamento2);
        Consulta consulta3 = new Consulta("Con3",LocalDate.now(),"Cancer",paciente3,doctor3,medicamento3);*/

        CitaMedica cita1 = new CitaMedica("Ci1",LocalDate.now(),10,doctor1,paciente1);
        CitaMedica cita2 = new CitaMedica("CI2",LocalDate.now(),10,doctor2,paciente2 );
        CitaMedica cita3 = new CitaMedica("CI3",LocalDate.of(2025,4,4),14,doctor3,paciente3);





        /**hm.agregarConsulta(consulta1);
        hm2.agregarConsulta(consulta2);
        hm3.agregarConsulta(consulta3);*/

        Hospital.agregarPaciente(paciente1);
        Hospital.agregarPaciente(paciente2);
        Hospital.agregarPaciente(paciente3);

        Hospital.reservarCita(cita1);
        Hospital.reservarCita(cita2);
        Hospital.reservarCita(cita3);

        Hospital.agregarDoctor(doctor1);
        Hospital.agregarDoctor(doctor2);
        Hospital.agregarDoctor(doctor3);

        //hola

        System.out.println("hola");
        System.out.println("hola2");


        System.out.println(hm);
        System.out.println(hm2);
        System.out.println(hm);
    }
}