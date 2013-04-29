import java.util.*;
import org.newdawn.slick.*;



public class Model {
	
	Screen cur_screen;
	
	//CommandBoxs
	ArrayList<CommandBox> level_one_boxes = new ArrayList<CommandBox>();
	CommandBox level_one_commandbox_1;
	
	//stack
	Stack stack_level_one = new Stack(600, 40, 10);
	
	// run button

	public static enum Screen {
		START, CHOOSE, LEVEL1
	}
	
	public Model() {
		
		cur_screen = Screen.START;
		cur_screen = Screen.LEVEL1;
		// make command boxes
		
		level_one_commandbox_1 = new CommandBox(40, 300, "clean counter");
		level_one_boxes.add(0, level_one_commandbox_1);
		
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
	
	public void Run() {
		
		
		// depending on state, check for correctness
	}
	
}
