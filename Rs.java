import java.util.Scanner;
class Add{

    public static int Ks (int No1,int No2){

        return ( No1+No1);

    }

}
public class Rs {
    public static void main(String[] S) {
        int a=0,b=0,Ans=0;
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter NO1");
        a=Sobj.nextInt();

        System.out.println("Enter No2");
        b=Sobj.nextInt();

        Ans=Add.Ks(a,b);

        System.out.println("Addtion is "+Ans);
         
        
    }
}
