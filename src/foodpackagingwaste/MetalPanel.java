/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package foodpackagingwaste;

import java.awt.BorderLayout;
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
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author SCIENCE
 */
class MetalPanel extends JPanel {
    JPanel sort_panel, northPanel;
    JButton iron_btn, copper_btn, aluminium_btn, zinc_btn, back_btn;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Image img = kit.createImage("images/METAL SORTING.PNG");
    public MetalPanel(){
        northPanel = new JPanel();
        back_btn = new JButton(new ImageIcon("images/filter_btn1.png"));
        back_btn.setRolloverIcon(new ImageIcon("images/filter_btn2.png"));
        back_btn.setToolTipText("return");
        back_btn.setContentAreaFilled(false);
        back_btn.setBorder(null);
        back_btn.setMargin(new Insets(0,0,0,0));
        back_btn.addActionListener(Main.eventhandler);
        northPanel.setBorder(new EmptyBorder(10,10,10,10));
        northPanel.setLayout(new BorderLayout());
        northPanel.setOpaque(false);
        northPanel.add(back_btn, BorderLayout.WEST);
        northPanel.add(new JLabel("UNN Food Packaging Waste :: Metal Advance Sorted"), BorderLayout.EAST);
        
        iron_btn = new JButton("");
        iron_btn.setContentAreaFilled(false);
        iron_btn.setBorder(null);
        iron_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        copper_btn = new JButton("");
        copper_btn.setContentAreaFilled(false);
        copper_btn.setBorder(null);
        copper_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        aluminium_btn = new JButton("");
        aluminium_btn.setContentAreaFilled(false);
        aluminium_btn.setBorder(null);
        aluminium_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        zinc_btn = new JButton("");
        zinc_btn.setContentAreaFilled(false);
        zinc_btn.setBorder(null);
        zinc_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        iron_btn.addActionListener(Main.eventhandler);
        copper_btn.addActionListener(Main.eventhandler);
        aluminium_btn.addActionListener(Main.eventhandler);
        zinc_btn.addActionListener(Main.eventhandler);
        sort_panel = new JPanel();
        sort_panel.setLayout(new GridLayout(1, 5, 27, 10));
        sort_panel.setBorder(new EmptyBorder(360, 225, 105, 212));
        sort_panel.add(iron_btn);
        sort_panel.add(copper_btn);
        sort_panel.add(aluminium_btn);
        sort_panel.add(zinc_btn);
        sort_panel.setOpaque(false);
        
        setLayout(new BorderLayout());
        add(northPanel, BorderLayout.NORTH);
        add(sort_panel, BorderLayout.CENTER);
    }
    public void paintComponent(Graphics g2)
    {
        Graphics2D g = (Graphics2D)g2;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    }
    
}
