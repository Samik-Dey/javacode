	/*

	1 2 3 4 5 6 

	11 12 13 14 15 16
	21 22 23 24 25 26
	31 32 33 34 35 36
	41 42 43 44 45 46
	51 52 53 54 55 56
	61 62 63 64 65 66
	

	*/

	class TestIndex
	{
		public static void main( String[] args)	
		{
			for( int i = 1;i<=6; i++)
			{
				for( int j = 1;j<=6; j++)
				{
					if(i==j)
					{
					System.out.print(i + " " +j+"     ");
					}
				}
			System.out.println();
			
			}
		}
	}
		