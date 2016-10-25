import hsa.Console;
import java.awt.*;
import java.lang.Thread;

public class Shrek extends Thread
{
    private Console c;
    private int phase;

    public Shrek (Console con, int p)
    {
	c = con;
	phase = p;
    }


    public void run ()
    {
	if (phase == 1)
	    phase1 ();
    }


    private void phase1 ()
    {
	Color shrekSkin = new Color (153, 204, 0);
	Color shrekShirt = new Color (210, 220, 220);
	Color shrekShoes = new Color (153, 77, 0);
	Color pyramidFloor = new Color (240, 175, 22);

	for (int x = 0 ; x <= 200 ; x++)
	{

	    c.setColor (pyramidFloor);
	    c.fillRect (-200 + x, 340, x, 500); //block erase

	    c.setColor (shrekSkin);
	    c.fillRect (-150 + x, 455, 12, 30);
	    c.fillRect (-125 + x, 455, 12, 30); //legs

	    c.fillRect (-180 + x, 415, 30, 12); //arms
	    c.fillRect (-110 + x, 415, 30, 12);

	    c.fillOval (-188 + x, 413, 15, 15); //hands
	    c.fillOval (-88 + x, 413, 15, 15);

	    c.setColor (shrekShirt); //body
	    c.fillOval (-160 + x, 380, 60, 90);

	    c.setColor (shrekShoes);
	    c.drawLine (-158 + x, 440, -102 + x, 440); //belt

	    c.setColor (shrekSkin);

	    int horn1X[] = { - 140 + x, -141 + x, -160 + x, -159 + x, -170 + x, -152 + x};
	    int horn1Y[] = {360, 365, 360, 362, 355, 355};
	    c.fillPolygon (horn1X, horn1Y, 6); //horn 1

	    int horn2X[] = { - 120 + x, -119 + x, -90 + x, -95 + x, -85 + x, -90 + x};
	    int horn2Y[] = {360, 365, 360, 365, 355, 352};
	    c.fillPolygon (horn2X, horn2Y, 6); //horn 2

	    c.fillOval (-150 + x, 340, 40, 60); //head

	    c.setColor (Color.white);
	    c.fillOval (-144 + x, 365, 12, 5); //eye background
	    c.fillOval (-129 + x, 365, 12, 5);

	    c.setColor (Color.black);
	    c.fillOval (-140 + x, 365, 4, 4); //eyeballs
	    c.fillOval (-125 + x, 365, 4, 4);

	    c.drawArc (-144 + x, 360, 12, 5, 0, 180); //eyebrows
	    c.drawArc (-129 + x, 360, 12, 5, 0, 180);

	    c.drawOval (-140 + x, 375, 20, 7); //nose
	    c.fillOval (-135 + x, 379, 4, 4); //nostrils
	    c.fillOval (-128 + x, 379, 4, 4);

	    c.fillArc (-140 + x, 380, 20, 15, 180, 180); //mouth

	    c.setColor (shrekShoes);

	    int shoe1X[] = { - 150 + x, -138 + x, -148 + x, -165 + x, -155 + x}; //shoe 1
	    int shoe1Y[] = {485, 485, 495, 495, 490};
	    c.fillPolygon (shoe1X, shoe1Y, 5);

	    int shoe2X[] = { - 125 + x, -113 + x, -110 + x, -99 + x, -120 + x}; //shoe 2
	    int shoe2Y[] = {485, 485, 490, 495, 490};
	    c.fillPolygon (shoe2X, shoe2Y, 5);

	    try
	    {
		sleep (10);
	    }
	    catch (InterruptedException e)
	    {
	    }
	}
    }
}
