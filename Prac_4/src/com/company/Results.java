package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Results extends JFrame
{
    int ACScore=0;
    int RealScore=0;
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    JLabel label1=new JLabel("Results: "+ACScore+" X "+RealScore);
    JLabel label2=new JLabel("Last Scorer: "+"N/A");
    JLabel label3=new JLabel("Winner: DRAW");
    JPanel[] pnl = new JPanel[12];
    public Results() {
        super("Results Program");
        setLayout(new GridLayout(4,3));
        for(int i = 0 ; i < pnl.length ; i++)
        {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        pnl[1].setLayout(new BorderLayout());
        pnl[0].add(button1);
        pnl[2].add(button2);
        pnl[4].add(label1);
        pnl[7].add(label2);
        pnl[10].add(label3);
        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                ACScore=ACScore+1;
                label1.setText("Results: "+ACScore+" X "+RealScore);
                label2.setText("Last Scorer: "+"Ac Milan");
                if(ACScore>RealScore){
                    label3.setText("Winner: Ac Milan");
                }else if(ACScore<RealScore){
                    label3.setText("Winner: Real Madrid");
                }else{
                    label3.setText("Winner: DRAW");
                }
            }
        });
        button2 .addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                RealScore=RealScore+1;

                label1.setText("Results: "+ACScore+" X "+RealScore);
                label2.setText("Last Scorer: "+"Real Madrid");
                if(ACScore>RealScore){
                    label3.setText("Winner: Ac Milan");
                }else if(ACScore<RealScore){
                    label3.setText("Winner: Real Madrid");
                }else{
                    label3.setText("Winner: DRAW");
                }
            }
        });
        setSize(800,500);
    }
    public static void main(String[]args)
    {
        new Results().setVisible(true);
    }
}