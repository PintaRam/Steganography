import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter the string of peery vidhya ");
        String str= scn.nextLine();
        str = str.toLowerCase();
        char[] ch  = str.toCharArray();
        System.out.println("Enter the character 0 ");
        char ch1=scn.next().charAt(0);
        System.out.println("Enter the character 1 ");
        char ch2 = scn.next().charAt(0);
        System.out.println(ch);
        for(int i = 0;i<ch.length;i++)
        {
            if(ch[i] == ch2)
            {
                ch[i] = ch1;
            }
            else if(ch[i] == ch1)
            {
                ch[i] = ch2;
            }
        }
        System.out.println(ch);
        scn.close();

    }
   
}
