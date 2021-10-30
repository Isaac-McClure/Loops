/**
 * 
 */
package loopDemo;

/**
 * @author Isaac McClure
 * Date: 30-October-21
 */
public class LoopDemo 
{
	public void whileLoop() 
	{
		int loopCounter = 1;
		
		while(loopCounter < 5)
		{
			System.out.print("I am printing in a loop: " + loopCounter + "\n");	
			loopCounter += 1;
		}
		
		System.out.println();	
	}
	
	public void doWhileLoop() 
	{
		int loopCounter = 1;
		do
		{
			System.out.print("I am printing in a loop: " + loopCounter + "\n");	
			loopCounter += 1;
		}
		while(loopCounter == -400);
	}
	
	public void forLoop()
	{
		String[] words = {"Word 1", "Word 2", "Word 3"};
		
		int numberOfWords = words.length;
		
		for(int wordNumber = 0; wordNumber < numberOfWords; wordNumber ++)
		{	
			System.out.print("I am printing words in a loop: " + words[wordNumber] + "\n");			
		}
	}
	
	public void forEachLoop()
	{
		String[] words = {"Word 1", "Word 2", "Word 3"};
				
		for(String word: words)
		{
			System.out.print("I am printing words in a loop: " + word + "\n");			
		}
	}
	
	public void breakExample()
	{
		String[] words = {"Word 1", "Word 2", "Word 3"};
		
		int numberOfWords = words.length;
		
		for(int wordNumber = 0; wordNumber < numberOfWords; wordNumber ++)
		{	
			if(wordNumber > 0)
			{
				break;				
			}
				
			System.out.print("I am printing words in a loop: " + words[wordNumber] + "\n");			
		}
	}
	
	public void continueExample()
	{
		String[] words = {"Word 1", "Word 2", "Word 3"};
		
		int numberOfWords = words.length;
		
		for(int wordNumber = 0; wordNumber < numberOfWords; wordNumber ++)
		{	
			if(wordNumber == 1)
			{
				continue;				
			}
				
			System.out.print("I am printing words in a loop: " + words[wordNumber] + "\n");			
		}
	}
}
