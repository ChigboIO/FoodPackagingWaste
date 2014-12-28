/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package foodpackagingwaste;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SCIENCE
 */
class EventClass implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(Main.generation.fpwBin_btn)){
            Main.generation.playAnim();
        }else if(e.getSource().equals(Main.sorting.sort_btn)){
            Main.sorting.playAnim();
            
        }else if(e.getSource().equals(Main.sorted.plastic_btn)){
            Main.sorted.playAnim(1);
        }else if(e.getSource().equals(Main.sorted.metal_btn)){
            Main.sorted.playAnim(2);
        }else if(e.getSource().equals(Main.sorted.paper_btn)){
            Main.sorted.playAnim(3);
        }else if(e.getSource().equals(Main.sorted.glass_btn)){
            Main.sorted.playAnim(4);
        }else if(e.getSource().equals(Main.sorted.wood_btn)){
            Main.sorted.playAnim(5);
        
        }else if(e.getSource().equals(Main.plastic.hdpe_btn) || e.getSource().equals(Main.plastic.ldpe_btn) || 
                e.getSource().equals(Main.plastic.pvc_btn) || e.getSource().equals(Main.plastic.pet_btn) || 
                e.getSource().equals(Main.plastic.pp_btn) || e.getSource().equals(Main.plastic.ps_btn)){
            
            Main.previous = Main.plastic;
            Main.nextPanel(Main.processing);
        }else if(e.getSource().equals(Main.metal.iron_btn) || e.getSource().equals(Main.metal.copper_btn) || 
                e.getSource().equals(Main.metal.aluminium_btn) || e.getSource().equals(Main.metal.zinc_btn)){
            
            Main.previous = Main.metal;
            Main.nextPanel(Main.processing);
        }else if(e.getSource().equals(Main.paper.printing_btn) || e.getSource().equals(Main.paper.writing_btn) || 
                e.getSource().equals(Main.paper.drawing_btn)){
            
            Main.previous = Main.paper;
            Main.nextPanel(Main.processing);
        }else if(e.getSource().equals(Main.glass.colloidal_btn) || e.getSource().equals(Main.glass.ceramics_btn) || 
                e.getSource().equals(Main.glass.polymer_btn) || e.getSource().equals(Main.glass.amorphous_btn)){
            
            Main.previous = Main.glass;
            Main.nextPanel(Main.processing);
        }else if(e.getSource().equals(Main.wood.hardWood_btn) || e.getSource().equals(Main.wood.softWood_btn)){
            
            Main.previous = Main.wood;
            Main.nextPanel(Main.processing);
        }else if(e.getSource().equals(Main.processing.disposal_btn)){
            Main.nextPanel(Main.disposal);
            
        }else if(e.getSource().equals(Main.disposal.back_btn)){
            Main.nextPanel(Main.processing);
        }else if(e.getSource().equals(Main.processing.back_btn)){
            Main.nextPanel(Main.previous);
        }else if(e.getSource().equals(Main.plastic.back_btn) || e.getSource().equals(Main.metal.back_btn) || 
                e.getSource().equals(Main.paper.back_btn) || e.getSource().equals(Main.glass.back_btn) || 
                e.getSource().equals(Main.wood.back_btn)){
            
            Main.nextPanel(Main.sorted);
        }else if(e.getSource().equals(Main.sorted.back_btn)){
            Main.nextPanel(Main.sorting);
        }else if(e.getSource().equals(Main.sorting.back_btn)){
            Main.nextPanel(Main.generation);
        }
    }
    
}
