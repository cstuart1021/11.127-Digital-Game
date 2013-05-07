import java.util.*;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.*;



public class Model {
	
	Screen cur_screen;
	Progress cur_prog;
	String cur_error;
	

	StartScreen start_screen;
	
	//Levels
	Level1 level1;
	
	//current level
	int cur_level;
	
	//CommandBoxes
	ArrayList<CommandBox> boxes = new ArrayList<CommandBox>();
	//stack
	Stack stack = new Stack(600, 40, 10);
	String error_1;
	String error_2;
	String error_3;
	
	
	// run button
	Color button_color;
	Color run_color;
	Rectangle run;
	boolean over_run_1;

	public static enum Screen {
		START, CHOOSE, LEVEL1
	}
	public static enum Progress {
		WORK, ERROR, SUCCESS
	}

	
	public Model() {
		
		cur_screen = Screen.START;
		start_screen = new StartScreen();
		
		run = new Rectangle( 400,400, 100, 100);
		button_color = new Color(0 , 204, 102);
		run_color = new Color(0, 204, 102);
		over_run_1 = false;
		error_1 = "You do still have some messy things!";
		error_2 = " no soapy hot water!!";
		error_3 = " stay on task!";

		
	}
	public void modifyStack() {
		
		
	}
	
	public void modifyCBPos(CommandBox temp, int x, int y) {
		
		temp.cur_x = x;
		temp.cur_y = y;
		
	}
	public void changeCBColor(Color color, CommandBox temp) {
		temp.rect_color = color;
	}

	
	public void run() {
		
		if (cur_screen == Screen.LEVEL1){
			level1.run();
		}
		
	}
	
}
