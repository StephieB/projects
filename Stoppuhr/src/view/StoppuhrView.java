package view;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StoppuhrView extends JFrame{
	
	private JButton start_stoppBtn = new JButton("Start");
	private JLabel timeInSek = new JLabel("0,000 s");
	public StoppuhrView() {
		setTitle("Stoppuhr");

		Font newFont = new Font(timeInSek.getFont().getFontName(), timeInSek.getFont().getStyle(), 48);
		timeInSek.setFont(newFont);
		timeInSek.setHorizontalAlignment(JLabel.CENTER);
		
		add (timeInSek, BorderLayout.CENTER);
		add (start_stoppBtn, BorderLayout.SOUTH);
		
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void setStartStoppName(String name) {
		this.start_stoppBtn.setText(name);
	}
	
	public JButton getStartStoppBtn() {
		return start_stoppBtn;
	}
	
	public void setTimeInSek(String time) {
		this.timeInSek.setText(time);
	}
}
