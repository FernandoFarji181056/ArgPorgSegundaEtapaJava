package sistemaDeIncidentes.tecnicos;

import java.util.ArrayList;
import java.util.List;

public class TecnicosList {
    private List<Tecnico> tecnicosList;
/*
    public TecnicosList(List<Tecnico> tecnico) {
        //this.tecnico = tecnico;
        this.tecnicos = new ArrayList<>();
        //this.especialidad = new ArrayList<>();
    }*/

    public TecnicosList() {
        this.tecnicosList = new ArrayList<>();
    }

    public void agregarTecnico (Tecnico tecnico){
        this.tecnicosList.add(tecnico);

    }
    public void eliminarTecnico (Tecnico tecnico){
        this.tecnicosList.remove(tecnico);
    }
  //  public boolean tieneEspecialidades (Especialidades especialidad){
  //      return this.especialidad.contains(especialidad);
  //  }

    public int cantTecnicos(){
        return this.tecnicosList.size();
    }

   // public List<Especialidades> getEspecialidades() {
  //      return especialidad;
   // }

//    public void setEspecialidades(List<Especialidades> especialidad) {
  //      this.especialidad = especialidad;
   // }

}
