package org.example;

import sistemaDeIncidentes.tecnicos.Tecnico;
import sistemaDeIncidentes.tecnicos.TecnicosList;
import sistemaDeIncidentes.tecnicos.TipoDocumento;
import sistemaDeIncidentes.tecnicos.Especialidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static sistemaDeIncidentes.tecnicos.Especialidades.ALMACENAMIENTO;
import static sistemaDeIncidentes.tecnicos.Especialidades.REDES;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TecnicosList tecnicosList = new TecnicosList();


        //System.out.println( "Hello World!" );
        Tecnico tecnico01 = new Tecnico("Jose","Hernandez","30452366511", TipoDocumento.CUIT_CUIL);
        System.out.println( tecnico01.getApellido());
        tecnico01.agregarEspecialidad(Especialidades.REDES);
        tecnico01.agregarEspecialidad(Especialidades.ALMACENAMIENTO);
        tecnicosList.agregarTecnico(tecnico01);


        Tecnico tecnico02 = new Tecnico("Juan","Perez","30230036064", TipoDocumento.CUIT_CUIL);
        System.out.println( tecnico02.getApellido());
        tecnico02.agregarEspecialidad(Especialidades.REDES);
        tecnico02.agregarEspecialidad(Especialidades.SISTEMAS_OPERATIVOS);
        tecnicosList.agregarTecnico(tecnico02);

        Tecnico tecnico03 = new Tecnico("Sebastian","Volpin","27332541521", TipoDocumento.CUIT_CUIL);
        System.out.println( tecnico03.getApellido());
        tecnico03.agregarEspecialidad(Especialidades.SOFTWARE);
        tecnico03.agregarEspecialidad(Especialidades.SISTEMAS_OPERATIVOS);
        tecnicosList.agregarTecnico(tecnico03);

        Tecnico tecnico04 = new Tecnico("Ignacio","Gonzalez","20152335224", TipoDocumento.CUIT_CUIL);
        System.out.println( tecnico04.getApellido());
        tecnico04.agregarEspecialidad(Especialidades.IMPRESORAS);
        tecnico04.agregarEspecialidad(Especialidades.SISTEMAS_OPERATIVOS);
        tecnicosList.agregarTecnico(tecnico04);

        System.out.println("Vemos la cantidad de tecnicos cargados:");

        System.out.println(tecnicosList.cantTecnicos());

        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("Las especialidades del Tecnico " + tecnico01.getApellido() + " son:");
        System.out.println(tecnico01.getEspecialidades());
        System.out.println("--------------------------------------");
        System.out.println("Las especialidades del Tecnico " + tecnico02.getApellido() + " son:");
        System.out.println(tecnico02.getEspecialidades());
        System.out.println("--------------------------------------");
        System.out.println("Las especialidades del Tecnico " + tecnico03.getApellido() + " son:");
        System.out.println(tecnico03.getEspecialidades());
        System.out.println("--------------------------------------");
        System.out.println("Las especialidades del Tecnico " + tecnico04.getApellido() + " son:");
        System.out.println(tecnico04.getEspecialidades());
        System.out.println("--------------------------------------");




        if (tecnico04.tieneEspecialidades(Especialidades.SISTEMAS_OPERATIVOS)){
            System.out.println( "Si, contiene" );
        }
        else {
            System.out.println("No contiene");
        }



    }
}
