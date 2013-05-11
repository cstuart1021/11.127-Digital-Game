import java.util.*;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.*;



public class Model {

	Screen cur_screen;
	Progress cur_prog;
	String cur_error;


	StartScreen start_screen;

	Level cur_level;

	//Levels
	Level1 level1;
	SandboxLevel sandbox_level;
	Level2Materials level2;
	Level3 level3;

	//current level


	//CommandBoxes
	ArrayList<CommandBox> boxes = new ArrayList<CommandBox>();
	String error_1;
	String error_2;
	String error_3;
	
	String level3_error;


	// run button
	Color run_button_color;
	Color run_color;
	Color next_button_color;
	Color next_color;
	Color back_button_color;
	Color back_color;

	Rectangle run;
	Rectangle next;
	Rectangle back;
	boolean over_run_1;
	boolean over_next_1;
	boolean over_back_1;

	public static enum Screen {
		START, CHOOSE, LEVEL1, SANDBOX
	}
	public static enum Progress {
		WORK, ERROR, SUCCESS
	}


	public Model(GameContainer gc) {

		cur_screen = Screen.START;
		start_screen = new StartScreen();
		level1 = new Level1(this, gc);
		sandbox_level = new SandboxLevel(this, gc);
		level2 = new Level2Materials(this);
		level3 = new Level3(this,gc);
		cur_level = start_screen;
		start_screen.setNextLevel(level1);
		level1.setPrevLevel(start_screen);
		level1.setNextLevel(level2);
		level2.setPrevLevel(level1);
		level2.setNextLevel(level3);
		level3.setPrevLevel(level2);
		level3.setNextLevel(sandbox_level);
		sandbox_level.setPrevLevel(level3);

		run = new Rectangle( 400,400, 100, 100);
		run_button_color = new Color(0 , 204, 102);
		run_color = new Color(0, 204, 102);
		next_button_color = new Color(0 , 204, 102);
		next_color = new Color(0, 204, 102);
		back_button_color = new Color(0 , 204, 102);
		back_color = new Color(0, 204, 102);
		over_run_1 = false;
		over_next_1 = false;
		over_back_1 = false;
		error_1 = "You do still have some messy things!";
		error_2 = " no soapy hot water!!";
		error_3 = " stay on task!";
		next = new Rectangle( 500,500,100,50);
		back = new Rectangle(10, 700, 50, 50);
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

		/*
		if (cur_screen == Screen.LEVEL1){
			level1.run();
		} if (cur_screen == Screen.SANDBOX) {
      sandbox_level.run();
    }
		 */
		cur_level.run();

	}

}
