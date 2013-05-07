import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;


public class Controller{
	Model model;
	Input input;
	CommandBox cur_command_box;
	
	public Controller(Model model) {
		
		this.model = model;
		
		
	}
	
	// get input from user and update model
	public void update(Input input) {
		this.input = input;
		
		
	}

	public void mouseClicked(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		model.cur_screen = Model.Screen.LEVEL1;
		
		
		// check for run
		
	}


	public void mouseDragged(int arg0, int arg1, int new_x, int new_y) {
		// TODO Auto-generated method stub
		
		if (cur_command_box != null){
			model.modifyCBPos(cur_command_box, cur_command_box.cur_x + ( new_x - arg0),cur_command_box.cur_y + (new_y - arg1) );
		}
		
		if (model.cur_screen == Model.Screen.LEVEL1) {
			if ( ! overRunButton(model.run, new_x, new_y) && model.over_run_1 ){
				model.button_color = model.run_color;
				model.over_run_1 = false;
			}
		}
		
	}

	public void mouseMoved(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
		
		
	}


	public void mousePressed(int arg0, int x, int y) {
		// TODO Auto-generated method stub
		
		// get command box (put into current command box)
		if (model.cur_screen == Model.Screen.LEVEL1) {
			cur_command_box = getCurBox(x, y);
			if (cur_command_box != null) {
				model.changeCBColor(Color.green.darker(), cur_command_box);
			} else {
				if ( overRunButton(model.run, x, y) && model.over_run_1 == false )  {
					model.over_run_1 = true;
					model.button_color = model.button_color.darker();
				}
			}
		}

		// modify command box 
		
	}

	
	public void mouseReleased(int arg0, int x, int y) {
		// TODO Auto-generated method stub
		
		// check to modify stack
		if (model.cur_screen == Model.Screen.LEVEL1) {
			if (cur_command_box != null) {
				model.changeCBColor(Color.green, cur_command_box);
				int section = model.stack.getClosestSection(cur_command_box, cur_command_box.cur_x, cur_command_box.cur_y);
				if (section == -1) {
					model.modifyCBPos(cur_command_box, cur_command_box.x, cur_command_box.y);
				} else {
					model.modifyCBPos(cur_command_box, model.stack.x , model.stack.y + section*CommandBox.height);
				}
			} else {
				if (overRunButton(model.run, x, y)) {
					model.run();
					model.button_color = model.run_color;
					model.over_run_1 = false;
				}
		
			}
		}
		
	}

	public CommandBox getCurBox(int x, int y){
		
		if (model.cur_screen == Model.Screen.LEVEL1) {
			
			for (int i = 0; i< model.boxes.size(); i++){
				CommandBox temp = model.boxes.get(i);
				if (x > temp.cur_x && x < temp.cur_x+CommandBox.width &&
					y > temp.cur_y && y < temp.cur_y + CommandBox.height) {
					
					return temp;
				}
				
			}
			return null;
			
		}
		return null;
	}
	
	public boolean overRunButton(Rectangle rect, int x, int y) {
		if (x > rect.getX() && x < rect.getX() + rect.getWidth() &&
			y > rect.getY() && y < rect.getY() + rect.getHeight()) {
			
			return true;
		}
		return false;
	}



	                 
}
