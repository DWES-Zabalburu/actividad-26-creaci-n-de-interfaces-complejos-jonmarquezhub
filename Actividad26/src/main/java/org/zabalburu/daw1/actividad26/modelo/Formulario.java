/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad26.modelo;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.WHITE;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;

/**
 *
 * @author DAW1
 */
public class Formulario extends JFrame{
    private Dimension dmVentana = new Dimension(1280, 720);
    
    private JLabel lblTitulo = new JLabel("Actualiza tu perfil");
    private  JLabel lblNombreComp = new JLabel ("Nombre completo");
    private JTextField txtNombreComp = new JTextField();
    private  JLabel lblCorreo = new JLabel ("Correo electrónico");
    private JTextField txtCorreo = new JTextField();
    private  JLabel lblTelefono = new JLabel ("Teléfono");
    private JTextField txtTelefono = new JTextField();
    private  JLabel lblDireccion = new JLabel ("Dirección");
    private JTextField txtDireccion = new JTextField();
    private  JLabel lblWeb = new JLabel ("Sitio web");
    private JTextField txtWeb = new JTextField();
    private JButton btnCancelar = new JButton("Cancelar");
    private JButton btnGuardar = new JButton("Guardar Cambios");
    
    
    private JPanel pnlDatos = new JPanel (new GridLayout(10,1));
    private JPanel pnlBotones = new JPanel (new FlowLayout(FlowLayout.RIGHT));
    
    private final Color COLOR_FONDO = new Color(240, 240, 240, 240);
    private final Color COLOR_TEXTO = new Color (255, 255, 255);
    private final Font FUENTE = new Font("Arial",Font.PLAIN,12);
    
    public Formulario(){
        
        this.setSize(dmVentana);
        this.setTitle("Mi perfil");
        lblTitulo.setFont(new Font("Arial", Font.BOLD,24));
        lblTitulo.setHorizontalAlignment(JLabel.LEFT);
        lblTitulo.setOpaque(true);
        lblTitulo.setForeground(COLOR_TEXTO);       
        Color c = new Color (41,128,185,255);
        lblTitulo.setBackground(c);
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        this.add(lblTitulo, BorderLayout.NORTH);
        
        txtNombreComp.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, c));
        txtCorreo.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, c));
        txtTelefono.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, c));
        txtDireccion.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, c));
        txtWeb.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, c));
        
       
                   
        pnlDatos.add(lblNombreComp);               
        pnlDatos.add(txtNombreComp);        
        pnlDatos.add(lblCorreo);        
        pnlDatos.add(txtCorreo);
        pnlDatos.add(lblTelefono);
        pnlDatos.add(txtTelefono);
        pnlDatos.add(lblDireccion);        
        pnlDatos.add(txtDireccion);
        pnlDatos.add(lblWeb);
        pnlDatos.add(txtWeb);
        pnlDatos.setBackground(COLOR_FONDO);
        pnlDatos.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        
        for (int i = 0; i < pnlDatos.getComponentCount(); i++){
            Component cmp = pnlDatos.getComponent(i);
            if (cmp instanceof JLabel) {
                cmp.setFont(FUENTE.deriveFont(Font.BOLD));
            } else {
                cmp.setFont(FUENTE);
            }
        }
        
        this.add(pnlDatos, BorderLayout.CENTER);
        Color g = new Color(41, 128, 185);
        
        pnlBotones.add(btnCancelar);
        btnCancelar.setBackground(Color.LIGHT_GRAY);
        btnCancelar.setForeground(WHITE);
        btnCancelar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        
        
        pnlBotones.add(btnGuardar);
        
        btnGuardar.setBackground(g);
        btnGuardar.setForeground(WHITE);
        btnGuardar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        
       
        
        pnlBotones.setOpaque(true);
        pnlBotones.setBorder (BorderFactory.createEmptyBorder (0, 0, 0, 20));
        
        this.add(pnlBotones, BorderLayout.SOUTH);
        
                     
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
