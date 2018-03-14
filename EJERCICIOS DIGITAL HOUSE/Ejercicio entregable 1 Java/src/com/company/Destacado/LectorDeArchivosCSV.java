package com.company.Destacado;

import com.company.Alumno;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LectorDeArchivosCSV {
    private List<String> listaDeAlumnosCSV;
    private List<Alumno> listaDeAlumnosLeidos;

    public LectorDeArchivosCSV() {
        listaDeAlumnosCSV = new ArrayList<>();
        listaDeAlumnosLeidos=new ArrayList<>();
    }

    private static final String separador = ",";

    public void leerCSV() throws IOException {
        BufferedReader br = null;


        try {

            br = new BufferedReader(new FileReader("listadoDeAlumnos.csv"));
            String line = br.readLine();
            while (null != line) {
                String[] fields = line.split(separador);
                line = br.readLine();
                listaDeAlumnosCSV.add(line);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != br) {
                br.close();
            }
        }
        System.out.println(listaDeAlumnosCSV);
        String nombre = listaDeAlumnosCSV.get(0);
        Alumno alumno = new Alumno(nombre);
        listaDeAlumnosLeidos.add(alumno);
        System.out.println(listaDeAlumnosLeidos);

    }
}
