import hsa.Console;
import java.awt.*;

public class TheEnd implements Runnable
{
    private Console c;
    private ConsoleWithColor d;

    public TheEnd (Console con)
    {
	c = con;
	d = new ConsoleWithColor (c);
    }


    public void delay (int ms)
    {
	try
	{
	    Thread.sleep (ms);
	}
	catch (InterruptedException e)
	{
	}
    }


    public void run ()
    {
	theEnd ();
    }


    public void theEnd ()
    {
	int x = 300;
	int y = 100;
	String dir = "SE";

	c.setColor (Color.black);
	for (int i = 0 ; i <= 500 ; i++)
	    c.drawLine (0, i, 640, i);


	c.setFont (new Font ("Comic Sans MS", 1, 50));

	for (;;)
	{
	    c.setColor (Color.black);
	    c.drawString ("sample text", x, y);


	    if (dir == "NE")
	    {
		x++;
		y--;
		if (y <= 20)
		    dir = "SE";
		if (x + 280 >= 640)
		    dir = "NW";
	    }
	    else if (dir == "NW")
	    {
		x--;
		y--;
		if (y <= 20)
		    dir = "SW";
		if (x <= 0)
		    dir = "NE";
	    }
	    else if (dir == "SE")
	    {
		x++;
		y++;
		if (y >= 500)
		    dir = "NE";
		if (x + 280 >= 640)
		    dir = "SW";
	    }
	    else if (dir == "SW")
	    {
		x--;
		y++;
		if (y >= 500)
		    dir = "NW";
		if (x <= 0)
		    dir = "SE";
	    }
	    c.setColor (Color.white);
	    c.drawString ("sample text", x, y);
	    delay (2);
	}
    }
}


