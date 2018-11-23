import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.System.exit;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Menu implements ActionListener {
    
  Menu() {
    final JFrame f = new JFrame("SED ENTORNO");
    
    f.getContentPane().setBackground(Color.WHITE);
    //f.setBounds(100, 100, 450, 300);
    f.getContentPane().setLayout(null);
    f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    f.setUndecorated(true);
    f.setVisible(true);
    
   
    
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
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
     // Create a "clickable" image icon.
    final ImageIcon icon = new ImageIcon("packemple/pro.png");
    final JLabel label = new JLabel(icon);
    label.addMouseListener(new MouseAdapter() {
      
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        //or remove(JComponent
        f.remove(panel);
        f.remove(panel2);
        f.remove(panel3);
        f.remove(panel4);
        f.remove(panel5);
        f.revalidate();
        f.repaint();
        
        Object rowData[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3" },
        { "Row2-Column1", "Row2-Column2", "Row2-Column3" } };
    Object columnNames[] = { "Column One", "Column Two", "Column Three" };
    JTable table = new JTable(rowData, columnNames);
  
    JScrollPane scrollPane = new JScrollPane(table);
 
    final JPanel panel8 = new JPanel();
    panel8.setBackground(Color.WHITE);
    panel8.setBounds(176, 216, 1500, 740);
    f.getContentPane().add(panel8);
    panel8.add(scrollPane, BorderLayout.CENTER);
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
    
    final ImageIcon icon2 = new ImageIcon("packemple/ventas.png");
    final JLabel label2 = new JLabel(icon2);
    label2.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        f.remove(panel);
        f.remove(panel2);
        f.remove(panel3);
        f.remove(panel4);
        f.remove(panel5);
        f.revalidate();
        f.repaint();
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
    
    final ImageIcon icon3 = new ImageIcon("packemple/reporte.png");
    final JLabel label3 = new JLabel(icon3);
    label3.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        f.remove(panel);
        f.remove(panel2);
        f.remove(panel3);
        f.remove(panel4);
        f.remove(panel5);
        f.revalidate();
        f.repaint();
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
    
    final ImageIcon icon4 = new ImageIcon("packemple/cliente.png");
    final JLabel label4 = new JLabel(icon4);
    label4.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        f.remove(panel);
        f.remove(panel2);
        f.remove(panel3);
        f.remove(panel4);
        f.remove(panel5);
        f.revalidate();
        f.repaint();
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
    
    final ImageIcon icon5 = new ImageIcon("packemple/historial.png");
    final JLabel label5 = new JLabel(icon5);
    label5.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
        f.remove(panel);
        f.remove(panel2);
        f.remove(panel3);
        f.remove(panel4);
        f.remove(panel5);
        f.revalidate();
        f.repaint();
        
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
    
    final ImageIcon icon6 = new ImageIcon("packjefe/logout.png");
    final JLabel label6 = new JLabel(icon6);
    label6.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("CLICKED");
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
    JMenuItem jmiOpen = new JMenuItem("Open");
    JMenuItem jmiClose = new JMenuItem("Cerrar Sesión");
    JMenuItem jmiSave = new JMenuItem("Save");
    jmFile.add(jmiOpen);
    jmFile.add(jmiSave);
    jmFile.addSeparator();
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

    jmiOpen.addActionListener(this);
    jmiClose.addActionListener(this);
    jmiSave.addActionListener(this);
    /*b.addActionListener(this);
    c.addActionListener(this);
    d.addActionListener(this);
*/
    jmiAbout.addActionListener(this);

    f.setJMenuBar(jmb);
    //MENU BAR SHIT ENDS
    
    f.setVisible(true);
  }
  @Override
  public void actionPerformed(ActionEvent ae) {
    String comStr = ae.getActionCommand();
    if(ae.getActionCommand().equals("Cerrar Sesión")){
        exit(0);
    }
    System.out.println(comStr + " Selected");
  }

}