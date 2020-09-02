import javax.swing.*;	

import java.awt.FlowLayout;
import java.awt.event.*;

class res extends JFrame implements ActionListener{
	JButton button1;
	JLabel  first_digit, second_digit, third_digit, fourth_digit, result, info, tolerance, t_result;
	JComboBox firstList, secondList, thirdList, fourthList ;
	String initials, multiplier, t_value;
	
	String[] petStrings = { "Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Gray", "White" };
	String[] fStrings = { "No", "Silver", "Gold"};
	
	public res() {
		first_digit = new JLabel("First Digit:");
		firstList = new JComboBox(petStrings);
		firstList.setSelectedIndex(0);
		
		second_digit = new JLabel("Second Digit:");
		secondList = new JComboBox(petStrings);
		secondList.setSelectedIndex(0);
		
		third_digit = new JLabel("Third Digit:");
		thirdList = new JComboBox(petStrings);
		thirdList.setSelectedIndex(0);
		
		fourth_digit = new JLabel("Fourth Digit:");
		fourthList = new JComboBox(fStrings);
		fourthList.setSelectedIndex(0);
		
		button1 = new JButton("Calculate");
		
		info = new JLabel("Resistance:");
		result = new JLabel("");
		
		tolerance = new JLabel("Tolerance:");
		t_result = new JLabel("");
		
		button1.addActionListener(this);
		
		add(first_digit);
		add(firstList);
		add(second_digit);
		add(secondList);
		add(third_digit);
		add(thirdList);
		add(fourth_digit);
		add(fourthList);
		add(button1);
		add(info);
		add(result);
		add(tolerance);
		add(t_result);
//		Basic
		setVisible(true);
		setSize(200,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae) {
        String first_item = (String)firstList.getSelectedItem();
		
		switch(first_item) {
		case "Black":
			initials = "0";
			break;
		
		case "Brown":
			initials = "1";
			break;
		
		case "Red":
			initials = "2";
			break;
			
		case "Orange":
			initials = "3";
			break;
			
		case "Yellow":
			initials = "4";
			break;
			
		case "Green":
			initials = "5";
			break;
			
		case "Blue":
			initials = "6";
			break;
			
		case "Violet":
			initials = "7";
			break;
			
		case "Gray":
			initials = "8";
			break;
			
		case "White":
			initials = "9";
			break;
		
		}
		
        String second_item = (String)secondList.getSelectedItem();
        switch(second_item) {
		case "Black":
			initials = initials + "0";
			break;
		
		case "Brown":
			initials = initials + "1";
			break;
		
		case "Red":
			initials = initials + "2";
			break;
			
		case "Orange":
			initials = initials + "3";
			break;
			
		case "Yellow":
			initials = initials + "4";
			break;
			
		case "Green":
			initials = initials + "5";
			break;
			
		case "Blue":
			initials = initials + "6";
			break;
			
		case "Violet":
			initials = initials + "7";
			break;
			
		case "Gray":
			initials = initials + "8";
			break;
			
		case "White":
			initials = initials + "9";
			break;
		
		}
		
        String third_item = (String)thirdList.getSelectedItem();
        switch(third_item) {
		case "Black":
			multiplier = "1";
			break;
		
		case "Brown":
			multiplier = "10";
			break;
		
		case "Red":
			multiplier = "100";
			break;
			
		case "Orange":
			multiplier = "1000";
			break;
			
		case "Yellow":
			multiplier = "10000";
			break;
			
		case "Green":
			multiplier = "100000";
			break;
			
		case "Blue":
			multiplier = "1000000";
			break;
			
		case "Violet":
			multiplier = "10000000";
			break;
			
		case "Gray":
			multiplier = "100000000";
			break;
			
		case "White":
			multiplier = "1000000000";
			break;
		
		}
        
        String fourth_item = (String)fourthList.getSelectedItem();
        switch(fourth_item) {
		case "No":
			t_value = "士20%";
			break;
		
		case "Silver":
			t_value = "士10%";
			break;
		
		case "Gold":
			t_value = "士5%";
			break;		
		}
        
        long resistant = Long.parseLong(initials) * Long.parseLong(multiplier);
        System.out.println(resistant);
        
        String value = Long.toString(resistant) + " Ω";
        result.setText(value);
        t_result.setText(t_value);
        
        initials = "";
        t_value = "";
	}
}

public class resistor {

	public static void main(String[] args) {
		res resObj = new res();
	}

}
