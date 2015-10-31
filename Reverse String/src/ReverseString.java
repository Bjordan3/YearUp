
public class ReverseString {

	public static void main(String[] args) {
		ReverseOutofPlace("java");
		ReverseInPlace("java");
	}
	
	public static void ReverseOutofPlace(String originalString)
	{
		if(originalString != null)
		{
			char[] originalStringCharacters = originalString.toCharArray();
			char[] reversedStringCharacters = new char[originalString.length()];
			
			for (int i=0, j = originalStringCharacters.length -1; i < reversedStringCharacters.length; i++, j--)
			{
				reversedStringCharacters[i] = originalStringCharacters[j];
			}
			
			String reversedString = new String(reversedStringCharacters);
			System.out.println("The reversed String out of place is: " + reversedString);
		}
	}
		
		public static void ReverseInPlace(String originalString1)
		{
			if(originalString1 != null)
			{
				char[] characters = originalString1.toCharArray();
				
				for (int i = 0, j = characters.length - 1; i < characters.length/2; i++, j--)
				{
					char temp = characters[j];
					characters[j] = characters[i];
					characters[i] = temp;
				}
				
				String reversedString = new String(characters);
				System.out.println("The reversed string in place is: " + reversedString);
			}
		}
	}
