/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package foodpackagingwaste;

import java.awt.BorderLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author SCIENCE
 */
public class Main extends JFrame implements Runnable {
    static Thread t;
    static JPanel contentPane;
    static EventClass eventhandler;
    static GenerationPanel generation;
    static SortingPanel sorting;
    static SortedPanel sorted;
    static PlasticPanel plastic;
    static MetalPanel metal;
    static PaperPanel paper;
    static GlassPanel glass;
    static WoodPanel wood;
    static ProcessingPanel processing;
    static DisposalPanel disposal;
    static JPanel previous;
    public Main(){
        setTitle("Food Packaging Waste Management :: UNN Community");
        initComponents();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(generation, BorderLayout.CENTER);
        
        setContentPane(contentPane);
        setSize(906, 628);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void initComponents(){
        contentPane = new JPanel();
        eventhandler = new EventClass();
        generation = new GenerationPanel();
        sorting = new SortingPanel();
        sorted = new SortedPanel();
        plastic = new PlasticPanel();
        metal = new MetalPanel();
        paper = new PaperPanel();
        glass = new GlassPanel();
        wood = new WoodPanel();
        processing = new ProcessingPanel();
        disposal = new DisposalPanel();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        t = new Thread(new Main());
        t.start();
        //new Main();
    }

    public static void nextPanel(JComponent panel){
        contentPane.removeAll();
        contentPane.add(panel, BorderLayout.CENTER);
        //panel.revalidate();
        contentPane.revalidate();
        contentPane.repaint();
    }
    
    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
