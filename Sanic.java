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
	Color sanicSkin = new Color (33, 159, 195);
	Color sanicShoes = new Color (237, 23, 0);

	c.setColor (sanicBody);
	c.fillOval (55, 70, 50, 60); //body
	
	c.setColor(sanicSkin);
	c.fillOval(70, 95, 10, 10); // "belly"
    }
}
