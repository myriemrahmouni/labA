package service;

import model.Area;
import model.CentroArea;
import model.IndirizzoFisico;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SalvaService {
    /**
     * il metodo salvaCentro salva sul file centroMonitoraggio tutti i dati relativi dei centri
     * @param centroArea
     * @throws IOException
     */
    public static void salvaCentro(CentroArea centroArea) throws IOException {
        IndirizzoFisico ind = centroArea.getIndirizzo();
        ArrayList<Area> elencoAree = centroArea.getAree();
        String fileName = "ressource/CentroMonitoraggio.dati.txt";

        try {
            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(" Centro: " + centroArea.getNome());
            bw.write(" ,Indirizzo: ");
            bw.write(" ," + ind.getVia());
            bw.write(" ," + ind.getNumeroCivico());
            bw.write(" ," + ind.getCap());
            bw.write(" ," + ind.getComune());
            bw.write(" ," + ind.getProvincia());
            bw.write(" ,Elenco aree: ");

            for (Area a : elencoAree) {
                bw.write(" ,Stato: " + a.getStato());
                bw.write(" ,Den. Ufficiale: " + a.getDenominazioneUfficiale());
                bw.write(" ,Long: " + a.getLongitudine());
                bw.write(" ,Lat: " + a.getLatitudine());
            }
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.err.println("errore nella scrittura sul file " + e.getMessage());
        }

    }
}
