/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package foodpackagingwaste;

import java.awt.BorderLayout;
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
import java.awt.Cursor;

/**
 *
 * @author SCIENCE
 */
class SortedPanel extends JPanel {
    JPanel sort_panel, northPanel;
    JButton plastic_btn, metal_btn, paper_btn, glass_btn, wood_btn, back_btn;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Image img = kit.createImage("images/sorted.png");
    public SortedPanel(){
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
        northPanel.add(new JLabel("UNN Food Packaging Waste :: Advance Sorting Stage"), BorderLayout.EAST);
        
        plastic_btn = new JButton("");
        plastic_btn.setContentAreaFilled(false);
        plastic_btn.setBorder(null);
        plastic_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        metal_btn = new JButton("");
        metal_btn.setContentAreaFilled(false);
        metal_btn.setBorder(null);
        metal_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        paper_btn = new JButton("");
        paper_btn.setContentAreaFilled(false);
        paper_btn.setBorder(null);
        paper_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        glass_btn = new JButton("");
        glass_btn.setContentAreaFilled(false);
        glass_btn.setBorder(null);
        glass_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        wood_btn = new JButton("");
        wood_btn.setContentAreaFilled(false);
        wood_btn.setBorder(null);
        wood_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        plastic_btn.addActionListener(Main.eventhandler);
        metal_btn.addActionListener(Main.eventhandler);
        paper_btn.addActionListener(Main.eventhandler);
        glass_btn.addActionListener(Main.eventhandler);
        wood_btn.addActionListener(Main.eventhandler);
        sort_panel = new JPanel();
        sort_panel.setLayout(new GridLayout(1, 5, 30, 10));
        sort_panel.setBorder(new EmptyBorder(22, 67, 380, 38));
        sort_panel.add(plastic_btn);
        sort_panel.add(metal_btn);
        sort_panel.add(paper_btn);
        sort_panel.add(glass_btn);
        sort_panel.add(wood_btn);
        sort_panel.setOpaque(false);
        setLayout(new BorderLayout());
        add(northPanel, BorderLayout.NORTH);
        add(sort_panel, BorderLayout.CENTER);
    }
    
    public void playAnim(int index){
        //this.removeAll();
        //this.add(new JLabel(new ImageIcon("images/christmas.gif")), BorderLayout.CENTER);
        //this.revalidate();
        switch(index){
            case 1:
                Main.nextPanel(new JLabel(new ImageIcon("images/plastic sorting.gif")));
                break;
            case 2:
                Main.nextPanel(new JLabel(new ImageIcon("images/metal sorting.gif")));
                break;
            case 3:
                Main.nextPanel(new JLabel(new ImageIcon("images/paper sorting.gif")));
                break;
            case 4:
                Main.nextPanel(new JLabel(new ImageIcon("images/glass sorting.gif")));
                break;
            case 5:
                Main.nextPanel(new JLabel(new ImageIcon("images/wood sorting.gif")));
                break;
        }
        //Main.nextPanel(new JLabel(new ImageIcon("images/plastic sorting.gif")));
        Timer time = new Timer();
        time.schedule(new TimerTask(){
            @Override
            public void run(){
                switch(index){
                    case 1:
                        Main.nextPanel(Main.plastic);
                        break;
                    case 2:
                        Main.nextPanel(Main.metal);
                        break;
                    case 3:
                        Main.nextPanel(Main.paper);
                        break;
                    case 4:
                        Main.nextPanel(Main.glass);
                        break;
                    case 5:
                        Main.nextPanel(Main.wood);
                        break;
                }
            }
        }, 3000);
    }
    public void paintComponent(Graphics g2)
    {
        Graphics2D g = (Graphics2D)g2;
        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
