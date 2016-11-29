package controller;

import javax.swing.Timer;

import view.StoppuhrView;

public class StoppuhrController {
	
	private StoppuhrView view;
	private Timer timer = new Timer(1, listener -> updateView());
	private double time = 0.0;
	private boolean isRunning = false;
	
	public StoppuhrController(StoppuhrView view) {
		this.view = view;
		
		view.getStartStoppBtn().addActionListener(listener -> startStoppTimer());
	}
	
	
	private void startStoppTimer() {
		if (isRunning) {
			isRunning = false;
			timer.stop();
			view.setStartStoppName("Start");
		}
		else {
			isRunning = true;
			time = 0.0;
			timer.start();
			view.setStartStoppName("Stopp");
		}
	}
	
	private void updateView () {
		time += 0.001;
		view.setTimeInSek(String.format("%.3f s", time));
	}

}
