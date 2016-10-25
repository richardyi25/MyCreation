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
	Color shrekSkin = new Color (215, 205, 45);
	Color shrekShirt = new Color (210, 220, 220);
	Color shrekShoes = new Color (153, 77, 0);

	c.clear ();

	c.setColor (shrekSkin);
	c.fillRect (50, 115, 12, 30);
	c.fillRect (75, 115, 12, 30); //legs

	c.fillRect (20, 65, 30, 12); //arms
	c.fillRect (90, 65, 30, 12);

	c.fillOval (12, 63, 15, 15); //hands
	c.fillOval (112, 63, 15, 15);

	c.setColor (shrekShirt); //body
	c.fillOval (40, 40, 60, 90);

	c.setColor (shrekShoes);
	c.drawLine (42, 100, 98, 100); //belt

	c.setColor (shrekSkin);

	int horn1X[] = {};
	int horn1Y[] = {};

	int horn2X[] = {};
	int horn2Y[] = {};

	c.fillOval (50, 0, 40, 60); //head

	c.setColor (Color.white);
	c.fillOval (56, 25, 12, 5); //eye background
	c.fillOval (71, 25, 12, 5);

	c.setColor (Color.black);
	c.fillOval (60, 25, 4, 4); //eyeballs
	c.fillOval (75, 25, 4, 4);

	c.drawArc (56, 20, 12, 5, 0, 180); //eyebrows
	c.drawArc (71, 20, 12, 5, 0, 180);

	c.drawOval (60, 35, 20, 7); //nose
	c.fillOval (65, 39, 4, 4); //nostrils
	c.fillOval (72, 39, 4, 4);

	c.fillArc (60, 40, 20, 15, 180, 180); //mouth

	c.setColor (shrekShoes);

	int shoe1X[] = {50, 62, 52, 35, 45}; //shoe 1
	int shoe1Y[] = {145, 145, 155, 155, 150};
	c.fillPolygon (shoe1X, shoe1Y, 5);

	int shoe2X[] = {75, 87, 90, 101, 80}; //shoe 2
	int shoe2Y[] = {145, 145, 150, 155, 155};
	c.fillPolygon (shoe2X, shoe2Y, 5);
    }
}
