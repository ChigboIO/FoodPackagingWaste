/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package foodpackagingwaste;

import java.awt.BorderLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author SCIENCE
 */
class DisposalPanel extends JPanel {
    JPanel northPanel;
    JButton back_btn;
    //Toolkit kit = Toolkit.getDefaultToolkit();
    //Image img = kit.createImage("images/diposal.gif");
    public DisposalPanel(){
        northPanel = new JPanel();
        back_btn = new JButton(new ImageIcon("images/filter_btn1.png"));
        back_btn.setRolloverIcon(new ImageIcon("images/filter_btn2.png"));
        back_btn.setToolTipText("return");
        back_btn.setContentAreaFilled(false);
        back_btn.setBorder(null);
        back_btn.setMargin(new Insets(0,0,0,0));
        back_btn.addActionListener(Main.eventhandler);
        northPanel.setBorder(new EmptyBorder(10,10,10,10));
        northPanel.setOpaque(false);
        northPanel.setLayout(new BorderLayout());
        northPanel.add(back_btn, BorderLayout.WEST);
        northPanel.add(new JLabel("UNN Food Packaging Waste :: Disposal Stage"), BorderLayout.EAST);
        
        setLayout(new BorderLayout());
        add(northPanel, BorderLayout.NORTH);
        add(new JLabel(new ImageIcon("images/disposal.gif")), BorderLayout.CENTER);
    }/*
    public void paintComponent(Graphics g2)
    {
        Graphics2D g = (Graphics2D)g2;
        //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    }*/
}
