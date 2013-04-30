import org.newdawn.slick.*;
import org.newdawn.slick.geom.ShapeRenderer;



public class View {
	
	Model model;
	
	public View(Model model) {
		
		this.model = model;
	}
	// albhalbab

	// get values from model and draw
	public void render(GameContainer gc, Graphics g) {
		
		//start screen
		if (model.cur_screen == Model.Screen.START){
			model.start_screen.render(g);
		}
		//draw command boxes
		else if (model.cur_screen == Model.Screen.LEVEL1) {
			g.setBackground(Color.black);
			for (int x = 0; x < model.boxes.size(); x++) {
				
				CommandBox temp_box = model.boxes.get(x);
				g.setColor(temp_box.rect_color);
				temp_box.render();
				g.setColor(temp_box.text_color);
				g.drawString(temp_box.str, temp_box.cur_x, temp_box.cur_y);
			}
			g.setColor(model.button_color);
			ShapeRenderer.fill(model.run);
			g.setColor(Color.black);
			g.drawString("RUN", model.run.getCenterX()-15, model.run.getCenterY() - 5);
			model.stack.render(g);
			
			if (model.cur_prog == Model.Progress.ERROR){
				g.setColor(Color.red);
				g.drawString(model.cur_error, 100, 100);
			} else if (model.cur_prog == Model.Progress.SUCCESS) {
				g.setColor(Color.green);
				g.drawString(model.cur_error, 100, 150);
			}
		}
		
		// draw stack
		
		
	}

}
