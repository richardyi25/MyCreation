/*
Richard Yi
Background #1
Mrs. Krasteva
Oct. 19 2016


This program...
*/

import hsa.Console;
import java.awt.*;
import java.lang.Thread;

public class Background1
{
    private Console c;
    private ConsoleWithColor d;

    public Background1 (Console con)
    {
	c = con;
	d = new ConsoleWithColor (c);
	draw ();
    }


    private void draw ()
    {
	Color sand = new Color (255, 233, 121);
	Color lightSand = new Color (255, 255, 151);
	Color skyBlue = new Color (99, 210, 255);
	Color dorito = new Color (247, 111, 0);
	Color sun = new Color (255, 255, 0);
	Color deadBush = new Color (153, 76, 0);
	Color skull = new Color (255, 240, 190);
	Color skullEyes = new Color (43, 31, 6);


	for (int x = 0 ; x <= 640 ; x++) //sky
	{
	    d.drawLine (x, 0, x, 180, skyBlue);
	}

	for (int i = 0 ; i <= 80 ; i++) //draw sun
	{
	    d.drawOval (380 - i, 200 - i, i * 2, i * 2, sun);
	}


	for (int x = 0 ; x <= 640 ; x++) //draw sand
	{
	    d.drawLine (x, 180, x, 500, sand);
	}

	for (int i = 60 ; i <= 220 ; i++) //dorito pyramid 1
	{
	    d.drawLine (140, 120, i, 240, dorito);
	}

	for (int i = 160 ; i <= 460 ; i++) //dorito pyramid 2
	{
	    d.drawLine (300, 40, i, 320, dorito);
	}


	for (int i = 360 ; i <= 600 ; i++) //dorito pyramid 3
	{
	    d.drawLine (500, 100, i, 240, dorito);
	}

	d.drawLine (80, 460, 80, 420, deadBush); //dead bush 1
	d.drawLine (80, 440, 60, 440, deadBush);
	d.drawLine (80, 440, 100, 440, deadBush);
	d.drawLine (80, 440, 60, 420, deadBush);
	d.drawLine (80, 440, 100, 420, deadBush);

	d.drawLine (420, 440, 420, 400, deadBush); //dead bush 2
	d.drawLine (420, 420, 400, 420, deadBush);
	d.drawLine (420, 420, 440, 420, deadBush);
	d.drawLine (420, 420, 400, 400, deadBush);
	d.drawLine (420, 420, 440, 400, deadBush);

	for (int i = 0 ; i <= 20 ; i++) //skull in sand
	{
	    d.drawOval (520 - i, 340 - i, i * 2, i * 2, skull);
	}

	for (int i = 0 ; i < 5 ; i++) //draw skull eyes
	{
	    d.drawOval (512 - i, 335 - i, i * 2, i * 2, skullEyes);
	    d.drawOval (528 - i, 335 - i, i * 2, i * 2, skullEyes);
	}

	for (int i = 500 ; i <= 540 ; i++) //redraw sand on top of skull
	{
	    d.drawLine (i, 350, i, 380, sand);
	}



	try
	{
	    Thread.sleep (2000);
	}
	catch (InterruptedException e)
	{

	}
    }
}
