import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.System.exit;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Menu implements ActionListener {
    public static boolean bandera=true;
    
    DBConection connect = new DBConection();
    public static final JFrame f = new JFrame("SED ENTORNO");
  Menu(String user) {
      if(connect.getTipo(user) == 2){
    
    final ImageIcon bg = new ImageIcon("packemple/bg.gif");
    final JLabel labelbg = new JLabel(bg);
    labelbg.setIcon(bg);
    f.add(labelbg);
    //Se crea el FRAME del Menu
    f.getContentPane().setBackground(Color.WHITE);
    
    f.getContentPane().setLayout(null);
    f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    
    
    //Persistencia del entorno de trabajo
    f.setAlwaysOnTop(true);
    f.setUndecorated(true);
    f.setVisible(true);
    
   
    //Se crean 5 paneles para el menu productos, historial, etc..
    final JPanel panel = new JPanel();
    panel.setBackground(Color.WHITE);
    panel.setBounds(172, 218, 510, 275);
    f.getContentPane().add(panel);
    
    final JPanel panel2 = new JPanel();
    panel2.setBackground(Color.WHITE);
    panel2.setBounds(172+520, 218, 510, 275);
    f.getContentPane().add(panel2);
    
    final JPanel panel3 = new JPanel();
    panel3.setBackground(Color.WHITE);
    panel3.setBounds(172, 218+285, 510, 275);
    f.getContentPane().add(panel3);
    
    final JPanel panel4 = new JPanel();
    panel4.setBackground(Color.WHITE);
    panel4.setBounds(172+520, 218+285, 510, 275);
    f.getContentPane().add(panel4);
    
    final JPanel panel5 = new JPanel();
    panel5.setBackground(Color.WHITE);
    panel5.setBounds(172+510*2+20, 218+275/2, 510, 275);
    f.getContentPane().add(panel5);
    
    final JPanel panel6 = new JPanel();
    panel6.setBackground(Color.WHITE);
    panel6.setBounds(1920-140, 20, 70, 70);
    f.getContentPane().add(panel6);
    f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    
    
     // Se le ponen 5 imagenes clickeables a los paneles
    final ImageIcon icon = new ImageIcon("packemple/pro.png");
    final JLabel label = new JLabel(icon);
    label.addMouseListener(new MouseAdapter() {
    //Para manejar eventos del mouse en el panel 1 
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        //QUITANDO MENU
        f.remove(panel);
        f.remove(panel2);
        f.remove(panel3);
        f.remove(panel4);
        f.remove(panel5);
        f.revalidate();
        f.repaint();
        //TABLA
        Object rowData[][] = { { "1101", "Toyota Corolla", "$10,000" },
        { "1657", "Honda Civic", "$20,000" } };
    Object columnNames[] = { "ID", "Nombre", "Precio" };
    JTable table = new JTable(rowData, columnNames);
    table.setFont(new Font("Arial", Font.PLAIN, 14));
    JScrollPane scrollPane = new JScrollPane(table);
    
    scrollPane.setPreferredSize(new Dimension (1080, 1200));
    final JPanel panel8 = new JPanel();
    panel8.setBackground(Color.WHITE);
    panel8.setBounds(176, 216, 1500, 740);
    f.getContentPane().add(panel8);
    panel8.add(scrollPane, BorderLayout.CENTER);
    ///////
    //Flechita back 
    final JPanel back = new JPanel();
    back.setBackground(Color.WHITE);
    back.setBounds(20, 20, 70, 70);
    f.getContentPane().add(back);
    final ImageIcon backico = new ImageIcon("packjefe/back.png");
    final JLabel labelb = new JLabel(backico);
    labelb.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        f.remove(panel8);
        f.remove(back);
        f.getContentPane().add(panel);
        f.getContentPane().add(panel2);
        f.getContentPane().add(panel3);
        f.getContentPane().add(panel4);
        f.getContentPane().add(panel5);
        
        //f.revalidate();
        f.repaint();
        
        
      }
      @Override
       public void mouseEntered(MouseEvent me) {
            labelb.setIcon(new ImageIcon("packjefe/back-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            labelb.setIcon(backico);
            }
    });
    back.add(labelb);
    //Esto arregla el bug del hover (Se quedaba azul hasta volver a pasarle el mouse encima)
    label.setIcon(icon);
    f.setVisible(true);
        
        

      }
       @Override
       public void mouseEntered(MouseEvent me) {
            label.setIcon(new ImageIcon("packemple/pro-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            label.setIcon(icon);
            }
    });
    panel.add(label);
    
    
    //Se repite el codigo de arriba para el segundo panel
    final ImageIcon icon2 = new ImageIcon("packemple/ventas.png");
    final JLabel label2 = new JLabel(icon2);
    label2.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
       System.out.println("CLICKED");
        //QUITANDO MENU
        f.remove(panel);
        f.remove(panel2);
        f.remove(panel3);
        f.remove(panel4);
        f.remove(panel5);
        f.revalidate();
        f.repaint();
        //TABLA
        Object rowData[][] = { { "Carlos Arguello", "Roberto Martinez", "$20,000" },
        { "Francisco Reyes", "Ernesto Cardona", "$10,000" } };
    Object columnNames[] = { "Vendedor", "Cliente", "Venta" };
    JTable table = new JTable(rowData, columnNames);
    table.setFont(new Font("Arial", Font.PLAIN, 14));
    JScrollPane scrollPane = new JScrollPane(table);
    scrollPane.setPreferredSize(new Dimension (1080, 900));
    final JPanel panel8 = new JPanel();
    panel8.setBackground(Color.WHITE);
    panel8.setBounds(176, 216, 1500, 740);
    f.getContentPane().add(panel8);
    panel8.add(scrollPane, BorderLayout.CENTER);
    ///////
    final JPanel back = new JPanel();
    back.setBackground(Color.WHITE);
    back.setBounds(20, 20, 70, 70);
    f.getContentPane().add(back);
    final ImageIcon backico = new ImageIcon("packjefe/back.png");
    final JLabel labelb = new JLabel(backico);
    labelb.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        f.remove(panel8);
        f.remove(back);
        f.getContentPane().add(panel);
        f.getContentPane().add(panel2);
        f.getContentPane().add(panel3);
        f.getContentPane().add(panel4);
        f.getContentPane().add(panel5);
        
        //f.revalidate();
        f.repaint();
        
        
      }
      @Override
       public void mouseEntered(MouseEvent me) {
            labelb.setIcon(new ImageIcon("packjefe/back-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            labelb.setIcon(backico);
            }
    });
    back.add(labelb);
    
    label2.setIcon(icon2);
    f.setVisible(true);
      }
       @Override
       public void mouseEntered(MouseEvent me) {
            label2.setIcon(new ImageIcon("packemple/ventas-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            label2.setIcon(icon2);
            }
    });
    panel2.add(label2);
  
    //Se repite el codigo de arriba para el tercer panel con la diferencia que este es para mandar reportes
    final ImageIcon icon3 = new ImageIcon("packemple/reporte.png");
    final JLabel label3 = new JLabel(icon3);
    label3.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
      
      JTextField reporte = new JTextField();


    ImageIcon reporteico = new ImageIcon("packemple/report.png");
    final JComponent[] inputs = new JComponent[] {

        new JLabel("Reporte"),
        reporte
        
    };
    System.out.println("You entered " +
           
            reporte.getText());
    int result = JOptionPane.showConfirmDialog(f, inputs, " Generar Reporte", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,reporteico);

  
    label3.setIcon(icon3);
    f.setVisible(true);
      }
      @Override
       public void mouseEntered(MouseEvent me) {
            label3.setIcon(new ImageIcon("packemple/reporte-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            label3.setIcon(icon3);
            }
      
    });
    panel3.add(label3);
    
    //Se repite el codigo de arriba para el cuarto panel
    final ImageIcon icon4 = new ImageIcon("packemple/cliente.png");
    final JLabel label4 = new JLabel(icon4);
    label4.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        //QUITANDO MENU
        f.remove(panel);
        f.remove(panel2);
        f.remove(panel3);
        f.remove(panel4);
        f.remove(panel5);
        f.revalidate();
        f.repaint();
        //TABLA
        Object rowData[][] = { { "856", "Juliana", "Arias" },
        { "405", "Camila", "Huiza" } };
    Object columnNames[] = { "ID", "Nombre", "Apellido" };
    JTable table = new JTable(rowData, columnNames);
    table.setFont(new Font("Arial", Font.PLAIN, 14));
    JScrollPane scrollPane = new JScrollPane(table);
    scrollPane.setPreferredSize(new Dimension (1080, 900));
    final JPanel panel8 = new JPanel();
    panel8.setBackground(Color.WHITE);
    panel8.setBounds(176, 216, 1500, 740);
    f.getContentPane().add(panel8);
    panel8.add(scrollPane, BorderLayout.CENTER);
    ///////
    final JPanel back = new JPanel();
    back.setBackground(Color.WHITE);
    back.setBounds(20, 20, 70, 70);
    f.getContentPane().add(back);
    final ImageIcon backico = new ImageIcon("packjefe/back.png");
    final JLabel labelb = new JLabel(backico);
    labelb.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        f.remove(panel8);
        f.remove(back);
        f.getContentPane().add(panel);
        f.getContentPane().add(panel2);
        f.getContentPane().add(panel3);
        f.getContentPane().add(panel4);
        f.getContentPane().add(panel5);
        
        //f.revalidate();
        f.repaint();
        
        
      }
      @Override
       public void mouseEntered(MouseEvent me) {
            labelb.setIcon(new ImageIcon("packjefe/back-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            labelb.setIcon(backico);
            }
    });
    back.add(labelb);
    
    label4.setIcon(icon4);
    f.setVisible(true);
      }
      @Override
       public void mouseEntered(MouseEvent me) {
            label4.setIcon(new ImageIcon("packemple/cliente-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            label4.setIcon(icon4);
            }
    });
    panel4.add(label4);
    
    //Se repite el codigo de arriba para el quinto panel
    final ImageIcon icon5 = new ImageIcon("packemple/historial.png");
    final JLabel label5 = new JLabel(icon5);
    label5.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        //QUITANDO MENU
        f.remove(panel);
        f.remove(panel2);
        f.remove(panel3);
        f.remove(panel4);
        f.remove(panel5);
        f.revalidate();
        f.repaint();
        //TABLA
        Object rowData[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3" },
        { "Row2-Column1", "Row2-Column2", "Row2-Column3" } };
    Object columnNames[] = { "Column One", "Column Two", "Column Three" };
    JTable table = new JTable(rowData, columnNames);
    table.setFont(new Font("Arial", Font.PLAIN, 14));
    JScrollPane scrollPane = new JScrollPane(table);
    scrollPane.setPreferredSize(new Dimension (1080, 900));
    final JPanel panel8 = new JPanel();
    panel8.setBackground(Color.WHITE);
    panel8.setBounds(176, 216, 1500, 740);
    f.getContentPane().add(panel8);
    panel8.add(scrollPane, BorderLayout.CENTER);
    ///////
    final JPanel back = new JPanel();
    back.setBackground(Color.WHITE);
    back.setBounds(20, 20, 70, 70);
    f.getContentPane().add(back);
    final ImageIcon backico = new ImageIcon("packjefe/back.png");
    final JLabel labelb = new JLabel(backico);
    labelb.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        f.remove(panel8);
        f.remove(back);
        f.getContentPane().add(panel);
        f.getContentPane().add(panel2);
        f.getContentPane().add(panel3);
        f.getContentPane().add(panel4);
        f.getContentPane().add(panel5);
        
        //f.revalidate();
        f.repaint();
        
        
      }
      @Override
       public void mouseEntered(MouseEvent me) {
            labelb.setIcon(new ImageIcon("packjefe/back-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            labelb.setIcon(backico);
            }
    });
    back.add(labelb);
    
    label5.setIcon(icon5);
    f.setVisible(true);
        
      }
      @Override
       public void mouseEntered(MouseEvent me) {
            label5.setIcon(new ImageIcon("packemple/historial-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            label5.setIcon(icon5);
            }
    });
    panel5.add(label5);
    
    
    //Codigo para el boton log out 
    final ImageIcon icon6 = new ImageIcon("packjefe/logout.png");
    final JLabel label6 = new JLabel(icon6);
    label6.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
          int dialogButton = JOptionPane.YES_NO_OPTION;
          int dialogResult = JOptionPane.showConfirmDialog (f, "¿Desea cerrar sesión?","Advertencia",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
            // Saving code here
            exit(0);
            }
        
      }
      @Override
       public void mouseEntered(MouseEvent me) {
            label6.setIcon(new ImageIcon("packjefe/logout-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            label6.setIcon(icon6);
            }
    });
    panel6.add(label6);
    
