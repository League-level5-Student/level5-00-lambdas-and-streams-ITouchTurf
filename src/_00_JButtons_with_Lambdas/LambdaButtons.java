package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaButtons implements ActionListener {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		addNumbers.addActionListener(e -> System.out.println(addNumbers()));
		randNumber.addActionListener(e -> System.out.println(randomNumber()));
		tellAJoke.addActionListener(e -> System.out.println(joke()));
		
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		window.setVisible(true);
		window.pack();
	}
	
	private int randomNumber() {
		Random r = new Random();
		return r.nextInt(100);
		// TODO Auto-generated method stub

	}

	private String joke() {
		// TODO Auto-generated method stub
		return "Why did the chicken cross the road?";
	}

	private String addNumbers() {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		int first = r.nextInt(100);
		int second = r.nextInt(100);
		int sum = first + second;
		return (first + " + " + second + " = " + sum);
	}

	public static void main(String[] args) {
		new LambdaButtons();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
