import hsa.Console;
import java.awt.*;
import java.lang.Thread;

public class Loominarty extends Thread //Loominarty is the "MLG" name for the Illuminati
{
    private Console c;
    private ConsoleWithColor d;


    public Loominarty (Console con)
    {
	c = con;
	d = new ConsoleWithColor (c);
    }


    public void run ()
    {
	loominarty ();
    }


    public void loominarty ()
    {
	Color bodyGreen = new Color (19, 150, 0);

	int bodyX[] = {80, 145, 15};
	int bodyY[] = {20, 140, 140};
	d.fillPolygon (bodyX, bodyY, 3, bodyGreen);
    }
}

