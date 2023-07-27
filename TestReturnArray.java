public class TestReturnArray
 {
    static int[] get()
    {
        return new int[]{20,40,60,80,100};

    }
    public static void main(String args[])
    {
        int arr[]=get();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
