import service.LoginService;
import service.RegistraCentroService;

import java.io.IOException;
import java.util.Scanner;

import static constant.Constants.*;


public class Main {


    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        String user;
        String password;
        do {
            System.out.print(inserisciUserID);
            user = in.nextLine();
            System.out.print(inserisciPassword);
            password = in.nextLine();

            if (LoginService.login(user, password, fileName)) {
                System.out.println(loginSuccesso);
                RegistraCentroService.registraCentroAree(user, password);
            } else System.out.println(loginFallito);
        } while (!LoginService.login(user, password, fileName));
    }
}
