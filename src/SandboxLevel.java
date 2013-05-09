import java.util.ArrayList;
import org.newdawn.slick.gui.TextField;
import org.newdawn.slick.*;
import java.awt.Font;
import org.newdawn.slick.font.*;


public class SandboxLevel extends Level {
//CommandBoxes
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
		
		
		Model model;
		
		TextField tf1;
		TextField tf2;
		TextField tf3;
		TextField tf4;
		TextField tf5;
		ArrayList<TextField> tf_list;
		
		Font font1;
		TrueTypeFont font2;
    ArrayList<CommandBox> boxes;
	
    Stack stack = new Stack(600, 40, 10);

		public SandboxLevel(Model m, GameContainer gc){
			this.model = m;
			
			commandbox_1 = new CommandBox(40, 200, "if fridge full jump to top");
			commandbox_2 = new CommandBox(40, 260, "take out next item in fridge");
			commandbox_3 = new CommandBox(180, 200, "dump item on floor");
			commandbox_4 = new CommandBox(180, 260, "loop while standing on floor");
			commandbox_5 = new CommandBox(40, 320, "end repeated code");
			commandbox_6 = new CommandBox(40, 380, "take off shoes");
			commandbox_7 = new CommandBox(40, 440, "jump up and down ");
			commandbox_8 = new CommandBox(180, 320, "if fell down, roll around");
			commandbox_9 = new CommandBox(180, 380, "if fell down, get up");
			commandbox_10 = new CommandBox(180, 440, "dump soap on floor");
			commandbox_11 = new CommandBox(40, 500, "get soap");
      commandbox_12 = new CommandBox(40,140, "get pitcher of water");
      commandbox_13 = new CommandBox(80, 140, "walk to microwave");
      commandbox_14 = new CommandBox(40,80, "upend item");
      commandbox_15 = new CommandBox(80, 80, "walk to living room");
      commandbox_15 = new CommandBox(80, 500, "invite friends over");
			
		  boxes = new ArrayList<CommandBox>();	
      System.out.println("added box");
			boxes.add( commandbox_1);
			boxes.add( commandbox_2);
			boxes.add( commandbox_3);
			boxes.add(commandbox_4);
			boxes.add( commandbox_5);
			boxes.add(commandbox_6);
			boxes.add( commandbox_7);
			boxes.add( commandbox_8);
			boxes.add( commandbox_9);
			boxes.add( commandbox_10);
			boxes.add( commandbox_11);
			boxes.add( commandbox_11);
      boxes.add(commandbox_12);
      boxes.add(commandbox_13);
      boxes.add(commandbox_14);
      boxes.add(commandbox_15);

			String eol = System.getProperty("line.separator");
			
			font1 = new Font("Times New Roman", Font.PLAIN, 15);
			font2 = new TrueTypeFont(font1, false);
			tf_list = new ArrayList<TextField>();
			
	
			
		}
		
		public void run(){
			boolean containsCommandBox1 = false;
			boolean containsCommandBox2 = false;
			boolean contains3 = false;
			boolean contains4 = false;
			boolean contains5 = false;
			boolean contains_plug = false;
			boolean ran_water = false;
			boolean added_soap = false;
			boolean wrong = false;
			for (int i = 0 ; i< stack.num_boxes; i++) {
				CommandBox temp = stack.box_stack[i];
				if (temp == null ){
					continue;
				}
				if (temp.str.equals(commandbox_9.str)){
					contains_plug = true;
				}
				if (temp.str.equals(commandbox_10.str) && contains_plug) {
					ran_water = true;
				}
				if (temp.str.equals(commandbox_11.str) && ran_water) {
					added_soap = true;
				}
				if (temp.str.equals(commandbox_1.str)){
					containsCommandBox1 = true;
				} else if (temp.str.equals(commandbox_2.str) && added_soap){
					containsCommandBox2 = true;
				} else if (temp.str.equals(commandbox_3.str) && added_soap){
					contains3 = true;
				} else if (temp.str.equals(commandbox_4.str) && added_soap){
					contains4 = true;
				} else if (temp.str.equals(commandbox_5.str) && added_soap){
					contains5 = true;
				} else if (temp.str.equals(commandbox_6.str) || 
						   temp.str.equals(commandbox_7.str) ||
						   temp.str.equals(commandbox_8.str) ) {
					wrong = true;
				}
				
			}
			if (! added_soap) {
				model.cur_error = model.error_2;
				model.cur_prog = Model.Progress.ERROR;
			} else if ( wrong) {
				model.cur_error = model.error_3;
				model.cur_prog = Model.Progress.ERROR;
			}
			else if (! (containsCommandBox1 && containsCommandBox2 &&
					contains3 && contains4 && contains5)){
				model.cur_error = model.error_1;
				model.cur_prog = Model.Progress.ERROR;
			} else {
				model.cur_error = "Done!";
				model.cur_prog = Model.Progress.SUCCESS;
			}
			
		}

		@Override
		public void render() {
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