//MENU BAR SHIT
    JMenuBar jmb = new JMenuBar();
    jmb.setBackground(Color.WHITE);
    JMenu jmFile = new JMenu("Task");
    
    JMenuItem jmiClose = new JMenuItem("Cerrar Sesión");
    
    
  
    //jmFile.addSeparator();
    jmFile.add(jmiClose);
    jmb.add(jmFile);

    //JMenu jmOptions = new JMenu("Options");
    /*JMenu a = new JMenu("A");
    JMenuItem b = new JMenuItem("B");
    JMenuItem c = new JMenuItem("C");
    JMenuItem d = new JMenuItem("D");
    a.add(b);
    a.add(c);
    a.add(d);
    jmOptions.add(a);
*/

    /*JMenu e = new JMenu("E");
    e.add(new JMenuItem("F"));
    e.add(new JMenuItem("G"));
    jmOptions.add(e);
    */

   //jmb.add(jmOptions);

    JMenu jmHelp = new JMenu("Help");
    JMenuItem jmiAbout = new JMenuItem("About");
    jmHelp.add(jmiAbout);
    jmb.add(jmHelp);

   
    jmiClose.addActionListener(this);
    
    /*b.addActionListener(this);
    c.addActionListener(this);
    d.addActionListener(this);
*/
    jmiAbout.addActionListener(this);

    f.setJMenuBar(jmb);
    //MENU BAR SHIT ENDS
    
    f.setVisible(true);
  }else{
      
      
      
      
      /*ENTORNO JEFE*/
      
      
      
      
      /*ENTORNO JEFE*/
      
      
      
      /*ENTORNO JEFE*/
      
      
      /*ENTORNO JEFE*/
      
      
      
      
      
    final ImageIcon bg = new ImageIcon("packemple/bg.gif");
    final JLabel labelbg = new JLabel(bg);
    labelbg.setIcon(bg);
    f.add(labelbg);
    //Se crea el FRAME del Menu
    f.getContentPane().setBackground(Color.WHITE);
    
    f.getContentPane().setLayout(null);
    f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    
    
    //Persistencia del entorno de trabajo
    f.setAlwaysOnTop(true);
    f.setUndecorated(true);
    f.setVisible(true);
    
   
    //Se crean 5 paneles para el menu productos, historial, etc..
    final JPanel panel = new JPanel();
    panel.setBackground(Color.WHITE);
    panel.setBounds(172, 218, 510, 275);
    f.getContentPane().add(panel);
    
    final JPanel panel2 = new JPanel();
    panel2.setBackground(Color.WHITE);
    panel2.setBounds(172+520, 218, 510, 275);
    f.getContentPane().add(panel2);
    
    final JPanel panel3 = new JPanel();
    panel3.setBackground(Color.WHITE);
    panel3.setBounds(172, 218+285, 510, 275);
    f.getContentPane().add(panel3);
    
    final JPanel panel4 = new JPanel();
    panel4.setBackground(Color.WHITE);
    panel4.setBounds(172+520, 218+285, 510, 275);
    f.getContentPane().add(panel4);
    
    final JPanel panel5 = new JPanel();
    panel5.setBackground(Color.WHITE);
    panel5.setBounds(172+510*2+20, 218, 510, 275);
    f.getContentPane().add(panel5);
    
    final JPanel panel0 = new JPanel();
    panel0.setBackground(Color.WHITE);
    panel0.setBounds(172+510*2+20, 218+275, 510, 275);
    f.getContentPane().add(panel0);
    
    final JPanel panel6 = new JPanel();
    panel6.setBackground(Color.WHITE);
    panel6.setBounds(1920-140, 20, 70, 70);
    f.getContentPane().add(panel6);
    f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    
    
     // Se le ponen 5 imagenes clickeables a los paneles
    final ImageIcon icon = new ImageIcon("packemple/pro.png");
    final JLabel label = new JLabel(icon);
    label.addMouseListener(new MouseAdapter() {
    //Para manejar eventos del mouse en el panel 1 
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        //QUITANDO MENU
        f.remove(panel);
        f.remove(panel2);
        f.remove(panel3);
        f.remove(panel4);
        f.remove(panel5);
        f.remove(panel0);
        f.revalidate();
        f.repaint();
        //TABLA
        Object rowData[][] = { { "1101", "Toyota Corolla", "$10,000" },
        { "1657", "Honda Civic", "$20,000" } };
    Object columnNames[] = { "ID", "Nombre", "Precio" };
    JTable table = new JTable(rowData, columnNames);
    table.setFont(new Font("Arial", Font.PLAIN, 14));
    JScrollPane scrollPane = new JScrollPane(table);
    
    scrollPane.setPreferredSize(new Dimension (1080, 1200));
    final JPanel panel8 = new JPanel();
    panel8.setBackground(Color.WHITE);
    panel8.setBounds(176, 216, 1500, 740);
    f.getContentPane().add(panel8);
    panel8.add(scrollPane, BorderLayout.CENTER);
    ///////
    //Flechita back 
    final JPanel back = new JPanel();
    back.setBackground(Color.WHITE);
    back.setBounds(20, 20, 70, 70);
    f.getContentPane().add(back);
    final ImageIcon backico = new ImageIcon("packjefe/back.png");
    final JLabel labelb = new JLabel(backico);
    labelb.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        f.remove(panel8);
        f.remove(back);
        f.getContentPane().add(panel);
        f.getContentPane().add(panel2);
        f.getContentPane().add(panel3);
        f.getContentPane().add(panel4);
        f.getContentPane().add(panel5);
        f.getContentPane().add(panel0);
        
        //f.revalidate();
        f.repaint();
        
        
      }
      @Override
       public void mouseEntered(MouseEvent me) {
            labelb.setIcon(new ImageIcon("packjefe/back-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            labelb.setIcon(backico);
            }
    });
    back.add(labelb);
    //Esto arregla el bug del hover (Se quedaba azul hasta volver a pasarle el mouse encima)
    label.setIcon(icon);
    f.setVisible(true);
        
        

      }
       @Override
       public void mouseEntered(MouseEvent me) {
            label.setIcon(new ImageIcon("packemple/pro-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            label.setIcon(icon);
            }
    });
    panel.add(label);
    
    
    //Se repite el codigo de arriba para el segundo panel
    final ImageIcon icon2 = new ImageIcon("packemple/ventas.png");
    final JLabel label2 = new JLabel(icon2);
    label2.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
       System.out.println("CLICKED");
        //QUITANDO MENU
        f.remove(panel);
        f.remove(panel2);
        f.remove(panel3);
        f.remove(panel4);
        f.remove(panel5);
        f.remove(panel0);
        f.revalidate();
        f.repaint();
        //TABLA
        Object rowData[][] = { { "Carlos Arguello", "Roberto Martinez", "$20,000" },
        { "Francisco Reyes", "Ernesto Cardona", "$10,000" } };
    Object columnNames[] = { "Vendedor", "Cliente", "Venta" };
    JTable table = new JTable(rowData, columnNames);
    table.setFont(new Font("Arial", Font.PLAIN, 14));
    JScrollPane scrollPane = new JScrollPane(table);
    scrollPane.setPreferredSize(new Dimension (1080, 900));
    final JPanel panel8 = new JPanel();
    panel8.setBackground(Color.WHITE);
    panel8.setBounds(176, 216, 1500, 740);
    f.getContentPane().add(panel8);
    panel8.add(scrollPane, BorderLayout.CENTER);
    ///////
    final JPanel back = new JPanel();
    back.setBackground(Color.WHITE);
    back.setBounds(20, 20, 70, 70);
    f.getContentPane().add(back);
    final ImageIcon backico = new ImageIcon("packjefe/back.png");
    final JLabel labelb = new JLabel(backico);
    labelb.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        f.remove(panel8);
        f.remove(back);
        f.getContentPane().add(panel);
        f.getContentPane().add(panel2);
        f.getContentPane().add(panel3);
        f.getContentPane().add(panel4);
        f.getContentPane().add(panel5);
        f.getContentPane().add(panel0);
        
        //f.revalidate();
        f.repaint();
        
        
      }
      @Override
       public void mouseEntered(MouseEvent me) {
            labelb.setIcon(new ImageIcon("packjefe/back-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            labelb.setIcon(backico);
            }
    });
    back.add(labelb);
    
    label2.setIcon(icon2);
    f.setVisible(true);
      }
       @Override
       public void mouseEntered(MouseEvent me) {
            label2.setIcon(new ImageIcon("packemple/ventas-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            label2.setIcon(icon2);
            }
    });
    panel2.add(label2);
  
    //Se repite el codigo de arriba para el tercer panel con la diferencia que este es para mandar reportes
    final ImageIcon icon3 = new ImageIcon("packjefe/reporte-j.png");
    final JLabel label3 = new JLabel(icon3);
    label3.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        //QUITANDO MENU
        f.remove(panel);
        f.remove(panel2);
        f.remove(panel3);
        f.remove(panel4);
        f.remove(panel5);
        f.remove(panel0);
        f.revalidate();
        f.repaint();
        //TABLA
        Object rowData[][] = { { "Carlos Urias", "Problema con cliente id 480" },
        { "Dave Fernandez", "Llegue a la meta en 13/11/18" }, { "Jose Chopin", "Llegue tarde debido a un accidente" } };
    Object columnNames[] = { "Empleado", "Reporte"};
    JTable table = new JTable(rowData, columnNames);
    table.setFont(new Font("Arial", Font.PLAIN, 14));
    JScrollPane scrollPane = new JScrollPane(table);
    scrollPane.setPreferredSize(new Dimension (1080, 900));
    final JPanel panel8 = new JPanel();
    panel8.setBackground(Color.WHITE);
    panel8.setBounds(176, 216, 1500, 740);
    f.getContentPane().add(panel8);
    panel8.add(scrollPane, BorderLayout.CENTER);
    ///////
    final JPanel back = new JPanel();
    back.setBackground(Color.WHITE);
    back.setBounds(20, 20, 70, 70);
    f.getContentPane().add(back);
    final ImageIcon backico = new ImageIcon("packjefe/back.png");
    final JLabel labelb = new JLabel(backico);
    labelb.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        f.remove(panel8);
        f.remove(back);
        f.getContentPane().add(panel);
        f.getContentPane().add(panel2);
        f.getContentPane().add(panel3);
        f.getContentPane().add(panel4);
        f.getContentPane().add(panel5);
        f.getContentPane().add(panel0);
        
        //f.revalidate();
        f.repaint();
        
        
      }
      @Override
       public void mouseEntered(MouseEvent me) {
            labelb.setIcon(new ImageIcon("packjefe/back-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            labelb.setIcon(backico);
            }
    });
    back.add(labelb);
    
    label3.setIcon(icon3);
    f.setVisible(true);
      }
      @Override
       public void mouseEntered(MouseEvent me) {
            label3.setIcon(new ImageIcon("packjefe/reporte-js.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            label3.setIcon(icon3);
            }
    });
    panel3.add(label3);
    //Se repite el codigo de arriba para el cuarto panel
    final ImageIcon icon4 = new ImageIcon("packemple/cliente.png");
    final JLabel label4 = new JLabel(icon4);
    label4.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        //QUITANDO MENU
        f.remove(panel);
        f.remove(panel2);
        f.remove(panel3);
        f.remove(panel4);
        f.remove(panel5);
        f.remove(panel0);
        f.revalidate();
        f.repaint();
        //TABLA
       Object rowData[][] = { { "856", "Juliana", "Arias" },
        { "405", "Camila", "Huiza" } };
    Object columnNames[] = { "ID", "Nombre", "Apellido" };
    JTable table = new JTable(rowData, columnNames);
    table.setFont(new Font("Arial", Font.PLAIN, 14));
    JScrollPane scrollPane = new JScrollPane(table);
    scrollPane.setPreferredSize(new Dimension (1080, 900));
    final JPanel panel8 = new JPanel();
    panel8.setBackground(Color.WHITE);
    panel8.setBounds(176, 216, 1500, 740);
    f.getContentPane().add(panel8);
    panel8.add(scrollPane, BorderLayout.CENTER);
    ///////
    final JPanel back = new JPanel();
    back.setBackground(Color.WHITE);
    back.setBounds(20, 20, 70, 70);
    f.getContentPane().add(back);
    final ImageIcon backico = new ImageIcon("packjefe/back.png");
    final JLabel labelb = new JLabel(backico);
    labelb.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        f.remove(panel8);
        f.remove(back);
        f.getContentPane().add(panel);
        f.getContentPane().add(panel2);
        f.getContentPane().add(panel3);
        f.getContentPane().add(panel4);
        f.getContentPane().add(panel5);
        f.getContentPane().add(panel0);
        
        //f.revalidate();
        f.repaint();
        
        
      }
      @Override
       public void mouseEntered(MouseEvent me) {
            labelb.setIcon(new ImageIcon("packjefe/back-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            labelb.setIcon(backico);
            }
    });
    back.add(labelb);
    
    label4.setIcon(icon4);
    f.setVisible(true);
      }
      @Override
       public void mouseEntered(MouseEvent me) {
            label4.setIcon(new ImageIcon("packemple/cliente-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            label4.setIcon(icon4);
            }
    });
    panel4.add(label4);
    
    //Se repite el codigo de arriba para el quinto panel
    final ImageIcon icon5 = new ImageIcon("packemple/historial.png");
    final JLabel label5 = new JLabel(icon5);
    label5.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        //QUITANDO MENU
        f.remove(panel);
        f.remove(panel2);
        f.remove(panel3);
        f.remove(panel4);
        f.remove(panel5);
        f.remove(panel0);
        f.revalidate();
        f.repaint();
        //TABLA
        Object rowData[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3" },
        { "Row2-Column1", "Row2-Column2", "Row2-Column3" } };
    Object columnNames[] = { "Column One", "Column Two", "Column Three" };
    JTable table = new JTable(rowData, columnNames);
    table.setFont(new Font("Arial", Font.PLAIN, 14));
    JScrollPane scrollPane = new JScrollPane(table);
    scrollPane.setPreferredSize(new Dimension (1080, 900));
    final JPanel panel8 = new JPanel();
    panel8.setBackground(Color.WHITE);
    panel8.setBounds(176, 216, 1500, 740);
    f.getContentPane().add(panel8);
    panel8.add(scrollPane, BorderLayout.CENTER);
    ///////
    final JPanel back = new JPanel();
    back.setBackground(Color.WHITE);
    back.setBounds(20, 20, 70, 70);
    f.getContentPane().add(back);
    final ImageIcon backico = new ImageIcon("packjefe/back.png");
    final JLabel labelb = new JLabel(backico);
    labelb.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        f.remove(panel8);
        f.remove(back);
        f.getContentPane().add(panel);
        f.getContentPane().add(panel2);
        f.getContentPane().add(panel3);
        f.getContentPane().add(panel4);
        f.getContentPane().add(panel5);
        f.getContentPane().add(panel0);
        
        //f.revalidate();
        f.repaint();
        
        
      }
      @Override
       public void mouseEntered(MouseEvent me) {
            labelb.setIcon(new ImageIcon("packjefe/back-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            labelb.setIcon(backico);
            }
    });
    back.add(labelb);
    
    label5.setIcon(icon5);
    f.setVisible(true);
        
      }
      @Override
       public void mouseEntered(MouseEvent me) {
            label5.setIcon(new ImageIcon("packemple/historial-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            label5.setIcon(icon5);
            }
    });
    panel5.add(label5);
    
    final ImageIcon icon0 = new ImageIcon("packjefe/user.png");
    final JLabel label0 = new JLabel(icon0);
    label0.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        //QUITANDO MENU
        f.remove(panel);
        f.remove(panel2);
        f.remove(panel3);
        f.remove(panel4);
        f.remove(panel5);
        f.remove(panel0);
        f.revalidate();
        f.repaint();
        //TABLA
        Object rowData[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3" },
        { "Row2-Column1", "Row2-Column2", "Row2-Column3" } };
    Object columnNames[] = { "Column One", "Column Two", "Column Three" };
    JTable table = new JTable(rowData, columnNames);
    table.setFont(new Font("Arial", Font.PLAIN, 14));
    JScrollPane scrollPane = new JScrollPane(table);
    scrollPane.setPreferredSize(new Dimension (1080, 900));
    final JPanel panel8 = new JPanel();
    panel8.setBackground(Color.WHITE);
    panel8.setBounds(176, 216, 1500, 740);
    f.getContentPane().add(panel8);
    panel8.add(scrollPane, BorderLayout.CENTER);
    ///////
    final JPanel back = new JPanel();
    back.setBackground(Color.WHITE);
    back.setBounds(20, 20, 70, 70);
    f.getContentPane().add(back);
    final ImageIcon backico = new ImageIcon("packjefe/back.png");
    final JLabel labelb = new JLabel(backico);
    labelb.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        f.remove(panel8);
        f.remove(back);
        f.getContentPane().add(panel);
        f.getContentPane().add(panel2);
        f.getContentPane().add(panel3);
        f.getContentPane().add(panel4);
        f.getContentPane().add(panel5);
        f.getContentPane().add(panel0);
        
        //f.revalidate();
        f.repaint();
        
        
      }
      @Override
       public void mouseEntered(MouseEvent me) {
            labelb.setIcon(new ImageIcon("packjefe/back-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            labelb.setIcon(backico);
            }
    });
    back.add(labelb);
    
    label0.setIcon(icon0);
    f.setVisible(true);
        
      }
      @Override
       public void mouseEntered(MouseEvent me) {
            label0.setIcon(new ImageIcon("packjefe/user-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            label0.setIcon(icon0);
            }
    });
    panel0.add(label0);
    //Codigo para el boton log out 
    final ImageIcon icon6 = new ImageIcon("packjefe/logout.png");
    final JLabel label6 = new JLabel(icon6);
    label6.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
          int dialogButton = JOptionPane.YES_NO_OPTION;
          int dialogResult = JOptionPane.showConfirmDialog (f, "¿Desea cerrar sesión?","Advertencia",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
            // Saving code here
            exit(0);
            }
        
      }
      @Override
       public void mouseEntered(MouseEvent me) {
            label6.setIcon(new ImageIcon("packjefe/logout-s.png"));
            }
      @Override
       public void mouseExited(MouseEvent me){
            label6.setIcon(icon6);
            }
    });
    panel6.add(label6);
    
