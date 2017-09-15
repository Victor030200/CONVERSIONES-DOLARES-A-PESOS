


/*
  * Código creado para hacer conversiones de DOLARES A PESOS
  * Creado el 15/09/2017
  * @AUTHOR: @RODRIGUEZ RODRIGUEZ VICTOR
  * http://coatl.cecyt9.ipn.mx/eoropezaWEB/home.html
 */
// Vamos a proceder a crear un swing que nos permita convertir dolares a pesos.
package dolarapesos;
// Hacemos todos los imports necesarios.

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

// Creamos la clase DolarAPesos implementando los importes.

/** CLASE PARA REALIZAR CONVERSIONES DE PESOS A DOLARES Y VICEVERSA*/
public class DolarAPesos implements ActionListener {

    // Creamos Botones, Cajas de Texto, Etiquetas y el JPanel.
    
    JLabel Texto, Texto2, Texto3;
    JButton Boton1, Boton2;
    JTextField CuadroDeTexto, CuadroDeTexto2, CuadroDeTexto3;
    JPanel Contenedor, Contenedor2, Contenedor3, Contenedor4, Contenedor5, Contenedor6;

    //Configuramos la ventana
    public void LanzaVentana() {
        // Aquí comienza la configuración de la ventana
        JFrame ventana = new JFrame("CONVERTIDOR DE DOLARES A PESOS Y VICEVERSA");
        ventana.setSize(400, 230);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Inicializamos los botones, cajas de textos, etiquetas y JPanel, además de darles propiedades.
        
        Texto = new JLabel("TAZA DE CONVERSION");
        Texto2 = new JLabel("PESOS");
        Texto3 = new JLabel("DOLARES");

        Boton1 = new JButton("PESOS A DOLARES");
        Boton2 = new JButton("DOLARES A PESOS");

        Boton1.addActionListener(this);
        Boton2.addActionListener(this);

        CuadroDeTexto = new JTextField(16);
        CuadroDeTexto2 = new JTextField(16);
        CuadroDeTexto3 = new JTextField(16);

        Contenedor = new JPanel();
        Contenedor.setLayout(new BorderLayout());
        Contenedor.add(Texto, BorderLayout.WEST);
        Contenedor.add(CuadroDeTexto, BorderLayout.EAST);

        Contenedor2 = new JPanel();
        Contenedor2.setLayout(new BorderLayout());
        Contenedor2.add(Texto2, BorderLayout.NORTH);
        Contenedor2.add(CuadroDeTexto2, BorderLayout.SOUTH);

        Contenedor5 = new JPanel();
        Contenedor5.setLayout(new BorderLayout());
        Contenedor5.add(Texto3, BorderLayout.NORTH);
        Contenedor5.add(CuadroDeTexto3, BorderLayout.SOUTH);

        Contenedor6 = new JPanel();
        Contenedor6.setLayout(new BorderLayout());
        Contenedor6.add(Contenedor2, BorderLayout.NORTH);
        Contenedor6.add(Contenedor5, BorderLayout.SOUTH);

        Contenedor3 = new JPanel();
        Contenedor3.setLayout(new BorderLayout());
        Contenedor3.add(Boton1, BorderLayout.NORTH);
        Contenedor3.add(Boton2, BorderLayout.SOUTH);

        Contenedor4 = new JPanel();
        Contenedor4.setLayout(new BorderLayout());
        Contenedor4.add(Contenedor, BorderLayout.NORTH);
        Contenedor4.add(Contenedor6, BorderLayout.CENTER);
        Contenedor4.add(Contenedor3, BorderLayout.SOUTH);

        ventana.setContentPane(Contenedor4);
        ventana.setVisible(true);
    }
    // Cierre de la creación de botones y cajas de texto
    // Comenzamos a calcular las conversiones
    // Opcion uno dolar a pesos
    // Opcion dos pesos a dolar

    //Dentro del mismo programa declaramos el main y mandamos a llamar a la ventana.
   
    public static void main(String args[]) {
        DolarAPesos ventana = new DolarAPesos();
        ventana.LanzaVentana();
    }

    //Aquí comenzamos a calcular, creando una variable llamada tazadeconversion.
    
    public void actionPerformed(ActionEvent e) {
        String Instruccion1 = (CuadroDeTexto.getText());
        double tazadeconversion = Double.parseDouble(Instruccion1);
        
        //Aquí comenzamos a calcular los dolares
        
        if (e.getSource() == Boton1) {
            String Instruccion2 = (CuadroDeTexto2.getText());
            double pesosmexicanos = Double.parseDouble(Instruccion2);
            JOptionPane.showMessageDialog(null, "SON APROXIMADAMENTE: \n" + (pesosmexicanos / tazadeconversion) + " DOLARES");
        }
        
        //Aquí comenzamos a calcular los pesos
        
        if (e.getSource() == Boton2) {
            String paso3 = (CuadroDeTexto3.getText());
            double dolares = Double.parseDouble(paso3);
            JOptionPane.showMessageDialog(null, "SON APROXIMADAMENTE: \n" + (dolares * tazadeconversion) + " PESOS");
        }
    }
}
