package com.qa.main;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class frame1 extends JFrame {
	final static int FRAME_HEIGHT = 500;
    final static int FRAME_WIDTH = 500;
    JMenuBar theMenu;
    JPanel thePanel1;
    JTextArea myTextArea;
    
   
    public frame1() {
    	super("Clare's frame");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        Container cp = this.getContentPane();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        theMenu = new JMenuBar();
        thePanel1 = new JPanel();
        myTextArea = new JTextArea();
        myTextArea.setText("hello world");
        thePanel1.add(myTextArea);
        cp.add(thePanel1);
        
    }

}
