import java.util.ArrayList;


public class Level1{
	//CommandBoxes
		CommandBox commandbox_1;
		CommandBox commandbox_2;
		
		Model model;
		
		public Level1(Model m){
			this.model = m;
			
			commandbox_1 = new CommandBox(40, 300, "clean counter");
			commandbox_2 = new CommandBox(40, 360, "clean dishes");
			
			model.boxes.add(0, commandbox_1);
			model.boxes.add(1, commandbox_2);
		}
		
		public void run(){
			boolean containsCommandBox1 = false;
			boolean containsCommandBox2 = false;
			for (int i = 0 ; i< model.stack.num_boxes; i++) {
				CommandBox temp = model.stack.box_stack[i];
				if (temp == null ){
					continue;
				}
				if (temp.str.equals(commandbox_1.str)){
					containsCommandBox1 = true;
				} else if (temp.str.equals(commandbox_2.str)){
					containsCommandBox2 = true;
				}
				
			}
			
			if (! (containsCommandBox1 && containsCommandBox2)){
				model.cur_error = model.error_1;
				model.cur_prog = Model.Progress.ERROR;
			} else {
				model.cur_error = "Done!";
				model.cur_prog = Model.Progress.SUCCESS;
			}
			
		}

}
