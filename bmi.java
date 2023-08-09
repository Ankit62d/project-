import java.awt.Color;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
class bmi extends JFrame implements ActionListener{

    JButton  b1,b2;
    JTextField t1 , t2, t3, t4;
    JLabel l1, l2,l3, l4,l5,l6;
    bmi(){
        
        setVisible(true);
        setLayout(null);
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.BLUE);
        setTitle("BMI Calculator");
        l6 = new JLabel("Check Your BMI");
        add(l6);
        l6.setBounds(50,50,150,40);



        b1 = new JButton("CALCULATE");
        add(b1);
        b1.setBounds(50,200,120,40);
        b1.addActionListener(this);
        b2 = new JButton("CLEAR");
        add(b2);
        b2.setBounds(50, 250,120,30);
        b2.addActionListener(this);

        l1 = new JLabel("Weight :");
        add(l1);
        l1.setBounds(50,100,120,40);

        l2 = new JLabel("Height :");
        add(l2);
        l2.setBounds(50,150,120,40);

        t1 = new JTextField("");
        add(t1);
        t1.setBounds(180,100,120,40);
        t2 = new JTextField("");
        add(t2);
        t2.setBounds(180,150,120,40);

        t3 = new JTextField(" ");
        add(t3);
        t3.setBounds(180,200,120,40);
        l3 = new JLabel("(in kgs)");
        add(l3);
        l3.setBounds(305,100,50,20);
        l4 = new JLabel("(in meters)");
        add(l4);
        l4.setBounds(305,150,70,20);
        l5 = new JLabel("(kg/meter^2)");
        add(l5);
        l5.setBounds(305,200,100,20);
        t4 = new JTextField("");
        add(t4);
        t4.setBounds(180,250,120,30);
        
        
        

        
    }
    public void actionPerformed(ActionEvent e) {
        try{
        
            if( e.getSource() == b1){
                float a = Float.parseFloat(t1.getText());
                float b = Float.parseFloat(t2.getText());
                float bmi = a/(b*b);
                DecimalFormat df = new DecimalFormat("#.##");
                float x = Float.parseFloat(df.format(bmi));
                t3.setText(String.valueOf(x));
                
                if(bmi <= 18.5){
                    t4.setText("Under Weight");

                }
                if(bmi > 18.5 && bmi <= 24.9){
                    t4.setText("Ideal Weight");

                }
                if(bmi > 24.9 && bmi <= 29.9){
                    t4.setText("Over Weight");

                }
        
                if(bmi > 29.9){
                    t4.setText("Obese");

                }


            }
            if( e.getSource() == b2){
                t1.setText(" ");
                t2.setText(null);
                t3.setText(null);
                t4.setText(null);
            }
        
        } catch (Exception p) {
            System.out.println(p);
            
        }
            
        

    }
    
    public static void main(String[] args) {
        new bmi();
    }

}