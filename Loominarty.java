import hsa.Console;
import java.awt.*;
import java.lang.Thread;

public class Loominarty extends Thread //Loominarty is the "MLG" name for the Illuminati
{
    private Console c;
    private ConsoleWithColor d;


    public Loominarty (Console con)
    {
	c = con;
	d = new ConsoleWithColor (c);
    }


    public void run ()
    {
	loominarty ();
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


    public void loominarty ()
    {
	Color bodyGreen = new Color (19, 150, 0);
	Color pyramidFloor = new Color (240, 175, 22);

	int y = 200;

	for (int x = 640 ; x >= 400 ; x--)
	{
	    d.fillRect (x, y, 160, 160, pyramidFloor);

	    int bodyX[] = {80 + x, 145 + x, 15 + x};
	    int bodyY[] = {20 + y, 140 + y, 140 + y};
	    d.fillPolygon (bodyX, bodyY, 3, bodyGreen);

	    d.fillOval (40 + x, 85 + y, 80, 40, Color.white);
	    d.fillOval (65 + x, 85 + y, 30, 42, Color.black);

	    d.fillRect (80 + x, 150 + y, 2, 10, Color.yellow);
	    d.fillRect (20 + x, 80 + y, 10, 2, Color.yellow);
	    d.fillRect (130 + x, 80 + y, 10, 2, Color.yellow);
	    d.fillRect (80 + x, 5 + y, 2, 10, Color.yellow);

	    d.drawLine (40 + x, 50 + y, 30 + x, 40 + y, Color.yellow);
	    d.drawLine (120 + x, 50 + y, 130 + x, 40 + y, Color.yellow);
	    d.drawLine (40 + x, 145 + y, 30 + x, 155 + y, Color.yellow);
	    d.drawLine (120 + x, 145 + y, 130 + x, 155 + y, Color.yellow);

	    delay (10);
	}

	c.setFont (new Font ("Comic Sans MS", 0, 14));
	c.setColor (Color.black);

	c.drawString ("I have come to warn you.", 400, 400);
	delay (1500);
	d.fillRect (400, 385, 170, 20, pyramidFloor);

	delay (500);

	c.setColor (Color.black);
	c.drawString ("You will get quickscoped...", 400, 400);
	delay (1500);
	d.fillRect (400, 385, 170, 20, pyramidFloor);

	delay (1000);

	for (int x = 400 ; x <= 640 ; x++)
	{
	    d.fillRect (x, y, 160, 160, pyramidFloor);

	    int bodyX[] = {80 + x, 145 + x, 15 + x};
	    int bodyY[] = {20 + y, 140 + y, 140 + y};
	    d.fillPolygon (bodyX, bodyY, 3, bodyGreen);

	    d.fillOval (40 + x, 85 + y, 80, 40, Color.white);
	    d.fillOval (65 + x, 85 + y, 30, 42, Color.black);

	    d.fillRect (80 + x, 150 + y, 2, 10, Color.yellow);
	    d.fillRect (20 + x, 80 + y, 10, 2, Color.yellow);
	    d.fillRect (130 + x, 80 + y, 10, 2, Color.yellow);
	    d.fillRect (80 + x, 5 + y, 2, 10, Color.yellow);

	    d.drawLine (40 + x, 50 + y, 30 + x, 40 + y, Color.yellow);
	    d.drawLine (120 + x, 50 + y, 130 + x, 40 + y, Color.yellow);
	    d.drawLine (40 + x, 145 + y, 30 + x, 155 + y, Color.yellow);
	    d.drawLine (120 + x, 145 + y, 130 + x, 155 + y, Color.yellow);

	    delay (10);
	}
    }
}

