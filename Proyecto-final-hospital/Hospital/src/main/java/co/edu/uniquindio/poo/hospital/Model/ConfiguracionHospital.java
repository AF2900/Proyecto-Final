package co.edu.uniquindio.poo.hospital.Model;

public class ConfiguracionHospital {
    private static ConfiguracionHospital instance;
    private String horarioAtencion;
    private int maxPacientes;
    private String reglasFacturacion;

    private ConfiguracionHospital() {
        this.horarioAtencion = "7:00 AM - 7:00 PM";
        this.maxPacientes = 50;
        this.reglasFacturacion = "xxxxxxx";
    }


    public static ConfiguracionHospital getInstance() {
        if (instance == null) {
            instance = new ConfiguracionHospital();
        }
        return instance;
    }


    public static void setInstance(ConfiguracionHospital instance) {
        ConfiguracionHospital.instance = instance;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public int getMaxPacientes() {
        return maxPacientes;
    }

    public void setMaxPacientes(int maxPacientes) {
        this.maxPacientes = maxPacientes;
    }

    public String getReglasFacturacion() {
        return reglasFacturacion;
    }

    public void setReglasFacturacion(String reglasFacturacion) {
        this.reglasFacturacion = reglasFacturacion;
    }


    @Override
    public String toString() {
        return "ConfiguracionHospital{" +
                "horarioAtencion='" + horarioAtencion + '\'' +
                ", maxPacientes=" + maxPacientes +
                ", reglasFacturacion='" + reglasFacturacion + '\'' +
                '}';
    }
}



