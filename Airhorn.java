import hsa.Console;
import java.awt.*;
import java.lang.Thread;

public class Airhorn extends Thread
{
    private Console c;
    private ConsoleWithColor d;

    public Airhorn (Console con)
    {
	c = con;
	d = new ConsoleWithColor (c);
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
	airhorn ();
    }


    public void airhorn ()
    {
	Color airhornTop = new Color (255, 0, 0);
	Color airhornBody = new Color (255, 204, 0);
	Color shades = new Color (13, 13, 13);
	Color pyramidFloor = new Color (240, 175, 22);

	int y = 300;

	for (int x = 640 ; x >= 400 ; x--)
	{
	    d.fillRect (x, y, 100, 140, pyramidFloor);

	    d.fillRect (40 + x, 20 + y, 20, 20, airhornTop); //top part
	    d.fillArc (35 + x, 20 + y, 15, 20, 90, 180, airhornTop);

	    int hornX[] = {55 + x, 80 + x, 80 + x};
	    int hornY[] = {30 + y, 20 + y, 40 + y};
	    d.fillPolygon (hornX, hornY, 3, airhornTop); //top part

	    int bodyTopX[] = {40 + x, 60 + x, 65 + x, 35 + x};
	    int bodyTopY[] = {40 + y, 40 + y, 60 + y, 60 + y};
	    d.fillPolygon (bodyTopX, bodyTopY, 4, airhornBody); //top part of body

	    d.fillRect (35 + x, 60 + y, 30, 60, airhornBody); //body middle
	    d.fillOval (35 + x, 110 + y, 30, 20, airhornBody); //body bottom

	    d.fillRect (10 + x, 70 + y, 15, 5, shades);
	    d.fillArc (20 + x, 58 + y, 25, 25, 180, 180, shades);
	    d.fillRect (40 + x, 70 + y, 15, 5, shades);
	    d.fillArc (50 + x, 58 + y, 25, 25, 180, 180, shades);
	    d.fillRect (70 + x, 70 + y, 7, 5, shades);
	}

	delay (500);

	c.setColor (Color.black);
	c.setFont (new Font ("Comic Sans MS", 0, 15));
	c.drawString ("I warned you...", 400, 450);
	delay (1000);
	d.fillRect (400, 435, 100, 25, pyramidFloor);

	delay (500);

	c.setColor (Color.black);
	c.setFont (new Font ("Comic Sans MS", 1, 16));
	c.drawString ("Behold the mighty quickscope!!1! XD", 350, 450);
	delay (2000);
	d.fillRect (350, 435, 300, 25, pyramidFloor);

	for (int x = 400 ; x <= 640 ; x++)
	{
	    d.fillRect (x, y, 100, 140, pyramidFloor);

	    d.fillRect (40 + x, 20 + y, 20, 20, airhornTop); //top part
	    d.fillArc (35 + x, 20 + y, 15, 20, 90, 180, airhornTop);

	    int hornX[] = {55 + x, 80 + x, 80 + x};
	    int hornY[] = {30 + y, 20 + y, 40 + y};
	    d.fillPolygon (hornX, hornY, 3, airhornTop); //top part

	    int bodyTopX[] = {40 + x, 60 + x, 65 + x, 35 + x};
	    int bodyTopY[] = {40 + y, 40 + y, 60 + y, 60 + y};
	    d.fillPolygon (bodyTopX, bodyTopY, 4, airhornBody); //top part of body

	    d.fillRect (35 + x, 60 + y, 30, 60, airhornBody); //body middle
	    d.fillOval (35 + x, 110 + y, 30, 20, airhornBody); //body bottom

	    d.fillRect (10 + x, 70 + y, 15, 5, shades);
	    d.fillArc (20 + x, 58 + y, 25, 25, 180, 180, shades);
	    d.fillRect (40 + x, 70 + y, 15, 5, shades);
	    d.fillArc (50 + x, 58 + y, 25, 25, 180, 180, shades);
	    d.fillRect (70 + x, 70 + y, 7, 5, shades);

	    delay (5);
	}
    }
}
