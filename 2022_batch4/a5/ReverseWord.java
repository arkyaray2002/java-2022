package a5;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str = "";
		int word_count = 0;
		String word = "";
		char c;
		sc.useDelimiter("\\t");
		System.out.println("Enter your text: ");
		while(true)
		{
			str = sc.next();
			break;
		}
		sc.close();
		for(int i = 0; i < str.length(); i++)
		{
			c = str.charAt(i);
			if(c == ' ' || c == '\n')
			{
				word_count ++;
			}
		}
		word_count ++;
		String words[] = new String[word_count];
		int k = word_count - 1;
		for(int i = 0; i < str.length(); i++)
		{
			c = str.charAt(i);
			if(c != ' ' && c != '\n' && c != '.' && c != '\'' && c != ',' && c != ';' && c != ':')
			{
				word += c;
			}
			else if(c == ' ' || c =='\n' || c == '|')
			{
				words[k] = word;
				word = "";
				k--;
			}
			words[0] = word;

		}
		String res = String.join(" ", words);
		res = res.replaceAll("\r", "");
		res += '.';
		System.out.println("Required output: ");
		System.out.print(res);
		
	}

}
