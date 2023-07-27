public class PalindromeCheck {
    public static void main(String[] args)
    {
        int n=1441;
        int rem=0,rev=0,temp=n;
        while(temp!=0)
        {
            rem=temp%10;
            rev=(rev*10)+rem;
            temp=temp/10;
        }
        System.out.println("Reverse : "+rev);
        String result=(n==rev)?"Yes" : "No";
        System.out.print(result);
    }
}