//MENU BAR SHIT
    JMenuBar jmb = new JMenuBar();
    jmb.setBackground(Color.WHITE);
    JMenu jmFile = new JMenu("Task");
    
    JMenuItem jmiClose = new JMenuItem("Cerrar Sesión");
    
    
  
    //jmFile.addSeparator();
    jmFile.add(jmiClose);
    jmb.add(jmFile);

    //JMenu jmOptions = new JMenu("Options");
    /*JMenu a = new JMenu("A");
    JMenuItem b = new JMenuItem("B");
    JMenuItem c = new JMenuItem("C");
    JMenuItem d = new JMenuItem("D");
    a.add(b);
    a.add(c);
    a.add(d);
    jmOptions.add(a);
*/

    /*JMenu e = new JMenu("E");
    e.add(new JMenuItem("F"));
    e.add(new JMenuItem("G"));
    jmOptions.add(e);
    */

   //jmb.add(jmOptions);

    JMenu jmHelp = new JMenu("Help");
    JMenuItem jmiAbout = new JMenuItem("About");
    jmHelp.add(jmiAbout);
    jmb.add(jmHelp);

   
    jmiClose.addActionListener(this);
    
    /*b.addActionListener(this);
    c.addActionListener(this);
    d.addActionListener(this);
*/
    jmiAbout.addActionListener(this);

    f.setJMenuBar(jmb);
    //MENU BAR SHIT ENDS
    
    f.setVisible(true);
      }
      
      
      
      
      
      }
  @Override
  public void actionPerformed(ActionEvent ae) {
    String comStr = ae.getActionCommand();
    if(ae.getActionCommand().equals("Cerrar Sesión")){
        bandera=true;
        int dialogButton = JOptionPane.YES_NO_OPTION;
         int dialogResult = JOptionPane.showConfirmDialog (f, "¿Desea cerrar sesión?","Advertencia",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
            // Saving code here
            exit(0);
            }else{
            }
    }
    if(ae.getActionCommand().equals("About")){
            exit(0);
          
    }
    System.out.println(comStr + " Selected");
  }

}