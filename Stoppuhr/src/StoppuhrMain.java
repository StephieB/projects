import controller.StoppuhrController;
import view.StoppuhrView;

public class StoppuhrMain {

	public static void main(String[] args) {
		StoppuhrView view = new StoppuhrView();
		new StoppuhrController(view);

	}

}
