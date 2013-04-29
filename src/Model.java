import java.util.*;




public class Model {
	
	Screen cur_screen;
	
	//CommandBoxs
	ArrayList<CommandBox> level_one_boxes = new ArrayList<CommandBox>();
	CommandBox level_one_commandbox_1;
	//stack
	// run button

	public static enum Screen {
		START, CHOOSE, LEVEL1
	}
	
	public Model() {
		
		cur_screen = Screen.START;
		cur_screen = Screen.LEVEL1;
		// make command boxes
		
		level_one_commandbox_1 = new CommandBox(40, 40);
		level_one_boxes.add(0, level_one_commandbox_1);
		
	}
	public void modifyStack() {
		
		
	}
	
	public void modifyCommandBox() {
		
		
		
	}
	
	public void Run() {
		
		
		// depending on state, check for correctness
	}
	
}
