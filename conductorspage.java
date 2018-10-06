/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matatu.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author samue
 */
public class conductorspage
{
     // adding a GUI frame with a title 'Conductors' on it
    JFrame conductors=new JFrame("Conductors");
    JPanel a=new JPanel();
    //adding a Label that shows what is to be done by user
    JLabel instruction=new JLabel("Select one conductor you would want to view.");
    String names[] = { "James Mutegi-001", "Shawn Musili-002", "Joseph Karanja-003", "Reuben Nyaga-004","Brian Wekesa-005", "John Odhiambo-006", "Jacob Mutindu-007", "Isaac Waweru-008","Rose Wangechi-009", "Jack Mutembei-010" };
    JList employees=new JList(names);
    JScrollPane list=new JScrollPane(employees);
    JButton back=new JButton("<- Back");
     public conductorspage()
        {
            formGUI();
        }
        public void formGUI()
        {
            //setting the colour of the background for the page
        a.setBackground(Color.WHITE);
        //setting the font to be used 
        instruction.setFont(new Font("sanserif",Font.PLAIN,28));
        list.setFont(new Font("sanserif",Font.PLAIN,28));
        employees.setFont(new Font("sanserif",Font.PLAIN,28));
        back.setFont(new Font("sanserif",Font.PLAIN,28));
         a.setLayout(null); 
        //adding the JPanel components that have been imported
        a.add(instruction);
        a.add(list);
        a.add(back);
        conductors.add(a); 
        //adding an actionlistener for the back button
        back.addActionListener((java.awt.event.ActionEvent goback)->{returnactionPerformed(goback);});
        //layout setup
        instruction.setBounds(650,50,700,35);
        list.setBounds(70,150,1780,800);
        back.setBounds(1500,50,200,35);
         //setting the size of the JFrame
        conductors.setSize(2000,1300);
        //setting how the gui will be closed by the user
        conductors.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        conductors.setVisible(true);
        }
        public void returnactionPerformed(ActionEvent goback)
        {
            homepage homepage=new homepage();
        }
}