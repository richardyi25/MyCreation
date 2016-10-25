/*
Richard Yi
My Creation
Mrs. Krasteva
Oct. 19 2016
*/

import hsa.Console;
import java.awt.*;

public class Background2
{
    private Console c;

    public Background2 (Console con)
    {
	c = con;
	draw ();
    }


    public void draw ()
    {
	Color betweenBricks = new Color (145, 50, 0);
	Color bricks = new Color (240, 123, 12);
	Color pyramidFloor = new Color (240, 175, 22);

	c.setColor (pyramidFloor); //draw floor
	for (int y = 120 ; y <= 500 ; y++)
	{
	    c.drawLine (0, y, 640, y);
	}

	c.setColor (bricks); //draw brick s
	for (int y = 0 ; y <= 120 ; y++)
	{
	    c.drawLine (0, y, 640, y);
	}

	c.setColor (betweenBricks);
	for (int y = 20 ; y <= 120 ; y += 20) //draw lines between bricks
	{
	    c.drawLine (0, y, 640, y);

	    for (int x = (y / 20) % 2 * 20 + 20 ; x <= 640 ; x += 40)
	    {
		c.drawLine (x, y - 20, x, y);
	    }
	}
    }
}
