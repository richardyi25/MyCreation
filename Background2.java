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
    private ConsoleWithColor d;

    public Background2 (Console con)
    {
	c = con;
	d = new ConsoleWithColor (c);
	draw ();
    }


    public void draw ()
    {
	Color betweenBricks = new Color (145, 50, 0);
	Color bricks = new Color (240, 123, 12);
	Color pyramidFloor = new Color (240, 175, 22);

	for (int y = 120 ; y <= 500 ; y++) //draw floor
	{
	    d.drawLine (0, y, 640, y, pyramidFloor);
	}

	for (int y = 0 ; y <= 120 ; y++) //draw bricks
	{
	    d.drawLine (0, y, 640, y, bricks);
	}

	for (int y = 20 ; y <= 120 ; y += 20) //draw lines between bricks
	{
	    d.drawLine (0, y, 640, y, betweenBricks);

	    for (int x = (y / 20) % 2 * 20 + 20 ; x <= 640 ; x += 40)
	    {
		d.drawLine (x, y - 20, x, y, betweenBricks);
	    }
	}
    }
}
