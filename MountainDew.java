/*
Richard Yi
My Creation
Mrs. Krasteva
Oct. 19 2016
*/

import hsa.Console;
import java.awt.*;
import java.lang.*;

public class MountainDew extends Thread
{
    private Console c;
    private ConsoleWithColor d;
    private Color color;
    private int x, y;

    public MountainDew (Console con)
    {
	c = con;
	d = new ConsoleWithColor (c);
	color = new Color (28, 255, 0); //mountain dew green
	x = 640;
	y = 340;
    }


    public MountainDew (Console con, Color col)  //overloaded constructors
    {
	c = con;
	d = new ConsoleWithColor (c);
	color = col;
	x = 660;
	y = 420;
    }


    public MountainDew (Console con, Color col, int X, int Y)
    {
	c = con;
	d = new ConsoleWithColor (c);
	color = col;
	x = X;
	y = Y;
    }


    public void delay (int ms)
    {
	try
	{
	    sleep (ms);
	}
	catch (InterruptedException e)
	{
	}
    }


    public void run ()
    {
	mountainDew ();
    }


    public void mountainDew ()
    {
	Color cap = new Color (255, 61, 0);
	Color label = new Color (140, 140, 140);
	Color pyramidFloor = new Color (240, 175, 22);

	for (int i = x ; i >= x - 300 ; i--)
	{
	    d.fillRect (i + 1, y, 60, 80, pyramidFloor);

	    d.fillRect (25 + i, 5 + y, 10, 5, cap); //cap

	    int topX[] = {25 + i, 35 + i, 35 + i, 40 + i, 20 + i, 25 + i};
	    int topY[] = {10 + y, 10 + y, 15 + y, 20 + y, 20 + y, 15 + y};
	    d.fillPolygon (topX, topY, 6, color); //top of bottle

	    d.fillRect (20 + i, 20 + y, 20, 50, color); //middle of bottle

	    d.fillRect (20 + i, 30 + y, 20, 20, label); //label of bottle

	    d.fillOval (20 + i, 67 + y, 20, 6, color); //bottom of bottle

	    delay (2);
	}

	delay (300);
	Font f = new Font ("Comic Sans MS", 1, 14);
	c.setFont (f);

	c.setColor (Color.black);
	c.drawString ("GET HIM!!!", 400, 400);
	
	delay(500);
	d.fillRect (400, 380, 80, 20, pyramidFloor);

	delay (500);

	for (int i = x - 300 ; i >= -60 ; i--)
	{
	    d.fillRect (i + 1, y, 60, 80, pyramidFloor);

	    d.fillRect (25 + i, 5 + y, 10, 5, cap); //cap

	    int topX[] = {25 + i, 35 + i, 35 + i, 40 + i, 20 + i, 25 + i};
	    int topY[] = {10 + y, 10 + y, 15 + y, 20 + y, 20 + y, 15 + y};
	    d.fillPolygon (topX, topY, 6, color); //top of bottle

	    d.fillRect (20 + i, 20 + y, 20, 50, color); //middle of bottle

	    d.fillRect (20 + i, 30 + y, 20, 20, label); //label of bottle

	    d.fillOval (20 + i, 67 + y, 20, 6, color); //bottom of bottle

	    delay (2);
	}
    }
}
