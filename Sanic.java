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
	int hair1Y[] = {15, 38, 40};
	c.fillPolygon (hair1X, hair1Y, 3); //hair spike 1

	int hair2X[] = {35, 70, 55};
	int hair2Y[] = {20, 45, 50};
	c.fillPolygon (hair2X, hair2Y, 3); //hair spike 1

	int hair3X[] = {30, 55, 70};
	int hair3Y[] = {40, 50, 65};
	c.fillPolygon (hair3X, hair3Y, 3); //hair spike 1

	c.fillRect (30, 90, 30, 10); //arms
	c.fillRect (100, 90, 30, 10);

	c.setColor (Color.white);
	c.fillOval (25, 87, 15, 15); //hands
	c.fillOval (125, 87, 15, 15);

	c.setColor (Color.black);
	c.drawOval (25, 87, 15, 15); //outline
	c.drawOval (125, 87, 15, 15);

	c.setColor (sanicBody);
	int leg1X[] = {62, 72, 52, 47};
	int leg1Y[] = {122, 122, 150, 145};
	c.fillPolygon (leg1X, leg1Y, 4); //left leg

	int leg2X[] = {80, 90, 105, 100};
	int leg2Y[] = {122, 122, 145, 150};
	c.fillPolygon (leg2X, leg2Y, 4); //right leg

	c.setColor (sanicShoes);
	int shoe1X[] = {47, 52, 35};
	int shoe1Y[] = {145, 150, 152};
	c.fillPolygon (shoe1X, shoe1Y, 3); //left shoe

	int shoe2X[] = {105, 120, 100};
	int shoe2Y[] = {145, 150, 150};
	c.fillPolygon (shoe2X, shoe2Y, 3); //right shoe
    }
}
