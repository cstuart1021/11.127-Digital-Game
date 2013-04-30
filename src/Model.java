import java.util.*;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.*;



public class Model {
	
	Screen cur_screen;
	Progress cur_prog;
	String cur_error;
	

	StartScreen start_screen;
	
	//CommandBoxes
	ArrayList<CommandBox> level_one_boxes = new ArrayList<CommandBox>();
	CommandBox level_one_commandbox_1;
	CommandBox level_one_commandbox_2;
	//stack
	Stack stack_level_one = new Stack(600, 40, 10);
	String error_1;
	
	
	// run button
	Color button_color;
	Color run_color;
	Rectangle run_level_one;
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
		//cur_screen = Screen.LEVEL1;
		// make command boxes
		

		level_one_commandbox_1 = new CommandBox(40, 300, "clean counter");
		level_one_commandbox_2 = new CommandBox(40, 360, "clean dishes");
		level_one_boxes.add(0, level_one_commandbox_1);
		level_one_boxes.add(1, level_one_commandbox_2);
		run_level_one = new Rectangle( 400,400, 100, 100);
		button_color = new Color(0 , 204, 102);
		run_color = new Color(0, 204, 102);
		over_run_1 = false;
		error_1 = "You do still have some messy things!";

		
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
		
		
		// depending on state, check for correctness
		if (cur_screen == Screen.LEVEL1){
			boolean containsCommandBox1 = false;
			boolean containsCommandBox2 = false;
			for (int i = 0 ; i<stack_level_one.num_boxes; i++) {
				CommandBox temp = stack_level_one.box_stack[i];
				if (temp == null ){
					continue;
				}
				if (temp.str.equals(level_one_commandbox_1.str)){
					containsCommandBox1 = true;
				} else if (temp.str.equals(level_one_commandbox_2.str)){
					containsCommandBox2 = true;
				}
				
			}
			
			if (! (containsCommandBox1 && containsCommandBox2)){
				cur_error = error_1;
				cur_prog = Progress.ERROR;
			} else {
				cur_error = "Done!";
				cur_prog = Progress.SUCCESS;
			}
			
			
		}
	}
	
}
