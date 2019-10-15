/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocochat;

import java.awt.Image;
import javax.swing.GroupLayout;
import static javax.swing.GroupLayout.Alignment.LEADING;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;

/**
 *
 * @author migue
 */
public class VentanaLogin extends JFrame {

    public VentanaLogin() {
        JButton c4 = new JButton("ENTRAR");
        JLabel c1 = new JLabel("");
        JTextPane c2 = new JTextPane();
        c2.setText("Username");
        JTextPane c3 = new JTextPane();
        c3.setText("Password");
        JLabel c5 = new JLabel("¿Olvidaste tu contraseña?");
        JLabel c6 = new JLabel("¿No tienes cuenta?");
        JLabel c7 = new JLabel("REGÍSTRATE");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true); //Separación entre componentes
        layout.setAutoCreateContainerGaps(true); // separación con la ventana

        layout.setHorizontalGroup(layout.createParallelGroup(LEADING)
                .addComponent(c1, 100, 300, 500)//version con nombre de componente, tamaño minimo, preferente y tamaño máximo)
                .addComponent(c2, 100, 300, 300)
                .addComponent(c3, 100, 300, 300)
                .addComponent(c4, 100, 100, 100)
                .addComponent(c5, 100, 200, 200)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(c6, 100, 150, 150)
                        .addComponent(c7, 100, 150, 150)
                )
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addComponent(c1, 100, 150, 150)
                .addGap(30)
                .addComponent(c2, 30, 30, 30)
                .addGap(15)
                .addComponent(c3, 30, 30, 30)
                .addGap(15)
                .addComponent(c4, 30, 40, 40)
                .addGap(15)
                .addComponent(c5, 40, 40, 40)
                .addGroup(layout.createParallelGroup()
                        .addComponent(c6, 40, 40, 40)
                        .addComponent(c7, 40, 40, 40)
                )
        );

        setTitle("LOGIN");
        pack();
        ImageIcon logo = new ImageIcon(getClass().getResource("/imagen/logo.png"));
        ImageIcon icono = new ImageIcon(logo.getImage().getScaledInstance(c1.getWidth(), c1.getWidth(), Image.SCALE_DEFAULT));
        c1.setIcon(icono);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
