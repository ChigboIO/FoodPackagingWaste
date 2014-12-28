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
class SortingPanel extends JPanel {
    JPanel sort_panel, northPanel;
    JButton sort_btn, back_btn;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Image img = kit.createImage("images/sort.png");
    public SortingPanel(){
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
        northPanel.add(new JLabel("UNN Food Packaging Waste :: Sorting Stage"), BorderLayout.EAST);
        
        sort_btn = new JButton("");
        sort_btn.setContentAreaFilled(false);
        sort_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        sort_btn.setBorder(null);
        sort_btn.addActionListener(Main.eventhandler);
        sort_panel = new JPanel();
        sort_panel.setLayout(new BorderLayout());
        sort_panel.setBorder(new EmptyBorder(243, 554, 95, 60));
        sort_panel.setOpaque(false);
        sort_panel.add(sort_btn, BorderLayout.CENTER);
        
        setLayout(new BorderLayout());
        add(northPanel, BorderLayout.NORTH);
        add(sort_panel, BorderLayout.CENTER);
    }
    
    public void playAnim(){
        //this.removeAll();
        //this.add(new JLabel(new ImageIcon("images/christmas.gif")), BorderLayout.CENTER);
        //this.revalidate();
        Main.nextPanel(new JLabel(new ImageIcon("images/sorting.gif")));
        Timer time = new Timer();
        time.schedule(new TimerTask(){
            @Override
            public void run(){
                Main.nextPanel(Main.sorted);
            }
        }, 4000);
    }
    public void paintComponent(Graphics g2)
    {
        Graphics2D g = (Graphics2D)g2;
        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
