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
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author SCIENCE
 */
class ProcessingPanel extends JPanel {
    JPanel disposal_panel, northPanel;
    JButton disposal_btn, back_btn;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Image img = kit.createImage("images/processing.png");
    public ProcessingPanel(){
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
        northPanel.add(new JLabel("UNN Food Packaging Waste :: Processing Stage"), BorderLayout.EAST);
        
        disposal_btn = new JButton("");
        disposal_btn.setContentAreaFilled(false);
        disposal_btn.setBorder(null);
        disposal_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        disposal_btn.addActionListener(Main.eventhandler);
        
        disposal_panel = new JPanel();
        disposal_panel.setLayout(new BorderLayout());
        disposal_panel.setBorder(new EmptyBorder(277, 500, 145, 80));
        disposal_panel.add(disposal_btn, BorderLayout.CENTER);
        disposal_panel.setOpaque(false);
        
        setLayout(new BorderLayout());
        add(northPanel, BorderLayout.NORTH);
        add(disposal_panel, BorderLayout.CENTER);
    }
    @Override
    public void paintComponent(Graphics g2)
    {
        Graphics2D g = (Graphics2D)g2;
        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
