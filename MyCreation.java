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


    public void sanic1 ()
    {
	Sanic s = new Sanic (c, 1);
	s.start ();

    }



    public void shrek1 ()
    {
	Shrek s = new Shrek (c, 1);
	s.start ();

	try
	{
	    s.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void shrek2 ()
    {
	Shrek s = new Shrek (c, 2);
	s.start ();
    }


    public void mountainDew ()
    {
	Color mtnOrange = new Color (255, 149, 41);
	Color mtnBlue = new Color (78, 179, 255);

	MountainDew md1 = new MountainDew (c);
	md1.start ();
	MountainDew md2 = new MountainDew (c, mtnOrange);
	md2.start ();
	MountainDew md3 = new MountainDew (c, mtnBlue, 600, 420);
	md3.start ();

	try
	{
	    md3.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void shrek3 ()
    {
	Shrek s = new Shrek (c, 3);
	s.start ();

	try
	{
	    s.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void loominarty ()
    {
	Loominarty l = new Loominarty (c);
	l.start ();

	try
	{
	    l.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void airhorn ()
    {
	Airhorn a = new Airhorn (c);
	a.start ();

	try
	{
	    a.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void quickscope ()
    {
	Quickscope q = new Quickscope (c);
	q.start ();

	try
	{
	    q.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public static void main (String[] args)
    {
	MyCreation m = new MyCreation ();


	//m.background1 ();
	m.background2 ();

	m.sanic1 ();
	m.shrek1 ();
	m.shrek2 ();
	m.mountainDew ();
	m.shrek3 ();
	m.loominarty ();
	m.airhorn ();


	m.quickscope ();
    }
}

