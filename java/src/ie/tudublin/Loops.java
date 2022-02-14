package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	

	public void setup() 
	{
		colorMode(HSB);
		
	}

	public void resetScreen()	
	{
	fill (0,0,0);
	rect(250, 250, 500, 500);
	}

	public void draw()
	{	
		
		if (mouseX > 250) {
            resetScreen();

            fill(1, 255, 255);
            rectMode(CENTER);
            rect(375, 250, 250, 500); // cx, cy, w, h
		} 
		
		else {
            resetScreen();

            fill(1, 255, 255);
            rectMode(CENTER);
            rect(125, 250, 250, 500); // cx, cy, w, h

        	}
	}
}
