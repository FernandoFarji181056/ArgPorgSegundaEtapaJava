package sistemaDeIncidentes.tecnicos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tecnico {
    private int idTecnico;
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private String mail;
    private TipoDocumento tipoDocumento;
    private int reclamosAsignados;//cantidad de reclamos activos asignados
    private int reclamosResueltos;//cantidad de reclamos cerrados

    private Date tiempoPromedio = new Date(2023,2,12,05,13,20);//guardo el tiempo promedio por reclamo
    private List<Especialidades> especialidad;
    //private List<int> entero;

    public Tecnico(String nombre, String apellido, String numeroDocumento, TipoDocumento tipoDocumento) {
        this.especialidad = new ArrayList<>();
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.tipoDocumento = tipoDocumento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void agregarEspecialidad (Especialidades especialidad){
        this.especialidad.add(especialidad);

    }
    public void eliminarEspecialidad (Especialidades especialidad){
        this.especialidad.remove(especialidad);
    }
    public boolean tieneEspecialidades (Especialidades especialidad){
        return this.especialidad.contains(especialidad);
    }

    public int cantEspecialidades(){
        return this.especialidad.size();
    }

    public List<Especialidades> getEspecialidades() {
        return especialidad;
    }

    public void setEspecialidades(List<Especialidades> especialidad) {
        this.especialidad = especialidad;
    }



}
