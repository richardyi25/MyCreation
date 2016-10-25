import hsa.Console;
import java.awt.*;
import java.lang.Runnable;

public class Sanic implements Runnable
{
    private Console c;
    private int phase;

    public Sanic (Console con, int p)
    {
	c = con;
	phase = p;
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

	c.setColor (sanicBody);
	c.fillOval (55, 35, 50, 40); //head
	c.fillRect (70, 70, 20, 10); //neck
	c.fillOval (55, 70, 50, 60); //body


	c.setColor (sanicSkin);
	c.fillOval (70, 95, 20, 20); // "belly"
	c.fillOval (65, 55, 30, 10); //mouth outline
	c.fillOval (65, 45, 15, 7); //eye background
	c.fillOval (80, 45, 15, 7); //eye background

	c.setColor (Color.black);
	c.fillOval (70, 45, 5, 7); //eyeballs
	c.fillOval (85, 45, 5, 7);
	c.drawLine (70, 60, 90, 60);

	c.setColor (sanicBody);
	int hair1X[] = {50, 90, 65};
	int hair1Y[] = {10, 33, 30};
	c.fillPolygon (hair1X, hair1Y, 3);

	int hair2X[] = {};
	int hair2Y[] = {};

	int hair3X[] = {};
	int hair3Y[] = {};
    }
}
