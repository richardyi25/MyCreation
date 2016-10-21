/*
Richard Yi
Background #1
Mrs. Krasteva
Oct. 19 2016


This program...
*/

import hsa.Console;
import java.awt.*;

public class Background1
{
    private Console c;

    public Background1 (Console con)
    {
	c = con;
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
	Color skullEyes = new Color(43, 31, 6);


	c.setColor (skyBlue);
	for (int x = 0 ; x <= 640 ; x++)
	{
	    c.drawLine (x, 0, x, 180);
	}

	c.setColor (sun);
	for (int i = 0 ; i <= 80 ; i++)
	{
	    c.drawOval (380 - i, 200 - i, i * 2, i * 2);
	}

	c.setColor (lightSand);
	
	for (int x = 0 ; x <= 640 ; x++)
	{
	    c.drawLine (x, 180, x, 500);
	}

	c.setColor (sand);
	for (int x = 0 ; x <= 640 ; x++)
	{
	    c.drawLine (x, 180, x * 10, 500);
	    c.drawLine (x, 180, x * 5, 500);
	    c.drawLine (x, 180, x * 2, 500);
	}

	c.setColor (dorito);
	for (int i = 60 ; i <= 220 ; i++)
	{
	    c.drawLine (140, 120, i, 240);
	}

	for (int i = 160 ; i <= 460 ; i++)
	{
	    c.drawLine (300, 40, i, 320);
	}

	for (int i = 360 ; i <= 600 ; i++)
	{
	    c.drawLine (500, 100, i, 240);
	}

	c.setColor (deadBush);
	c.drawLine (80, 460, 80, 420);
	c.drawLine (80, 440, 60, 440);
	c.drawLine (80, 440, 100, 440);
	c.drawLine (80, 440, 60, 420);
	c.drawLine (80, 440, 100, 420);

	c.setColor (deadBush);
	c.drawLine (420, 440, 420, 400);
	c.drawLine (420, 420, 400, 420);
	c.drawLine (420, 420, 440, 420);
	c.drawLine (420, 420, 400, 400);
	c.drawLine (420, 420, 440, 400);

	//520, 340
	c.setColor (skull);
	for (int i = 0 ; i <= 20 ; i++)
	{
	    c.drawOval (520 - i, 340 - i, i * 2, i * 2);
	}

	c.setColor(skullEyes);
	//for(int i = 0
	c.setColor (sand);
	for (int i = 500 ; i <= 540 ; i++)
	{
	    c.drawLine (i, 350, i, 380);
	}
	
	
    }
}
