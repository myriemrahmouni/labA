package service;

import java.io.*;


public class UpdateService {

    /**
     * il metodo update aggiorna il file OperatoriRegistrati
     * con i nomi dei nuovi centri di monitoraggio
     * @param user
     * @param password
     * @param nome
     */
    public static void update(String user, String password,String nome) {
        FileInputStream fstream = null;
        DataInputStream in = null;
        BufferedWriter out = null;

        try {
            // apro il file
            fstream = new FileInputStream("ressource/OperatoriRegistrati.dati.txt");

            // prendo l'inputStream
            in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            StringBuilder fileContent = new StringBuilder();

            // Leggo il file riga per riga
            while ((strLine = br.readLine()) != null) {
                String[] parts = strLine.split(",");
                String userId = parts[3];
                String pass = parts[4];

                if ((user.trim().equals(userId.trim())) && (password.trim().equals(pass.trim()))) {
                    if (parts[5] != null) {
                        fileContent.append(parts[0] + ", "
                                + parts[1] + ", "
                                + parts[2] + ", "
                                + parts[3] + ", "
                                + parts[4] + ", "
                                + parts[5] + ", "
                                + nome +
                                System.getProperty("line.separator"));
                    } else fileContent.append(parts[0] + ", "
                            + parts[1] + ", "
                            + parts[2] + ", "
                            + parts[3] + ", "
                            + parts[4] + ", "
                            + nome +
                            System.getProperty("line.separator"));
                } else {
                    fileContent.append(strLine);
                    fileContent.append(System.getProperty("line.separator"));
                }
            }

            // Sovrascrivo il file con il nuovo contenuto (aggiornato)
            FileWriter fstreamWrite = new FileWriter("ressource/OperatoriRegistrati.dati.txt");
            out = new BufferedWriter(fstreamWrite);
            out.write(fileContent.toString());

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            // chiusura dell'output e dell'input
            try {
                fstream.close();
                out.flush();
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
