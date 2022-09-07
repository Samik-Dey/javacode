/*


*
**
***
****
*****

11
21 22
31 32 33
41 42 43 44
51 52 53 54 55


*/

class Pattern1
{

	public static void main( String[] args)	
		{
			for( int i = 1;i<=5; i++)
			{
				for( int j = 1;j<=i; j++)
				{					
					System.out.print("*");			
				}
			System.out.println();
			
			}
		}

}