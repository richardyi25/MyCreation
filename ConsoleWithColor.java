/*
Richard Yi
My Creation
Mrs. Krasteva
Oct. 19 2016
*/

import hsa.Console;
import java.awt.*;

//Helper class that is an alternate version of HSA Console
//Mitigates the "glitch" where colors can be weird when animating 2 Threads at once

public class ConsoleWithColor
{
    private Console c;

    public ConsoleWithColor (Console con)
    {
	c = con;
    }


    public void drawArc (int x, int y, int width, int height, int startAngle, int arcAngle, Color color)
    {
	c.setColor (color);
	c.drawArc (x, y, width, height, startAngle, arcAngle);
    }


    public void drawLine (int x1, int y1, int x2, int y2, Color color)
    {
	c.setColor (color);
	c.drawLine (x1, y1, x2, y2);
    }


    public void drawOval (int x, int y, int width, int height, Color color)
    {
	c.setColor (color);
	c.drawOval (x, y, width, height);
    }


    public void drawPolygon (int[] xPoints, int[] yPoints, int nPoints, Color color)
    {
	c.setColor (color);
	c.drawPolygon (xPoints, yPoints, nPoints);
    }


    public void drawRect (int x, int y, int width, int height, Color color)
    {
	c.setColor (color);
	c.drawRect (x, y, width, height);
    }


    public void drawString (String str, int x, int y, Color color)
    {
	c.setColor (color);
	c.drawString (str, x, y);
    }


    public void fillArc (int x, int y, int width, int height, int startAngle, int arcAngle, Color color)
    {
	c.setColor (color);
	c.fillArc (x, y, width, height, startAngle, arcAngle);
    }


    public void fillOval (int x, int y, int width, int height, Color color)
    {
	c.setColor (color);
	c.fillOval (x, y, width, height);
    }


    public void fillPolygon (int[] xPoints, int[] yPoints, int nPoints, Color color)
    {
	c.setColor (color);
	c.fillPolygon (xPoints, yPoints, nPoints);
    }


    public void fillRect (int x, int y, int width, int height, Color color)
    {
	c.setColor (color);
	c.fillRect (x, y, width, height);
    }
}
