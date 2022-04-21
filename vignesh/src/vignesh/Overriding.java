package vignesh;

class DP
{

	public void learn()
	{
		System.out.println("Dynamic");
	}
}

	class CP extends DP
	{
		public void learn()
		{
			super.learn();
			System.out.println("Competitive");
		}
	}

		class Programming extends CP
		{
			public void learn()
			{
				
				
					
				super.learn();
	     System.out.println("Programming");
	     }
	}
			
			public class Overriding
			{
				public static void main(String[] args)
				{
					// TODO Auto-generated method stub
					Programming obj = new Programming();
					obj.learn();

				}
			}
		
				