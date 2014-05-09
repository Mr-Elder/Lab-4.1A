// ********************************************************************
// Runs.java
//
// Finds the length of the longest run of heads in 100 flips of a coin.
// ********************************************************************




public class Lab4point1A
{
    public static void main (String[] args)
    {
	final int FLIPS = 10; // number of coin flips

	int currentRun = 0; // length of the current run of HEADS
	int maxRun = 0;     // length of the maximum run so far
	int headrun = 0;
	int coinvalue;
	int totalcount = 0;
	
	String message = ("\n");
	String results = ("\n");
	
	// Create a coin object

	Coin coin = new Coin();

	// Flip the coin FLIPS times
	
	for (int i = 0; i < FLIPS; i++)
	    {
		// Flip the coin & print the result

			coin.flip();
		
			message = coin.toString();

			results += (message + "\n");
		
			coinvalue = coin.getFace();
		

			if(coinvalue == 0)
			{
		
				headrun += 1;
		
				if(headrun > totalcount)
				{
					totalcount = headrun;
				}
		
			}
			else
			{
			
				headrun = 0;
			
			}	
		
		// Update the run information

	    }

	// Print the results
	
	GetInfo.showMessage(results + "\nHead run: " + totalcount + "\nCurrent Head run: " + headrun);
	
    }
}

 
