package calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Calculator {
	
	JPanel content;
	private JTextField display;
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	
	JButton plus, minus, multiply, divide, equal, erase;
	
	JPanel p1, p2;
	
	public void setValue(String val)
	{
		display.setText(val);
	}
	public String getValue()
	{
		return display.getText();
	}
	
	public void eraseDisplay()
	{
		display.setText("");
	}
	
	Calculator()
	{
		content = new JPanel();
		BorderLayout bd = new BorderLayout();
		content.setLayout(bd);
		display = new JTextField(35);
		display.setHorizontalAlignment(JTextField.RIGHT);
		content.add("North", display);
		
		button0 = new JButton("0");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		equal = new JButton("=");
		erase = new JButton("C");

		p1 = new JPanel();
		
		GridLayout gd = new GridLayout(4,0);
		p1.setLayout(gd);
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p1.add(button4);
		p1.add(button5);
		p1.add(button6);
		p1.add(button7);
		p1.add(button8);
		p1.add(button9);
		p1.add(erase);
		p1.add(button0);
		p1.add(equal);
		
		InternalRealisation calcEngine = new InternalRealisation(this);
		button1.addActionListener(calcEngine);
		button2.addActionListener(calcEngine);
		button3.addActionListener(calcEngine);
		button4.addActionListener(calcEngine);
		button5.addActionListener(calcEngine);
		button6.addActionListener(calcEngine);
		button7.addActionListener(calcEngine);
		button8.addActionListener(calcEngine);
		button9.addActionListener(calcEngine);
		erase.addActionListener(calcEngine);
		button0.addActionListener(calcEngine);
		equal.addActionListener(calcEngine);
	
		content.add("Center", p1);
		p2 = new JPanel();
		GridLayout gd2 = new GridLayout(4,0);
		p2.setLayout(gd2);
		plus = new JButton("+");
		minus = new JButton("-");
		multiply = new JButton("*");
		divide = new JButton("/");
		p2.add(plus);
		p2.add(minus);
		p2.add(multiply);
		p2.add(divide);
		
		plus.addActionListener(calcEngine);
		minus.addActionListener(calcEngine);
		divide.addActionListener(calcEngine);
		multiply.addActionListener(calcEngine);
		content.add("East", p2);
		
		JFrame jf = new JFrame("Calculator");
		jf.setContentPane(content);
		jf.pack();
		jf.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Calculator();
	}
	
}
