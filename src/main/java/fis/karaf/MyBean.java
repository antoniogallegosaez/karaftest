package fis.karaf;

public class MyBean{

	String myvar;

	public void print(String str)
	{
		System.out.println("MyBean.arg: " + str);
		System.out.println("MyBean.myvar: " + myvar);
	}

	public void setMyvar(String var)
	{
		myvar = var;
	}

}