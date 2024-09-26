package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static jdk.internal.org.jline.utils.Colors.s;

public class Principal extends JFrame {
    private JButton cargarArchivoButton;
    private JPanel panel1;
    private JTextArea textArea1;

    public Principal() {

        setTitle("Notepad");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setContentPane(panel1);

        cargarArchivoButton.addActionListener((ActionEvent e) -> {
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try (var bfr = new BufferedReader(new FileReader(selectedFile))) {
                    List<String> texto = bfr.lines().toList();
                    String textopantalla = "";
                    for (String S : texto) {
                        textopantalla = textopantalla + s;
                    }
                    textArea1.setText(textopantalla);
                    this.setTitle("Notepad");
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}
