package a3;


public class DeleteConsonants {
	public static void main(String args[])
	{
		String s = "Hello World";
		s = s.toLowerCase();
		String regex = "[a-z &&[^aeiou]]";
		String res = s.replaceAll(regex, "");
		System.out.println(res);
	}
}
