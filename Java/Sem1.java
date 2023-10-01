/**
* Program
*/
public class Sem1 
{
    public static void main(String[] args) 
    {
        System.out.println("Goodbye world");
        int[] arr = new int[] {1,1,1,0,0,0,1,1,0,0,0,1,1,1,1};
        int count=0, max_count=0;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i]==1)
            {
                count++;
            }
            else
            {
                if(max_count<count)
                {
                    max_count=count;
                }
                count=0;
            }                        
        }
        if(max_count<count)
        {
            max_count=count;
        }
        System.out.println(max_count);
    }
}