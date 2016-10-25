/*
Richard Yi
My Creation
Mrs. Krasteva
Oct. 19 2016


This program...
*/

import hsa.Console;
import java.awt.*;

public class MyCreation
{
    Console c;


    public MyCreation ()
    {
	c = new Console ("sample text XDD!!11!");
    }


    public void background1 ()
    {
	Background1 b = new Background1 (c);
    }


    public void background2 ()
    {
	Background2 b2 = new Background2 (c);
    }


    public void shrek1 ()
    {
	Shrek s = new Shrek (c, 1);
	s.start ();
    }


    public void sanic1 ()
    {
	Sanic s = new Sanic (c, 1);
	s.start ();
    }


    public static void main (String[] args)
    {
	MyCreation m = new MyCreation ();
	//m.background1 ();
	m.background2 ();
	m.shrek1 ();
	m.sanic1 ();
    }
}

