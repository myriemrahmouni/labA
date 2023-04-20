package service;

import constant.Constants;
import model.Area;
import model.CentroArea;
import model.IndirizzoFisico;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static constant.Constants.*;

public class RegistraCentroService {
    /**
     * il metodo registraCentroAree crea l'indirizzo e le aree di interesse
     * al centro di monitoraggio
     * @param user
     * @param password
     * @throws IOException
     */

    public static void registraCentroAree(String user, String password) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print(nomeDelCentro);
        String nome = in.nextLine();
        System.out.print(via);
        String via = in.nextLine();
        System.out.print(comune);
        String comune = in.nextLine();
        System.out.print(provincia);
        String provincia = in.nextLine();
        System.out.print(numeroCivico);
        int numeroCivico = 0;
        while (!in.hasNextInt()){
            System.out.print(Constants.numeroCivico);
            in.next();
        }
        numeroCivico=in.nextInt();
        System.out.print(cap);
        int cap = 0;
        while (!in.hasNextInt()){
            System.out.print(Constants.cap);
            in.next();
        }
        cap = in.nextInt();
        IndirizzoFisico indirizzo = new IndirizzoFisico(via, numeroCivico, cap, comune, provincia);


        ArrayList<Area> lista = new ArrayList<>();
        in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print(areeDiInteresse);
        int areaInt = in.nextInt();

        for (int i = 0; i < areaInt; i++) {
            System.out.print(denUff);
            String denUff = input.nextLine();
            System.out.print(stato);
            String stato = input.nextLine();
            System.out.print(longitudine);
            int longitudine = in.nextInt();
            System.out.print(latitudine);
            int lat = in.nextInt();
            Area ar = new Area(longitudine, lat, denUff, stato);
            lista.add(ar);
        }

        CentroArea centroArea = new CentroArea();
        centroArea.setNome(nome);
        centroArea.setIndirizzo(indirizzo);
        centroArea.setAree(lista);

        UpdateService.update(user, password, nome);
        SalvaService.salvaCentro(centroArea);

    }
}
