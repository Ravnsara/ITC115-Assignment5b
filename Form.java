package com.crome.CardGame2;
/*
 * creates the form to display
 * the 5 card hand
 */

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Form {
    private JFrame frame;
    private JPanel panel;
    private JLabel lblCard1;
    private JLabel lblCard2;
    private JLabel lblCard3;
    private JLabel lblCard4;
    private JLabel lblCard5;
    private JButton btnGetHand;
    private ArrayList<Card> cards;
    
    private final int OFFSETX = 460;
    private final int OFFSETY = 150;
    private final int x = 370;
    private final int y = 350;
    
    public Form(){
        createFrame();
    }
    
    private void createFrame(){
        frame = new JFrame();
        frame.add(createPanel());
        frame.setTitle("Card Game");
        frame.setBounds(OFFSETX, OFFSETY, x, y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        }

    private JPanel createPanel(){
        panel = new JPanel();
        panel.setLayout(new GridLayout(2,5,8,8));
        lblCard1 = new JLabel();        
        lblCard2 = new JLabel();        
        lblCard3 = new JLabel();
        lblCard4 = new JLabel();
        lblCard5 = new JLabel();
        
        btnGetHand = new JButton("Deal Hand");
        btnGetHand.addActionListener(new SubmitListener());
        
        panel.add(lblCard1);        
        panel.add(lblCard2);        
        panel.add(lblCard3);
        panel.add(lblCard4);
        panel.add(lblCard5);
        panel.add(btnGetHand);
        
        return panel;
        }

    private class SubmitListener implements ActionListener{

        private JLabel lblCard;

		@Override
        public void actionPerformed(ActionEvent arg0) {
			panel.removeAll();			
        	Deck d = new Deck();
        	cards = d.deal();
        	for(Card s:cards){
        	lblCard = new JLabel(s.getSuit() + " of " + s.getRank());
        	panel.add(lblCard);             	             
        	} 
        	panel.add(btnGetHand);
        	panel.revalidate();
        	panel.repaint();
            
        }
        
    }
}
