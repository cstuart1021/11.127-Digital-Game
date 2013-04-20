import org.newdawn.slick.*;
public class HelloWorld extends BasicGame
{
 
  public HelloWorld()
  {
     super("Hello World");
  }
 
  
  public void init(GameContainer gc) throws SlickException
  {
 
  }
 
  
  public void update(GameContainer gc, int delta) throws SlickException
  {
 
  }
 
 
  public void render(GameContainer gc, Graphics g) throws SlickException
  {
     g.drawString("Hello World", 100, 100);
  }
 
  public static void main(String[] args) throws SlickException
  {
     AppGameContainer app = new AppGameContainer(new HelloWorld());
 
     app.setDisplayMode(800, 600, false);
     app.start();
  }
}