package lab;

import java.util.*;

class formException extends Exception{

	formException()
	{
		super();
	}
}


public class Form {


	String name;

	String address;

	String email;

	int hsc_perc;

	int ug_perc;

	long phone;

	void set(String n, String add ,String mail, int hsc_per, int ug_per, long ph)
	{

		name  = n;
		email = mail;
		address= add;
		hsc_perc = hsc_per;
		ug_perc = ug_per;
		phone = ph;

	}
	void check() throws formException
	{

		if(hsc_perc<60 || ug_perc<70)
			throw new formException();
		if(phone<1000000000 || phone>980000000)
			throw new NumberFormatException();

	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String n, m,j;

		int a,b;

		long p;

		System.out.println("Enter name:  ");

		n = sc.nextLine();
		System.out.println("Enter address:  ");
		m = sc.nextLine();

		System.out.println("Enter email:  ");

		j = sc.nextLine();
		System.out.println("Enter High School percentage:  ");
		a = sc.nextInt();
		System.out.println("Enter UG percentage:  ");
		b = sc.nextInt();
		System.out.println("Enter Phone number:  ");
		p = sc.nextLong();
		Form f = new Form();
		f.set(n,m,j,a,b,p);
		try
		{
			f.set(n,m,j,a,b,p);
			f.check();
			System.out.println("Admission done!!\n");
		}
		catch(formException e)
		{
			System.out.println("Not Eligible!!\n\n");
		}
		catch(NumberFormatException d)
		{
			System.out.println("Enter Details Correctly!!\n");
		}
	}

}
