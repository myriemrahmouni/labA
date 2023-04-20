package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoginService {
    /**
     * il metodo verifica che l'utente sia registrato o no
     * @param user
     * @param password
     * @param fileName
     * @return
     * @throws IOException
     */
    public static boolean login(String user, String password,  String fileName) throws IOException {

        boolean b = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String userId = parts[3];
                String pass = parts[4];
                if ((user.trim().equals(userId.trim())) && (password.trim().equals(pass.trim()))) {
                    b = true;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return b;

    }
}
