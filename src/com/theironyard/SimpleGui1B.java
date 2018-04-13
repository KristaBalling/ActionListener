package com.theironyard;

import javax.swing.*;
import java.awt.event.*;
//import statement for the package containing
// ActionListener & ActionEvent.

public class SimpleGui1B implements ActionListener {
    //implement the interface. This says, "an instance of
    // SimpleGui1B IS-A ActionListener.

    JButton button;
    //This button will give events only to
    //ActionListener implementers.

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);
        //Register your interest with the button. This says
        //to the button, "Add me to your list of listeners."
        //The argument you pass MUST be an object from a class
        // that implements ActionListener!!

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked!");
        //The button calls this method to let you know an
        // event happened. It sends you an ActionEvent object
        //as the argument, but we don't need it. Knowing
        //the event happened is enough info for us.
    }

}
