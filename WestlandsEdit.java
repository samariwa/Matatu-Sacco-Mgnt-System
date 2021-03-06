/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matatu.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author iamka
 */
public class WestlandsEdit {
 
{
     //gui page for adding a new fare rates into the system
   JFrame newrate=new JFrame("Donholm Fare Edit"); 
   JPanel a=new JPanel();
   JLabel details=new JLabel("Enter the new fares.");
   JLabel stage1=new JLabel("Town to Museum/Museum to town:");
   JLabel stage2=new JLabel("Town to Chiromo/Chiromo to town:");
   JLabel stage3=new JLabel("Town to Westlands/Westlands to town:");
   JLabel stage4=new JLabel("Museum to chiromo/chiromo to museum:");
   JLabel stage5=new JLabel("Museum to Westlands/Westlands to museum:");
   JLabel stage6=new JLabel("Chiromo to Westlands/Westlands to Chiromo:");
   JTextField  stage1text=new JTextField();
   JTextField stage2text=new JTextField();
   JTextField stage3text=new JTextField();
   JTextField stage4text=new JTextField();
   JTextField stage5text=new JTextField();
   JTextField stage6text=new JTextField();
   JButton clear=new JButton("Clear");
   JButton save=new JButton("Save");
   JButton back=new JButton("<-Back");
   Database connect=new Database();
    public westlandsedit()
        {
            formGUI();
        }
        public void formGUI()
        {
        //setting the colour of the background for the page
        a.setBackground(Color.WHITE);
        //setting the font to be used 
        details.setFont(new Font("sanserif",Font.PLAIN,28));
        stage1.setFont(new Font("sanserif",Font.PLAIN,28));
        stage2.setFont(new Font("sanserif",Font.PLAIN,28));
        stage3.setFont(new Font("sanserif",Font.PLAIN,28));
        stage4.setFont(new Font("sanserif",Font.PLAIN,28));
        stage5.setFont(new Font("sanserif",Font.PLAIN,28));
        stage6.setFont(new Font("sanserif",Font.PLAIN,28));
        stage1text.setFont(new Font("sanserif",Font.PLAIN,28));
        stage2text.setFont(new Font("sanserif",Font.PLAIN,28));
        stage3text.setFont(new Font("sanserif",Font.PLAIN,28));
        stage4text.setFont(new Font("sanserif",Font.PLAIN,28));
        stage5text.setFont(new Font("sanserif",Font.PLAIN,28));
        stage6text.setFont(new Font("sanserif",Font.PLAIN,28));
        clear.setFont(new Font("sanserif",Font.PLAIN,28));
        save.setFont(new Font("sanserif",Font.PLAIN,28));
        back.setFont(new Font("sanserif",Font.PLAIN,28));
        a.setLayout(null);
        //adding the JPanel components that have been imported
        a.add(details);
        a.add(stage1);
        a.add(stage2);
        a.add(stage3);
        a.add(stage4);
        a.add(stage5);
        a.add(stage6);
        a.add(stage1text);
        a.add(stage2text);
        a.add(stage3text);
        a.add(stage4text);
        a.add(stage5text);
        a.add(stage6text);
        a.add(clear);
        a.add(save);
        a.add(back);
        newrate.add(a);
        //adding an actionlistener for the back button
        back.addActionListener((java.awt.event.ActionEvent goback)->{returnactionPerformed(goback);});
        //adding an actionlistener for the clear button
        clear.addActionListener((java.awt.event.ActionEvent clean)->{clearactionPerformed(clean);});
         //actionlistener for save button
        save.addActionListener((java.awt.event.ActionEvent s)->{addactionPerformed(s);});
        //layout setup
        details.setBounds(700,60,700,40);
        stage1.setBounds(200,160,600,45);
        stage2.setBounds(200,260,600,45);
        stage3.setBounds(200,360,600,45);
        stage4.setBounds(200,460,600,45);
        stage5.setBounds(200,560,600,45);
        stage6.setBounds(200,660,600,45);
        stage1text.setBounds(750,160,500,45);
        stage2text.setBounds(750,260,500,45);
        stage3text.setBounds(750,360,500,45);
        stage4text.setBounds(750,460,500,45);
        stage5text.setBounds(750,560,500,45);
        stage6text.setBounds(750,660,500,45);
        clear.setBounds(600,900,250,45);
        save.setBounds(1100,900,250,45);
        back.setBounds(200,60,250,45);
        //setting the size of the JFrame
        newrate.setSize(2000,1300);
        //setting how the gui will be closed by the user
        newrate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newrate.setVisible(true);
        }
         public void returnactionPerformed(ActionEvent goback)
        {
            farerateschart page=new farerateschart();
        }
            public void clearactionPerformed(ActionEvent clean)
        {
            stage1text.setText(null);
            stage2text.setText(null);
            stage3text.setText(null);
            stage4text.setText(null);
            stage5text.setText(null);
            stage6text.setText(null);
       } 
             public void addactionPerformed(ActionEvent s)
        {
            Connection conn= connect.getConnection();
            try
            {    
                String Query ="insert into westlandsfarerate(museum,chiromo,westlands,museumchiromo,museumwestlands,chiromowestlands)Values('"+stage1text.getText()+"','"+stage2text.getText()+"','"+stage3text.getText()+"','"+stage4text.getText()+"','"+stage5text.getText()+"','"+stage6text.getText()+"')";
                PreparedStatement st = conn.prepareStatement(Query);
                st.executeUpdate(); 
                System.out.print("Added");
            }
            catch(SQLException ex)
            {
                System.out.print("NULL");
            }
}
} 
}
