import java.util.ArrayList;
import org.newdawn.slick.gui.TextField;
import org.newdawn.slick.*;
import java.awt.Font;
import org.newdawn.slick.font.*;

public class FunctionLevel extends Level{
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

		String description;

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
    Level prev_level;
    Level next_level;
    
    

	  Stack stack = new Stack(600, 40, 10);

		public FunctionLevel(Model m, GameContainer gc){
			this.model = m;

			commandbox_1 = new CommandBox(40, 200, "Open dishwasher");
			commandbox_2 = new CommandBox(40, 260, "Put dirty items into dishwasher");
			commandbox_3 = new CommandBox(180, 200, "Add dishwasher detergent");
			commandbox_4 = new CommandBox(180, 260, "Close dishwasher");
			commandbox_5 = new CommandBox(40, 320, "Press dishwasher start button");
			commandbox_6 = new CommandBox(40, 320, "Sweep crumbs off counter");
			commandbox_7 = new CommandBox(40, 380, "Put crumbs in trash");
			commandbox_8 = new CommandBox(180, 380, "Wipe counter with soapy sponge");
			commandbox_9 = new CommandBox(180, 440, "Wipe counter with clean sponge");
			commandbox_10 = new CommandBox(180, 440, "Pick up food items");
			commandbox_11 = new CommandBox(40, 500, "Walk to fridge");
			commandbox_12 = new CommandBox(40, 500, "Put all food items in fridge");
			commandbox_13 = new CommandBox(180, 560, "Close fridge");
			commandbox_14 = new CommandBox(180, 560, "Celebrate! The kitchen is clean!");
			

		  boxes = new ArrayList<CommandBox>();	
			boxes.add( commandbox_1);
			boxes.add( commandbox_2);
			boxes.add( commandbox_3);
			boxes.add(commandbox_4);
			boxes.add( commandbox_5);
			boxes.add(commandbox_6);
			boxes.add( commandbox_7);
			boxes.add( commandbox_8);
			boxes.add(commandbox_9);
			boxes.add(commandbox_11);
			boxes.add( commandbox_12);
			boxes.add( commandbox_13);
			boxes.add(commandbox_14);
			String eol = System.getProperty("line.separator");
			description = " A messy kitchen is no fun. Time to clean up! There are a number of things that you need to do to make sure the kitchen is all clean. Each of these things require a number of substeps, and those must be done in a certain order. I challenge you to make the kitchen shine again! Drag commands to the stack!";

			font1 = new Font("Times New Roman", Font.PLAIN, 15);
			font2 = new TrueTypeFont(font1, false);

			tf1 = new TextField(gc,font2, 100, 40, 400, 20);
			tf2 = new TextField(gc,font2, 100, 60, 400, 20);
			tf3 = new TextField(gc,font2, 100, 80, 400, 20);
			tf4 = new TextField(gc,font2, 100, 100, 400, 20);
			tf5 = new TextField(gc, font2, 100, 120, 400, 20);
			tf1.setText("A messy kitchen is no fun. Time to clean up!");
			tf2.setText("There are a number of things that you need to do to make sure the kitchen is all clean.");
			tf3.setText("Each of these things require a number of substeps, and those must be done in a certain order.");
			tf4.setText("I challenge you to make the kitchen shine again!" );
			tf5.setText("Drag commands to the stack!");
			tf_list = new ArrayList<TextField>();
			tf_list.add(tf1);
			tf_list.add(tf2);
			tf_list.add(tf3);
			tf_list.add(tf4);
			tf_list.add(tf5);

		}

		public void run(){
			boolean openDishwasher = false;
			boolean dirtyIn = false;
			boolean detergentIn = false;
			boolean closeDishwasher = false;
			boolean runningDishwasher = false;
			boolean sweptCounter = false;
			boolean crumbsTrash = false;
			boolean wipeSoapy = false;
			boolean wipeWater = false;
			boolean counterDry = false;
			boolean walkToFridge = false;
			boolean openFridge = false;
			boolean putItemsIn = false;
			boolean closeFridge = false;
			boolean celebrate = false;
			

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
