import hsa.Console;
import java.awt.*;
import java.lang.*;

public class MountainDew extends Thread
{
    private Console c;
    private ConsoleWithColor d;
    private Color color;

    public MountainDew (Console con)
    {
	c = con;
	d = new ConsoleWithColor (c);

	color = new Color (28, 255, 0);
    }


    public MountainDew (Console con, Color col)
    {
	c = con;
	d = new ConsoleWithColor (c);
	color = col;
    }
}
