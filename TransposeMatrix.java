public class TransposeMatrix 
{
    public static void main(String args[])
    {
        int [][]matrix={{2,3,4},{4,5,6}};
        for(int[] row:matrix)
        {
            System.out.println(row+" ");    //Adress print Avuthundhi
        }
        System.out.println("The Matrix is:");   
            for(int[] row:matrix)
            {
                for(int column:row)
                {
                    System.out.print(column+" ");
                }
                System.out.println();
            }
       
    }
}
