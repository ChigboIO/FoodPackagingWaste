/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package foodpackagingwaste;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author SCIENCE
 */
class GenerationPanel extends JPanel {
    JButton fpwBin_btn, back_btn;
    JPanel bins_panel, northPanel;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Image img = kit.createImage("images/start.png");
        
    public GenerationPanel(){
        northPanel = new JPanel();
        back_btn = new JButton(new ImageIcon("images/filter_btn1.png"));
        back_btn.setRolloverIcon(new ImageIcon("images/filter_btn2.png"));
        back_btn.setToolTipText("return");
        back_btn.setContentAreaFilled(false);
        back_btn.setBorder(null);
        back_btn.setMargin(new Insets(0,0,0,0));
        back_btn.setEnabled(false);
        northPanel.setBorder(new EmptyBorder(10,10,10,10));
        northPanel.setLayout(new BorderLayout());
        northPanel.setOpaque(false);
        northPanel.add(back_btn, BorderLayout.WEST);
        northPanel.add(new JLabel("UNN Food Packaging Waste :: Generation Stage"), BorderLayout.EAST);
        
        fpwBin_btn = new JButton("");
        fpwBin_btn.setContentAreaFilled(false);
        fpwBin_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        //fpwBin_btn.setBorder(null);
        fpwBin_btn.addActionListener(Main.eventhandler);
        bins_panel = new JPanel();
        bins_panel.setLayout(new GridLayout(1,1,10,0));
        bins_panel.setBorder(new EmptyBorder(110,120,300,650));
        bins_panel.setOpaque(false);
        //bins_panel.add(othersBin_btn);
        bins_panel.add(fpwBin_btn);
        
        setLayout(new BorderLayout());
        add(northPanel, BorderLayout.NORTH);
        add(bins_panel, BorderLayout.CENTER);
    }
    public void playAnim(){
        //this.removeAll();
        //this.add(new JLabel(new ImageIcon("images/christmas.gif")), BorderLayout.CENTER);
        //this.revalidate();
        Main.nextPanel(new JLabel(new ImageIcon("images/collection.gif")));
        Timer time = new Timer();
        time.schedule(new TimerTask(){
            @Override
            public void run(){
                Main.nextPanel(Main.sorting);
            }
        }, 12500);
    }
    public void paintComponent(Graphics g2)
    {
        Graphics2D g = (Graphics2D)g2;
        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    }
    
}
