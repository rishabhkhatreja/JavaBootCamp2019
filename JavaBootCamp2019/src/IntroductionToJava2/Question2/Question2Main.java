
//WAP to sorting string without using string Methods?

package IntroductionToJava2.Question2;

public class Question2Main {
    public static void main(String[] args) {
        String string="rishabh is my name";
        char[] characters=new char[string.length()];
        for(int i=0;i<string.length();i++)
        {
            characters[i]=string.charAt(i);
        }
        for(int i=0;i<characters.length-1;i++)
        {
            if(!(characters[i]==' '))
            {
                for(int j=i+1;j<characters.length;j++)
                {
                    if(characters[j]==' ')
                    {
                        continue;
                    }
                    else if(characters[i]>characters[j])
                    {
                        char temp;
                        temp=characters[i];
                        characters[i]=characters[j];
                        characters[j]=temp;
                    }
                }
            }
        }
        for (int i=0;i<characters.length;i++)
        {
            System.out.print(characters[i]);
        }
    }

}
