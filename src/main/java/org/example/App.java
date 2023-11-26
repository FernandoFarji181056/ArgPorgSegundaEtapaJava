package org.example;

import sistemaDeIncidentes.tecnicos.Tecnico;
import sistemaDeIncidentes.tecnicos.TecnicosList;
import sistemaDeIncidentes.tecnicos.TipoDocumento;
import sistemaDeIncidentes.tecnicos.Especialidades;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.function.ToDoubleBiFunction;

import static sistemaDeIncidentes.tecnicos.Especialidades.ALMACENAMIENTO;
import static sistemaDeIncidentes.tecnicos.Especialidades.REDES;

public class App

{
    static LocalDateTime fecha01=LocalDateTime.now();

    //static LocalDateTime fecha02=LocalDateTime.now();

    //static long tiempo_transcurrido = fecha02.getMinute() - fecha01.getMinute();
    //static LocalDate fecha03=LocalDate.parse("2023-01-10");

   // private static Time tiempoPromedio02=new Time(12,4,3);
   // private static Time tiempoPromedio03=new Time(1,4,3);
   // private static Time tiempoPromedio04=new Time(1,4,3);
   // tiempoPromedio04=tiempopromedio02 + tiempopromedio03;
    //private static Date tiempoPromedio = new Date(2023,2,12,05,13,20);//guardo el tiempo promedio por reclamo
    public static void main( String[] args )
    {

        TecnicosList tecnicosList = new TecnicosList();

        System.out.println( "Original02" );
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
        System.out.println(fecha01);
        LocalDateTime fecha02=LocalDateTime.now();
        System.out.println(fecha02);
        long tiempo_transcurrido = fecha02.getNano()- fecha01.getNano();
        System.out.println(tiempo_transcurrido);// con estas lineas estoy probando como hacer para restar tiempos para saber cuanto tardó el tecnico en solucionar el Incidente
        //todavía me falta mucho, despues tengo que persistir. Esto va en otra clase, solo estoy probando
        //me falta recorrer la coleccion de tecnicos para saber cuales pueden encargarse de ese problema
        //luego, de esos, ver cuales tienen menos Incidentes activos, luego asignarele el incidiente y guardar la fecha
        //luego cerrar los incidentes, y actualizar todo una vez cerrado (cantidad de incidentes de cada tecnico y promedio)


    }
}
