/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matatu.system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DonholmRoute {
     JFrame fare= new JFrame("Fare rates for the Ngong route.");
    JPanel k=new JPanel();
    JLabel title=new JLabel("Fare rates for the Ngong route.");
    JButton back=new JButton("<- Back");
    
    
    
   String []columns = {"Route","On Peek","Off Peek"};
       String [][] data ={{"Route","On Peek","Off Peek"},
           {"Town to Makadara","30","20"},
           {"Town to Buruburu","70","50"},
           {"Town to Outer ring","100","70"},
           {"Town to Donholm","40","50"},
           {"Madaraka to Buruburu","70","50"},
           {"Madaraka to Outer ring","30","40"},
           {"Madaraka to Donholm","70","50"},
           {"Buruburu to Outer ring","40","20"},
           {"Buruburu to Donhom","50","40"},
           {"Outer ring to Donholm","40","30"}};
       JTable Fare = new JTable(data,columns);
       JScrollPane sp= new JScrollPane(Fare);
    public DonholmRoute (){
        formGUI();
    }
    
    public void formGUI (){
      
        fare.setBackground(Color.WHITE);
        fare.setSize(2000,1000);
        fare.setVisible(true);
        fare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Fare.setFont(new Font("sanserif",Font.PLAIN,28));
        back.setFont(new Font("sanserif",Font.PLAIN,28));
        fare.setLayout(null);
        fare.add(Fare);
        fare.add(back);
        
        Fare.add(sp);
        Fare.setShowGrid(true);
        Fare.setRowHeight(70);
        Fare.setAutoCreateRowSorter(true);
        
        back.addActionListener((java.awt.event.ActionEvent goback)->{returnactionPerformed(goback);});
        title.setBounds(150,60,250,45);
        back.setBounds(1500,50,200,35);
        
        Fare.setBounds(220,150,1500,2000);
        Fare = new JTable(data,columns);
        Fare.setPreferredScrollableViewportSize(new Dimension(2000,1000));
        Fare.setFillsViewportHeight(true);
        Fare.setSize(1000,2000);
       
    }


    public void returnactionPerformed(ActionEvent goback) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
