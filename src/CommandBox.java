import org.newdawn.slick.geom.*;


public class CommandBox {
	
	// original position
	int x;
	int y;
	
	// current position
	int cur_x;
	int cur_y;
	
	// java rectangle
	
	int width = 50;
	int height = 25;
	Rectangle rect;
	//ShapeRenderer renderer;
	
	// command string
	
	public CommandBox(int x, int y) {
		this.x = x;
		this.y = y;
		this.cur_x = x;
		this.cur_y = y;
		
		rect = new Rectangle(x, y, width, height);
		//renderer = new ShapeRenderer();
	}
	                     
	public void render() {
		
		// draw rectangle
		ShapeRenderer.fill(rect);
	}
	                  

}
