import java.awt.Font;
import java.util.ArrayList;

import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.gui.TextField;


public class Level2Materials extends Level {


	
	CommandBox commandbox_1;
	CommandBox commandbox_2;
	CommandBox commandbox_3;
	CommandBox commandbox_4;
	CommandBox commandbox_5;
	CommandBox commandbox_6;
	CommandBox commandbox_7;
	CommandBox commandbox_8;
	CommandBox commandbox_9;
	CommandBox commandbox_10;
	CommandBox commandbox_11;
	CommandBox commandbox_12;
	CommandBox commandbox_13;
	CommandBox commandbox_14;
	CommandBox commandbox_15;
	CommandBox commandbox_16;
	CommandBox commandbox_17;
	CommandBox commandbox_18;
	CommandBox commandbox_19;
	CommandBox commandbox_20;
	CommandBox commandbox_21;
	CommandBox commandbox_22;
	CommandBox commandbox_23;
	CommandBox commandbox_24;
	
	ArrayList<TextField> tf_list;
	

  ArrayList<CommandBox> boxes;
  Level prev_level;
  Level next_level;
	Model model;
	Stack stack = new Stack(600, 40, 24);
	
	public Level2Materials(Model m) {
		this.model = m;
		
		commandbox_1 = new CommandBox(40, 100, "walk to fridge");
		commandbox_2 = new CommandBox(40, 140, "open to fridge");
		commandbox_3 = new CommandBox(40, 180, "get bread");
		commandbox_4 = new CommandBox(40, 220, "walk to drawer");
		commandbox_5 = new CommandBox(40, 260, "open drawer");
		commandbox_6 = new CommandBox(40, 300, "get knife");
		commandbox_7 = new CommandBox(40, 340, "get spoon");
		commandbox_8 = new CommandBox(40, 380, "get fork");
		commandbox_9 = new CommandBox(40, 420, "walk to cabinet");
		commandbox_10 = new CommandBox(40, 460, "open cabinet");
		commandbox_11 = new CommandBox(40, 500, "get bowl");
		commandbox_12 = new CommandBox(40, 540, "get peanut butter");
		commandbox_13 = new CommandBox(180, 100, "get jelly");
		commandbox_14 = new CommandBox(180, 140, "open bottle");
		commandbox_15 = new CommandBox(180, 180, "spread on bread");
		commandbox_16 = new CommandBox(180, 220, "lay bread on plate");
		commandbox_17 = new CommandBox(180, 260, "close bottle");
		commandbox_18 = new CommandBox(180, 300, "close slices of bread to make sandwich");
		commandbox_19 = new CommandBox(180, 340, "return bread");
		commandbox_20 = new CommandBox(180, 380, "place knife in sink");
		commandbox_21 = new CommandBox(180, 420, "place fork in sink");
		commandbox_22 = new CommandBox(180, 460, "get plate");
		commandbox_23 = new CommandBox(180, 500, "place spoon in sink");
		commandbox_24 = new CommandBox(180, 540, "place plate in sink");
		
		boxes = new ArrayList<CommandBox>();
		boxes.add(0, commandbox_1);
		boxes.add(1, commandbox_2);
 	  boxes.add(2, commandbox_3);
		boxes.add(3, commandbox_4);
		boxes.add(4, commandbox_5);
		boxes.add(5, commandbox_6);
		boxes.add(6, commandbox_7);
		boxes.add(7, commandbox_8);
		boxes.add(8, commandbox_9);
		boxes.add(9, commandbox_10);
		boxes.add(10, commandbox_11);
		boxes.add(11, commandbox_12);
		boxes.add(12, commandbox_13);
		boxes.add(13, commandbox_14);
		boxes.add(14, commandbox_15);
		boxes.add(15, commandbox_16);
		boxes.add(16, commandbox_17);
		boxes.add(17, commandbox_18);
		boxes.add(18, commandbox_19);
		boxes.add(19, commandbox_20);
		boxes.add(20, commandbox_21);
		boxes.add(21, commandbox_22);
		boxes.add(22, commandbox_23);
		boxes.add(23, commandbox_24);
		tf_list = new ArrayList<TextField>();
		
		
	}
	
