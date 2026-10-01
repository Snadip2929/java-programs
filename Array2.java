public class Array2 {
    public static void main (String []S)
    {
        int [] a=new int [5];
         a [2]=29;
        System.out.println(a);
        for(int k=0;k<5;k++)
        {
            System.out.println(a[k]);
        }
        for(int k :a){
            System.out.println(a[k]);
        }
    }
}
