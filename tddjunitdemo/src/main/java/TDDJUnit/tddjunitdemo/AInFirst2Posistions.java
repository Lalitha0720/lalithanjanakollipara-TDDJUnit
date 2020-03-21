package TDDJUnit.tddjunitdemo;
public class AInFirst2Posistions 
{
	public String check(String string) 
	{
		String res = "";
		char ch[] = string.toCharArray();
		for(int i=0;i<string.length();i++)
		{
			if(i==0 || i==1)
			{
				if(ch[i]!='A')
				{
					res = res + ch[i];
				}
			}
			else
			{
				res = res + ch[i];
			}
		}
		return res;
	}
}
