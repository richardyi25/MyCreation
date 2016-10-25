import hsa.Console;
import java.awt.*;
import java.lang.Runnable;

public class Sanic implements Runnable
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
	
    }
}
