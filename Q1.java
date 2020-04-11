/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication83;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Ikhlas Kamel
 */



public class Q1 extends JFrame implements ActionListener {
   JLabel lab1,lab2,lab3;
   JTextField tex1,tex2;
    ButtonGroup pg;
   JRadioButton box1,box2;
   
   public Q1(){
       this.setTitle("Temperature converter");
       this.setLayout(null);
       Container pane=this.getContentPane();
       
       
       lab1=new JLabel("Enter Celsius temperature");
       lab1.setFont(new Font("Serif", Font.BOLD, 15));
       lab1.setBounds(90, 10, 180, 50);
       pane.add(lab1);
       
       tex1=new JTextField();
       tex1.setBounds(40, 50, 270,20);
       pane.add(tex1);
       
        pg=new ButtonGroup();
       box1=new JRadioButton("Fahrenheit");
       box1.setFont(new Font("Serif",Font.BOLD,14));
       box1.setBounds(90, 90, 100,15);
        pg.add(box1);
       pane.add(box1);
       box1.addActionListener(this);
       
       box2=new JRadioButton("Kelvin");
       box2.setFont(new Font("Serif",Font.BOLD,14));
       box2.setBounds(190, 90, 100,15);
        pg.add(box2);
       pane.add(box2);
       box2.addActionListener(this);
       
       
      lab2=new JLabel("New Temperature in is:");
      lab2.setFont(new Font("Serif",Font.BOLD,15));
      lab2.setBounds(90, 100, 180, 50);
      pane.add(lab2);
      
          
      lab3=new JLabel();
      lab3.setBounds(250, 101, 180, 50);
      
      pane.add(lab3);
      this.setSize(new Dimension(380,200));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
   }
      
     public void actionPerformed(ActionEvent e) {
 
        DecimalFormat df = new DecimalFormat ("#.##");
        double Celsius = Double.parseDouble(tex1.getText());
        double answer = 0.0;
 
            answer = Celsius * 9/5  + 32;
 
                if (box2.isSelected())
                answer = Celsius+ 273.15;
 
            lab3.setText(String.valueOf(df.format(answer)));
  
        
    }
    
    public static void main(String[] args) {
      new Q1();
    }
       
   }


