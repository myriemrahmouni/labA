package model;


    import service.RegistraCentroService;

    import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
   import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

    public class Registrazione {
        public static void main(String[] args) {

            Registrazione utente = new Registrazione();
            utente.Registrazione();


        }
        public void Registrazione() {

            JPanel p = new JPanel();
            JFrame finestra = new JFrame("nuovo utente");
            finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            finestra.setVisible(true);
            finestra.add(p);



            p.setLayout(null);

            JLabel label1 = new JLabel("Nome e Cognome: ");
            label1.setBounds(10, 20, 150, 25);
            p.add(label1);

            JLabel label2 = new JLabel("Codice Fiscale");
            label2.setBounds(10, 50, 150, 25);
            p.add(label2);

            JLabel label3 = new JLabel("E-mail: ");
            label3.setBounds(10,80,150,25);
            p.add(label3);

            JLabel label4 = new JLabel("UserID: ");
            label4.setBounds(10,110,150,25);
            p.add(label4);

            JLabel label5 = new JLabel("Password: ");
            label5.setBounds(10, 140, 150, 25);
            p.add(label5);

            JLabel label6 = new JLabel("centro di monitoraggio di afferenza: ");
            label6.setBounds(10, 170, 250, 25);
            p.add(label6);

            //crea le caselle di input
            JTextField casella1 = new JTextField();
            casella1.setBounds(250, 20, 300, 25);
            p.add(casella1);

            JTextField casella2 = new JTextField();
            casella2.setBounds(250, 50 , 300, 25);
            p.add(casella2);

            JTextField casella3 = new JTextField();
            casella3.setBounds(250, 80, 300, 25);
            p.add(casella3);

            JTextField casella4 = new JTextField();
            casella4.setBounds(250, 110, 300, 25);
            p.add(casella4);

            JTextField casella5 = new JTextField();
            casella5.setBounds(250, 140, 300, 25);
            p.add(casella5);

            JTextField casella6 = new JTextField();
            casella6.setBounds(250, 170, 300, 25);
            p.add(casella6);


            finestra.setSize(550, 500);
            finestra.setResizable(false);

            JButton salvare = new JButton("Cliccare per salvare la registrazione");
            p.add(salvare);
            salvare.setBounds(130, 230, 300, 25);




            salvare.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nome = casella1.getText();
                    String codiceFiscale = casella2.getText();
                    String email = casella3.getText();
                    String userId = casella4.getText();
                    String password = casella5.getText();
                    String centro = casella6.getText();
                    try {

                        FileWriter fw = new FileWriter("ressource/OperatoriRegistrati.dati.txt", true);

                        fw.write(System.getProperty("line.separator"));
                        if (centro.equals(""))
                            fw.write(nome +  ", " + codiceFiscale + ", "+  email + ", " + userId +", "+ password + ", ");
                        else
                            fw.write(nome + ", " + codiceFiscale + ", " + email + ", " + userId + ", " + password + ", " + centro);

                        fw.close();
                        } catch (IOException ex) {
                        System.out.print(" la registrazione non è stata completata");


                    }
                    try {
                        RegistraCentroService.registraCentroAree(userId, password);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }


                }

            });



        }

    }