	public void run() {
		boolean[] array = new boolean[24];
		for (int i =0; i<24; i++) {
			array[i] = false;
		}
		boolean containsCommandBox1 = false;
		boolean containsCommandBox2 = false;
		boolean containsCommandBox3 = false;
		boolean containsCommandBox4 = false;
		boolean containsCommandBox5 = false;
		boolean containsCommandBox6 = false;
		boolean containsCommandBox7 = false;
		boolean containsCommandBox8 = false;
		boolean containsCommandBox9 = false;
		boolean containsCommandBox10 = false;
		boolean containsCommandBox11 = false;
		boolean containsCommandBox12 = false;
		boolean containsCommandBox13 = false;
		boolean containsCommandBox14 = false;
		boolean containsCommandBox15 = false;
		boolean containsCommandBox16 = false;
		boolean containsCommandBox17 = false;
		boolean containsCommandBox18 = false;
		boolean containsCommandBox19 = false;
		boolean containsCommandBox20 = false;
		boolean containsCommandBox21 = false;
		boolean containsCommandBox22 = false;
		boolean containsCommandBox23 = false;
		boolean containsCommandBox24 = false;
		
		Stack stack = model.cur_level.getStack();
		for(int i = 0; i<stack.num_boxes; i++) { //i have more boxes that the number of things that should be in the stack
			CommandBox temp = stack.box_stack[i];
			if (temp == null) {
				continue;
			}
			if (temp.str.equals(commandbox_1.str)) {
				containsCommandBox1 = true;
			}
			else if (temp.str.equals(commandbox_2.str)) {
				containsCommandBox2 = true;
			}
			else if (temp.str.equals(commandbox_3.str)) {
				containsCommandBox3 = true;
			}
			else if (temp.str.equals(commandbox_4.str)) {
				containsCommandBox4 = true;
			}
			else if (temp.str.equals(commandbox_5.str)) {
				containsCommandBox5 = true;
			}
			else if (temp.str.equals(commandbox_6.str)) {
				containsCommandBox6 = true;
			}
			else if (temp.str.equals(commandbox_7.str)) {
				containsCommandBox7 = true;
			}
			else if (temp.str.equals(commandbox_8.str)) {
				containsCommandBox8 = true;
			}
			else if (temp.str.equals(commandbox_9.str)) {
				containsCommandBox9 = true;
			}
			else if (temp.str.equals(commandbox_10.str)) {
				containsCommandBox10 = true;
			}
			else if (temp.str.equals(commandbox_11.str)) {
				containsCommandBox11 = true;
			}
			else if (temp.str.equals(commandbox_12.str)) {
				containsCommandBox12 = true;
			}
			else if (temp.str.equals(commandbox_13.str)) {
				containsCommandBox13 = true;
			}
			else if (temp.str.equals(commandbox_14.str)) {
				containsCommandBox14 = true;
			}
			else if (temp.str.equals(commandbox_15.str)) {
				containsCommandBox15 = true;
			}
			else if (temp.str.equals(commandbox_16.str)) {
				containsCommandBox16 = true;
			}
			else if (temp.str.equals(commandbox_17.str)) {
				containsCommandBox17 = true;
			}
			else if (temp.str.equals(commandbox_18.str)) {
				containsCommandBox18 = true;
			}
			else if (temp.str.equals(commandbox_19.str)) {
				containsCommandBox19 = true;
			}
			else if (temp.str.equals(commandbox_20.str)) {
				containsCommandBox20 = true;
			}
			else if (temp.str.equals(commandbox_21.str)) {
				containsCommandBox21 = true;
			}
			else if (temp.str.equals(commandbox_22.str)) {
				containsCommandBox22 = true;
			}
			else if (temp.str.equals(commandbox_23.str)) {
				containsCommandBox23 = true;
			}
			else if (temp.str.equals(commandbox_24.str)) {
				containsCommandBox24 = true;
			}
			
			//not sure how to take into account that fact that some off the boxes need to be in order and some dont. they can get
			//the plates/bread and supplies in any order but need to get the supplies before starting to make the sandwich. 
		}
		
		if (containsCommandBox1 &&
				containsCommandBox2 &&
				containsCommandBox3 &&
				containsCommandBox4 &&
				containsCommandBox5 &&
				containsCommandBox6 &&
				containsCommandBox7 &&
				containsCommandBox8 &&
				containsCommandBox9 &&
				containsCommandBox10 &&
				containsCommandBox11 &&
				containsCommandBox12 &&
				containsCommandBox13 &&
				containsCommandBox14 &&
				containsCommandBox15 &&
				containsCommandBox16 &&
				containsCommandBox17 &&
				containsCommandBox18 &&
				containsCommandBox19 &&
				containsCommandBox20 &&
				containsCommandBox21 &&
				containsCommandBox22 &&
				containsCommandBox23 &&
				containsCommandBox24 ) {
			model.cur_prog = Model.Progress.SUCCESS;
			model.cur_error = "Done!";
		} else {
			model.cur_prog = Model.Progress.ERROR;
			model.cur_error = "You didn't get enough stuff!";
		}
				
				
		
		
	}

	@Override
	void render() {
		// TODO Auto-generated method stub
		
	}

	@Override
	ArrayList<CommandBox> getBoxes() {
		// TODO Auto-generated method stub
		return boxes;
	}

	@Override
	Stack getStack() {
		// TODO Auto-generated method stub
		return stack;
	}

	@Override
	ArrayList<TextField> getTF() {
		// TODO Auto-generated method stub
		return tf_list;
	}

	@Override
	void setPrevLevel(Level level) {
		// TODO Auto-generated method stub
		prev_level = level;
	}

	@Override
	Level getPrevLevel() {
		// TODO Auto-generated method stub
		return prev_level;
	}

	@Override
	void setNextLevel(Level level) {
		// TODO Auto-generated method stub
		next_level = level;
	}

	@Override
	Level getNextLevel() {
		// TODO Auto-generated method stub
		return next_level;
	}
	


}
