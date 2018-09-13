
public class TherewasAnOldLady
{

	public static void main(String[] args)
	{
	//jhkaf	
		System.out.println("There was an old lady who swallowed a fly,");
		iDontKnowWhy();
		thereWas("spider", "that wriggled and iggled and jiggled inside her");
		sheSwallowedThat("spider","fly");
		
		iDontKnowWhy();
		thereWas("bird","How abusrd to swallow a bird");
		sheSwallowedThat("bird","spider");
		sheSwallowedThat("spider","fly");
		iDontKnowWhy();
		
		thereWas("cat","Imagine that to swallow a cat");
		sheSwallowedThat("cat","bird");
		sheSwallowedThat("bird","spider");
		sheSwallowedThat("spider","fly");
		iDontKnowWhy();
		
		thereWas("dog","What a hog to swallow a dog");
		sheSwallowedThat("dog","cat");
		sheSwallowedThat("cat","bird");
		sheSwallowedThat("bird","spider");
		sheSwallowedThat("spider","fly");
		iDontKnowWhy();
		
		thereWas("horse","She died of course");
		
	}
	
	public static void thereWas(String animal, String rhyme)
	{
		System.out.println("There was an old lady who swallowed a " + animal + ",\n" + rhyme + ".");
	}
	public static void sheSwallowedThat (String first, String second)
	{
		System.out.println("She swallowed the " + first + " to catch the " + second + ",");
	}
	public static void iDontKnowWhy()
	{
		System.out.println("I dont know why she swallowed that fly,\nperhaps she'll die.\n");
	}
	

}
