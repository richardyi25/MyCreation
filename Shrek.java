import hsa.Console;
import java.awt.*;
import java.lang.Thread;

public class Shrek extends Thread
{
    private Console c;
    private ConsoleWithColor d;
    private int phase;

    public Shrek (Console con, int p)
    {
	c = con;
	d = new ConsoleWithColor (c);
	phase = p;
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
	if (phase == 1)
	    phase1 ();
    }


    private void phase1 ()
    {
	Color shrekSkin = new Color (153, 204, 0);
	Color shrekShirt = new Color (210, 220, 220);
	Color shrekShoes = new Color (153, 77, 0);
	Color pyramidFloor = new Color (240, 175, 22);

	for (int x = 0 ; x <= 300 ; x++)
	{

	    d.fillRect (-200 + x, 340, x, 500, pyramidFloor); //block erase

	    d.fillRect (-150 + x, 455, 12, 30, shrekSkin);
	    d.fillRect (-125 + x, 455, 12, 30, shrekSkin); //legs

	    d.fillRect (-180 + x, 415, 30, 12, shrekSkin); //arms
	    d.fillRect (-110 + x, 415, 30, 12, shrekSkin);

	    d.fillOval (-188 + x, 413, 15, 15, shrekSkin); //hands
	    d.fillOval (-88 + x, 413, 15, 15, shrekSkin);

	    d.fillOval (-160 + x, 380, 60, 90, shrekShirt); //body

	    d.drawLine (-158 + x, 440, -102 + x, 440, shrekShoes); //belt

	    int horn1X[] = { - 140 + x, -141 + x, -160 + x, -159 + x, -170 + x, -152 + x};
	    int horn1Y[] = {360, 365, 360, 362, 355, 355};
	    d.fillPolygon (horn1X, horn1Y, 6, shrekSkin); //horn 1

	    int horn2X[] = { - 120 + x, -119 + x, -90 + x, -95 + x, -85 + x, -90 + x};
	    int horn2Y[] = {360, 365, 360, 365, 355, 352};
	    d.fillPolygon (horn2X, horn2Y, 6, shrekSkin); //horn 2

	    d.fillOval (-150 + x, 340, 40, 60, shrekSkin); //head

	    d.fillOval (-144 + x, 365, 12, 5, Color.white); //eye background
	    d.fillOval (-129 + x, 365, 12, 5, Color.white);

	    d.fillOval (-140 + x, 365, 4, 4, Color.black); //eyeballs
	    d.fillOval (-125 + x, 365, 4, 4, Color.black);

	    d.drawArc (-144 + x, 360, 12, 5, 0, 180, Color.black); //eyebrows
	    d.drawArc (-129 + x, 360, 12, 5, 0, 180, Color.black);

	    d.drawOval (-140 + x, 375, 20, 7, Color.black); //nose
	    d.fillOval (-135 + x, 379, 4, 4, Color.black); //nostrils
	    d.fillOval (-128 + x, 379, 4, 4, Color.black);

	    d.fillArc (-140 + x, 380, 20, 15, 180, 180, Color.black); //mouth

	    int shoe1X[] = { - 150 + x, -138 + x, -148 + x, -165 + x, -155 + x}; //shoe 1
	    int shoe1Y[] = {485, 485, 495, 495, 490};
	    d.fillPolygon (shoe1X, shoe1Y, 5, shrekShoes);

	    int shoe2X[] = { - 125 + x, -113 + x, -110 + x, -99 + x, -120 + x}; //shoe 2
	    int shoe2Y[] = {485, 485, 490, 495, 490};
	    d.fillPolygon (shoe2X, shoe2Y, 5, shrekShoes);


	    delay (11);
	}
    }
}
