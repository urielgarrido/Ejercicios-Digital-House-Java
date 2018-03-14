package com.company.Destacado;

import com.company.DigitalHouseManager;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();
        digitalHouseManager.altaCurso("Mobile Android",20003,22);
        LectorDeArchivosCSV lectorDeArchivosCSV=new LectorDeArchivosCSV();
        lectorDeArchivosCSV.leerCSV();



    }
}
