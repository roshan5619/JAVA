class MinMax 
{
    static void MinMax(int arr[])
    {
        int min =arr[0];
        int max =arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("Minimum number="+min);
        System.out.println("Maximum number="+max);
    }

public static void main(String[] args)
    {
        int a[]={16,26,37,48,59};
        MinMax(a);
    } 
}

