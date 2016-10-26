/*
Richard Yi
My Creation
Mrs. Krasteva
Oct. 19 2016
*/

import hsa.Console;
import java.awt.*;
import java.lang.Thread;

public class Quickscope extends Thread
{
    private Console c;
    private ConsoleWithColor d;

    public Quickscope (Console con)
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
	quickscope ();
    }


    public void quickscope ()
    {
	Color gun = new Color (50, 50, 50);
	Color pyramidFloor = new Color (240, 175, 22);

	int y = 300;

	for (int x = 640 ; x >= 100 ; x--)
	{
	    d.fillRect (x, y, 160, 60, pyramidFloor);

	    int gunX[] = {10 + x, 150 + x, 150 + x, 130 + x, 60 + x, 60 + x, 10 + x};
	    int gunY[] = {20 + y, 20 + y, 45 + y, 35 + y, 35 + y, 30 + y, 30 + y};
	    d.fillPolygon (gunX, gunY, 7, gun);

	    d.drawLine (100 + x, 20 + y, 100 + x, 15 + y, gun);
	    d.drawLine (110 + x, 20 + y, 110 + x, 15 + y, gun);

	    d.fillRect (70 + x, 5 + y, 50, 10, gun);
	    d.fillOval (115 + x, 5 + y, 10, 10, gun);
	    d.drawOval (115 + x, 5 + y, 9, 10, Color.black);

	    //delay (10);
	}

	Color explosion[] = {new Color (232, 147, 58), new Color (232, 147, 58), new Color (188, 46, 7) };

	Color explosion1 = new Color (232, 147, 58);
	Color explosion2 = new Color (239, 255, 66);
	Color explosion3 = new Color (188, 46, 7);

	for (int i = 0 ; i < 1000 ; i++)
	{
	    d.drawOval (200 - i / 2, 300 - i / 2, i, i, explosion [i % 3]);
	    //delay (1);
	}

	d.fillRect (0, 0, c.maxx (), c.maxy (), Color.black);
	c.setColor (Color.white);
	c.setFont (new Font ("Comic Sans MS", 1, 50));
	c.drawString ("The end.", 100, 100);

    }
}
