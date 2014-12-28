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
class PaperPanel extends JPanel {
    JPanel sort_panel, northPanel;
    JButton printing_btn, writing_btn, drawing_btn, back_btn;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Image img = kit.createImage("images/PAPER SORTING.PNG");
    public PaperPanel(){
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
        northPanel.add(new JLabel("UNN Food Packaging Waste :: Paper Advance Sorted"), BorderLayout.EAST);
        
        printing_btn = new JButton("");
        printing_btn.setContentAreaFilled(false);
        printing_btn.setBorder(null);
        printing_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        writing_btn = new JButton("");
        writing_btn.setContentAreaFilled(false);
        writing_btn.setBorder(null);
        writing_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        drawing_btn = new JButton("");
        drawing_btn.setContentAreaFilled(false);
        drawing_btn.setBorder(null);
        drawing_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        printing_btn.addActionListener(Main.eventhandler);
        writing_btn.addActionListener(Main.eventhandler);
        drawing_btn.addActionListener(Main.eventhandler);
        sort_panel = new JPanel();
        sort_panel.setLayout(new GridLayout(1, 5, 22, 10));
        sort_panel.setBorder(new EmptyBorder(360, 220, 102, 335));
        sort_panel.add(printing_btn);
        sort_panel.add(writing_btn);
        sort_panel.add(drawing_btn);
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
