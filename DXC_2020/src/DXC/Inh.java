package DXC;

public class Inh 
{
		public void hobbies() 
		{
			System.out.println("Gandfather watching Devotional channel");
		}
	}

   class Father extends Inh
	{
		public void profession()
		{
			System.out.println("Father doing Trading business");
		}
	}

	class Son extends Father
	{
		void education() 
		{
			System.out.println("son doing Engineering");
		}
	}