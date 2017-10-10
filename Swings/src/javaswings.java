import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.plaf.SliderUI;

import javafx.scene.control.Slider;

public class javaswings extends JFrame implements ActionListener{
private JButton button;
private JLabel label;
private JSlider myslider;
private JCheckBox checkbox;
public javaswings()
{
	button = new JButton("click");
	label = new JLabel("hit this button");
	checkbox = new JCheckBox("I am a checkbox");
	JSlider myslider = new JSlider(0,10);
	super.setSize(545, 136);
	super.setLayout(null);
	super.setTitle("MY GUI");
	super.add(button);
	super.add(label);
	super.add(checkbox);
	checkbox.setPreferredSize(new Dimension(279, 189));
        super.add(myslider);
    button.setBounds(10,10,100,25);  // this means distance of button from left side,right side,top and down of the screen
	label.setBounds(20,45,210,35);
	checkbox.setBounds(130,10,50,70);
	myslider.setBounds(15,80,210,35);
   // super.pack();         //this packs the framei.eit minimizes the screen,we can see the whole frame by maximizing it.
    button.addActionListener(this);
	super.setVisible(true);           
}
@Override
public void actionPerformed(ActionEvent e) { //this func will be called when button is clicked
	if(e.getSource()==button)
	{ 
	  System.out.println("u pressed the button");
	  
	}
	
}
}
