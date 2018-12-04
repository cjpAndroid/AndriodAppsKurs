package de.christian.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WindowOnTheTop extends JFrame {
	
	JButton startKnopf = new JButton("Start");
	JButton endKnopf = new JButton("End");
	
	
	
	
	
	public WindowOnTheTop () {
		buildGui();
	}

	private void buildGui() {
		
	   
	    this.setTitle("Word Cloud");
	    this.setSize(1000, 620);
	    this.setResizable(false);
	    this.setLocation(50, 50);
	    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        
        
        JPanel panelUnten = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
       // this.add(panel);
        panelUnten.add(label); // Components Added using Flow Layout
        panelUnten.add(label); // Components Added using Flow Layout
        panelUnten.add(tf);
        panelUnten.add(startKnopf);
        panelUnten.add(endKnopf);
        
  
        
      //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu mFile = new JMenu("FILE");
        JMenu mHelp = new JMenu("Help");
        mb.add(mFile);
        mb.add(mHelp);
        JMenuItem mOpen = new JMenuItem("Open");
        JMenuItem mSaveAs = new JMenuItem("Save as");
        mFile.add(mOpen);
        mFile.add(mSaveAs);
        
        // Text Area at the Center
        JTextArea ta = new JTextArea();
        

        
        
        this.add(panelUnten);
        this.add(mb);
        this.add(ta);
        
        
	}
	
	

}
