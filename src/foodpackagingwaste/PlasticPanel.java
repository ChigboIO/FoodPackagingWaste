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
class PlasticPanel extends JPanel {
    JPanel sort_panel, northPanel;
    JButton pvc_btn, pet_btn, hdpe_btn, ldpe_btn, pp_btn, ps_btn, back_btn;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Image img = kit.createImage("images/PLASTIC SORTING.PNG");
    public PlasticPanel(){
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
        northPanel.add(new JLabel("UNN Food Packaging Waste :: Plastic Advance Sorted"), BorderLayout.EAST);
        
        pvc_btn = new JButton("");
        pvc_btn.setContentAreaFilled(false);
        pvc_btn.setBorder(null);
        pvc_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pet_btn = new JButton("");
        pet_btn.setContentAreaFilled(false);
        pet_btn.setBorder(null);
        pet_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        hdpe_btn = new JButton("");
        hdpe_btn.setContentAreaFilled(false);
        hdpe_btn.setBorder(null);
        hdpe_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ldpe_btn = new JButton("");
        ldpe_btn.setContentAreaFilled(false);
        ldpe_btn.setBorder(null);
        ldpe_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pp_btn = new JButton("");
        pp_btn.setContentAreaFilled(false);
        pp_btn.setBorder(null);
        pp_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ps_btn = new JButton("");
        ps_btn.setContentAreaFilled(false);
        ps_btn.setBorder(null);
        ps_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pvc_btn.addActionListener(Main.eventhandler);
        pet_btn.addActionListener(Main.eventhandler);
        hdpe_btn.addActionListener(Main.eventhandler);
        ldpe_btn.addActionListener(Main.eventhandler);
        pp_btn.addActionListener(Main.eventhandler);
        ps_btn.addActionListener(Main.eventhandler);
        
        sort_panel = new JPanel();
        sort_panel.setLayout(new GridLayout(1, 6, 11, 10));
        sort_panel.setBorder(new EmptyBorder(332, 95, 118, 85));
        sort_panel.add(pet_btn);
        sort_panel.add(pvc_btn);
        sort_panel.add(pp_btn);
        sort_panel.add(ps_btn);
        sort_panel.add(hdpe_btn);
        sort_panel.add(ldpe_btn);
        sort_panel.setOpaque(false);
        
        setLayout(new BorderLayout());
        add(northPanel, BorderLayout.NORTH);
        add(sort_panel, BorderLayout.CENTER);
    }
    public void paintComponent(Graphics g2)
    {
        Graphics2D g = (Graphics2D)g2;
        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    }
    
}