
package com.mycompany.requirement;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Requirement extends JFrame{
    JFrame frame;
    JTextField tf1, tf2, tf5, tf6, tf7; 
    JLabel l1,l2,l3,l4,l5,l7,l6,l8,l9;
    
 String tx1="<html><p>Donating blood is a straightforward process, "+"\n"+" but it's important to follow certain rules and guidelines to ensure the safety of both the donor and the recipient. Here's a step-by-step guide on how to donate blood along with the general rules:\n" +
"\n" +
"Step 1: Check Eligibility\n" +
"Before donating blood, make sure you meet the eligibility criteria. Common requirements include being in good health, weighing at least 110 pounds (50 kg), and being at least 17 or 18 years old (depending on local regulations). You'll also be asked about recent travel, medical history, and certain risk behaviors.\n" +
"\n" +
"Step 2: Find a Donation Center\n" +
"Locate a blood donation center or a mobile blood drive near you. You can often find donation centers at hospitals, community centers, or blood banks. Many organizations also host blood drives at various locations.\n" +
"\n" +
"Step 3: Prepare\n" +
"Eat a healthy meal and drink plenty of fluids before donating blood to help maintain your blood pressure and energy levels. Avoid fatty foods immediately before donating.\n" +
"\n" +
"Step 4: Registration\n" +
"When you arrive at the donation center or blood drive, you'll need to register. This usually involves providing identification and answering some health-related questions.\n" +
"\n" +
"Step 5: Screening\n" +
"You'll undergo a brief health screening, which includes checking your blood pressure, pulse, temperature, and hemoglobin levels. This is to ensure that you're healthy enough to donate blood safely.\n" +
"\n" +
"Step 6: Donation\n" +
"Once you pass the screening, you'll proceed to the donation area. A trained healthcare professional will clean your arm and insert a sterile needle into a vein to collect your blood. The donation process typically takes around 10-15 minutes, during which you'll recline comfortably.\n" +
"\n" +
"Step 7: Refreshments\n" +
"After donating, you'll be given snacks and drinks to help replenish your energy. It's essential to rest and rehydrate before leaving the donation center.\n" +
"\n" +
"Step 8: Post-Donation Care\n" +
"Follow any specific instructions given by the staff at the donation center. Avoid heavy lifting or strenuous activity for a few hours, and continue to drink plenty of fluids to help your body replenish the lost blood volume.\n" +
"\n" +
"General Rules for Blood Donation:\n" +
"\n" +
"1.Be in good general health.\n" +
"2.Meet age and weight requirements.\n" +
"3.Bring identification.\n" +
"4.Avoid alcohol consumption for at least 24 hours before donating.\n" +
"5.Get a good night's sleep before donating.\n" +
"6.Eat a healthy, balanced meal before donating.\n" +
"7.Wait for a specific interval between donations (usually 8 weeks for whole blood donations).\n" +
"8.Disclose relevant medical information honestly during the screening process.\n" +
"9.Be prepared to answer questions about recent travel, medications, and medical history.\n" +
"10.Understand that you may be deferred from donating blood if you're at risk for transmitting certain infections or diseases.</p></html>";
     
    Requirement()
    {
        JFrame frame = new JFrame("Blood Bank management system");
        setVisible(true);  
        
        setSize(850,3000);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setTitle("Blood Bank Management System");  
        l1 = new JLabel("Requirement and rules for donating blood");  
        l1.setForeground(Color.white);  
        l1.setFont(new Font("Serif", Font.BOLD, 25)); 
        getContentPane().setBackground(Color.GRAY);
        l2 = new JLabel(tx1);  
         l2.setFont(new Font("Serif", Font.BOLD, 20)); 
      
    
        l1.setBounds(100, 5, 500, 40);  
        l2.setBounds(100,40,900,800);
        
      
        add(l1);
        add(l2);  
       
        
        
    }
    
    public static void main(String[] args) {
        Requirement r =new Requirement(); 
        
    }
    
}