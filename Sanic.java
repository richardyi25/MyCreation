import hsa.Console;
import java.awt.*;
import java.lang.Runnable;

public class Sanic extends Thread
{
    private Console c;
    private ConsoleWithColor d;
    private int phase;

    public Sanic (Console con, int p)
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
	sanic ();
    }


    private void sanic ()
    {
	Color sanicBody = new Color (2, 28, 217);
	Color sanicSkin = new Color (255, 255, 179);
	Color sanicShoes = new Color (237, 23, 0);
	Color pyramidFloor = new Color (240, 175, 22);

	for (int x = -200 ; x <= 100 ; x++)
	{
	    d.fillRect (x, 150, x + 160, 310, pyramidFloor);

	    d.fillOval (55 + x, 185, 50, 40, sanicBody); //head
	    d.fillRect (70 + x, 220, 20, 10, sanicBody); //neck
	    d.fillOval (55 + x, 220, 50, 60, sanicBody); //body

	    d.fillOval (70 + x, 245, 20, 20, sanicSkin); // "belly"
	    d.fillOval (65 + x, 205, 30, 10, sanicSkin); //mouth outline
	    d.fillOval (65 + x, 195, 15, 7, sanicSkin); //eye background
	    d.fillOval (80 + x, 195, 15, 7, sanicSkin); //eye background

	    d.fillOval (70 + x, 195, 5, 7, Color.black); //eyeballs
	    d.fillOval (85 + x, 195, 5, 7, Color.black);
	    d.drawLine (70 + x, 210, 90 + x, 210, Color.black); //mouth line

	    int hair1X[] = {50 + x, 90 + x, 65 + x};
	    int hair1Y[] = {165, 188, 190};
	    d.fillPolygon (hair1X, hair1Y, 3, sanicBody); //hair spike 1

	    int hair2X[] = {35 + x, 70 + x, 55 + x};
	    int hair2Y[] = {170, 195, 200};
	    d.fillPolygon (hair2X, hair2Y, 3, sanicBody); //hair spike 1

	    int hair3X[] = {30 + x, 55 + x, 70 + x};
	    int hair3Y[] = {190, 200, 215};
	    d.fillPolygon (hair3X, hair3Y, 3, sanicBody); //hair spike 1

	    d.fillRect (30 + x, 240, 30, 10, sanicBody); //arms
	    d.fillRect (100 + x, 240, 30, 10, sanicBody);

	    d.fillOval (25 + x, 237, 15, 15, Color.white); //hands
	    d.fillOval (125 + x, 237, 15, 15, Color.white);

	    d.drawOval (25 + x, 237, 15, 15, Color.black); //outline
	    d.drawOval (125 + x, 237, 15, 15, Color.black);

	    int leg1X[] = {62 + x, 72 + x, 52 + x, 47 + x};
	    int leg1Y[] = {272, 272, 300, 295};
	    d.fillPolygon (leg1X, leg1Y, 4, sanicBody); //left leg

	    int leg2X[] = {80 + x, 90 + x, 105 + x, 100 + x};
	    int leg2Y[] = {272, 272, 295, 300};
	    d.fillPolygon (leg2X, leg2Y, 4, sanicBody); //right leg

	    int shoe1X[] = {47 + x, 52 + x, 35 + x};
	    int shoe1Y[] = {295, 300, 302};
	    d.fillPolygon (shoe1X, shoe1Y, 3, sanicShoes); //left shoe

	    int shoe2X[] = {105 + x, 120 + x, 100 + x};
	    int shoe2Y[] = {295, 300, 300};
	    d.fillPolygon (shoe2X, shoe2Y, 3, sanicShoes); //right shoe

	    delay (10);
	}
	Font f = new Font ("Comic Sans MS", 0, 14);
	c.setFont (f);

	c.drawString ("Wow we're here", 20, 200);
	delay (700);

	d.fillRect (20, 180, 120, 20, pyramidFloor);
    }
}
