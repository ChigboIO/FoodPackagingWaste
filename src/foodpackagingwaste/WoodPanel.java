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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author SCIENCE
 */
class WoodPanel extends JPanel {
    JPanel sort_panel, northPanel;
    JButton hardWood_btn, softWood_btn, back_btn;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Image img = kit.createImage("images/WOOD SORTING.PNG");
    public WoodPanel(){
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
        northPanel.add(new JLabel("UNN Food Packaging Waste :: Wood Advance Sorted"), BorderLayout.EAST);
        
        hardWood_btn = new JButton("");
        hardWood_btn.setContentAreaFilled(false);
        hardWood_btn.setBorder(null);
        hardWood_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        softWood_btn = new JButton("");
        softWood_btn.setContentAreaFilled(false);
        softWood_btn.setBorder(null);
        softWood_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        hardWood_btn.addActionListener(Main.eventhandler);
        softWood_btn.addActionListener(Main.eventhandler);
        sort_panel = new JPanel();
        sort_panel.setLayout(new GridLayout(1, 5, 15, 10));
        sort_panel.setBorder(new EmptyBorder(357, 340, 100, 327));
        sort_panel.add(hardWood_btn);
        sort_panel.add(softWood_btn);
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
