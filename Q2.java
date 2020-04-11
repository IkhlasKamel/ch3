/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication83;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Ikhlas Kamel
 */

    public class Q2  extends JFrame{
      
    JButton btn1;
    JTextArea p1;
    JList<String> s;
    public Q2(){
         
        this.setTitle("Multiple Selection Lists");
        this.setLayout(null);
        Container pane = this.getContentPane();
        
         
      
     String[]list={"Black","Blue","Cyan","Dark Gray","Gray"};
     s=new JList<>(list);
     s.setSelectedIndex(0);
     
        
    s.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
   
     
   JScrollPane c=new JScrollPane(s);
     c.setBounds(40, 30,90, 90);
              
   
       p1 = new JTextArea();
       p1.setBounds(250,35,90,80);
    
 
       
        btn1 = new JButton("copy>>>");  
        btn1.setBounds(140,70, 100, 30);
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                
                      String values = "";
                for (int i = 0; i <  s.getSelectedValuesList().size(); i++) {
                    values +=  s.getSelectedValuesList().get(i)+"\n";      
                }
                p1.setText(values); 
            }
        });
        
          
        pane.add(p1);
        pane.add(btn1);
        pane.add(c);
        
      
        this.setSize(new Dimension(400,200));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
      new Q2();
    }

}



