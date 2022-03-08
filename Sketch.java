import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(200, 250);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(50, 129, 168);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

  //foreground settings
    stroke(0,0,0);
    strokeWeight(1);
    fill(50, 168, 74);
    rect((float) (width/-20), (float) (height/1.06), (float) (width/0.9), (height));

  //draw the head
    fill(247, 231, 87);
    ellipse(100, 100, 150, 150);
    
  //white
    fill(255);
    
  //draw the eyes
    ellipse(75, 85, 30, 20);
    ellipse(125, 85, 30, 20);
    
  //black
    fill(8, 10, 10);
    
  //draw the pupils
    ellipse(75, 85, 10, 10);
    ellipse(125, 85, 10, 10);
    
  //red
    fill(255, 0, 0);
    
  //draw the mouth
    arc(100, 125, 80, 50, 0, 311/99);
    line(60, 125, 140, 125);

  //lines for body
    stroke(0, 0, 0);
    strokeWeight(2);
    line(100, 210, 100, 175);
    line(130, 190, 70, 190);
    line(120, 230, 100, 210);
    line(100, 210, 80, 230);
    
  }
  
  // define other methods down here.
}