
import java.util.Scanner;
public class GenerateBinaryWithoutConsecutive1 {
    public static String toString(char[] ch){
        String s=new String(ch);
        return s;

    }

    private static void generate(char[] ch,int n,int k){
        if(k==n){
            System.out.println(toString(ch));
            return;
        }
        if(ch[k-1]=='0'){
            ch[k]='0';
            generate(ch,n,k+1);

            ch[k]='1';
            generate(ch,n,k+1);
        }

        if(ch[k-1]=='1'){
            ch[k]='0';
            generate(ch,n,k+1);
        }
    }
    private static void fun(int n){
        if(n<=0){
            System.out.println("No strings with length 0 or less");
            return;
        }
        char[] ch=new char[n];
        ch[0]='0';
        generate(ch,n,1);
        ch[0]='1';
        generate(ch,n,1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        sc.close();
        fun(k);
    }
    
}
