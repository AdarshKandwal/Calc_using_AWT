/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc.project;

import java.awt.*;
import java.awt.event.*;

public class CalcProject extends Frame implements ActionListener{
    int c;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,plus,minus,mul,div,equals,clear;
    TextField t1; 
    String s1,s2,s3,s4,s5;
    CalcProject(){
       this.setLayout(null);
       t1=new TextField(25);
       
       b1=new Button("1");
       b2=new Button("2");
       b3=new Button("3");
       b4=new Button("4");
       b5=new Button("5");
       b6=new Button("6");
       b7=new Button("7");
       b8=new Button("8");
       b9=new Button("9");
       b0=new Button("0");
       plus=new Button("+");
       minus=new Button("-");
       mul=new Button("*");
       div=new Button("/");
       equals=new Button("=");
       clear=new Button("C");
               
       
       t1.setBounds(40,60,190,40);
       
       b1.setBounds(40,120,40,40);
       b2.setBounds(90,120,40,40);
       b3.setBounds(140,120,40,40);
       b4.setBounds(40,180,40,40);
       b5.setBounds(90,180,40,40);
       b6.setBounds(140,180,40,40);
       b7.setBounds(40,230,40,40);
       b8.setBounds(90,230,40,40);
       b9.setBounds(140,230,40,40);
       plus.setBounds(190,120,40,40);
       minus.setBounds(190,170,40,40);
       mul.setBounds(190,230,40,40);
       div.setBounds(190,280,40,40);
       b0.setBounds(90,280,40,40);
       equals.setBounds(40,280,40,40);
       clear.setBounds(140,280,40,40);
       
       this.add(clear);
       this.add(b0);
       this.add(plus);
       this.add(minus);
       this.add(mul);
       this.add(div);
       this.add(b1);
       this.add(b2);
       this.add(b3);
       this.add(b4);
       this.add(b5);
       this.add(b6);
       this.add(b7);
       this.add(b8);
       this.add(b9);
       this.add(t1);
       this.add(equals);
       
       
       
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
       b5.addActionListener(this);
       b6.addActionListener(this);
       b7.addActionListener(this);
       b8.addActionListener(this);
       b9.addActionListener(this);
       plus.addActionListener(this);
       minus.addActionListener(this);
       mul.addActionListener(this);
       div.addActionListener(this);
       equals.addActionListener(this);
       clear.addActionListener(this);
     
       
       
       
       this.addWindowListener(new WindowAdapter(){
       @Override
       public void windowClosing(WindowEvent e){
           System.exit(0);
       }
 });
       
       
    }
    
      public void actionPerformed(ActionEvent ae){
      // String Str=ae.getActionCommand();
      if(ae.getSource()==b1)
        {
            s3 = t1.getText();
            s4 = "1";
            s5 = s3+s4;
            t1.setText(s5);
        }
      if(ae.getSource()==b2)
        {
            s3 = t1.getText();
            s4 = "2";
            s5 = s3+s4;
            t1.setText(s5);
        }
      if(ae.getSource()==b3)
        {
            s3 = t1.getText();
            s4 = "3";
            s5 = s3+s4;
            t1.setText(s5);
        }
      if(ae.getSource()==b4)
        {
            s3 = t1.getText();
            s4 = "4";
            s5 = s3+s4;
            t1.setText(s5);
        }
      if(ae.getSource()==b5)
        {
            s3 = t1.getText();
            s4 = "5";
            s5 = s3+s4;
            t1.setText(s5);
        }if(ae.getSource()==b6)
        {
            s3 = t1.getText();
            s4 = "6";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(ae.getSource()==b7)
        {
            s3 = t1.getText();
            s4 = "7";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(ae.getSource()==b8)
        {
            s3 = t1.getText();
            s4 = "8";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(ae.getSource()==b9)
        {
            s3 = t1.getText();
            s4 = "9";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(ae.getSource()==b0)
        {
            s3 = t1.getText();
            s4 = "0";
            s5 = s3+s4;
            t1.setText(s5);
        }
         if(ae.getSource()==plus)
        {
            s1 = t1.getText();
            t1.setText("");
            c=1;
            
        }
           if(ae.getSource()==minus)
        {
            s1 = t1.getText();
            t1.setText("");
            c=2;
            
        }
             if(ae.getSource()==mul)
        {
            s1 = t1.getText();
            t1.setText("");
            c=3;
            
        }
        
               if(ae.getSource()==div)
        {
            s1 = t1.getText();
            t1.setText("");
            c=4;
            
        }
         if(ae.getSource()==equals){
             s2=t1.getText();
               if(c==1){
                  int  n = Integer.parseInt(s1)+Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
                   
               }
               if(c==2){
                  int  n = Integer.parseInt(s1)-Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
                   
               }
               if(c==3){
                  int  n = Integer.parseInt(s1)*Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
                   
               }
               if(c==4){
                  int  n = Integer.parseInt(s1)/Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
                   
               }
      
         }
         if(ae.getSource()==clear){
             t1.setText("");
         }
   }
      
      
    public static void main(String[] args) {
        
    CalcProject obj =new CalcProject();
    obj.setSize(400,400);
    obj.setVisible(true);
    obj.setTitle("cool_n_stuff");
    
    }
    
}
