import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
* Program
*/
import java.util.Arrays;


public class Sem1_1 
{
    public static void main(String[] args) 
    {
        int[] arr = new int[] {3,3,2,2,3};
        int val=3;
        System.out.println(Arrays.toString(arr));
        // for (int i = 0; i < arr.length; i++) 
        // {
        //     System.out.print(arr[i] + " ");
        // }
        int start=0;
        int end=arr[arr.length-1];
        while(start<end)
        {
            if(arr[start]==val)
            {
                if(arr[end]!=val)
                {
                    arr[start]=arr[end];
                    arr[end]=val;
                }
                else { end--; }
            }
            else { start++; }
        }
        System.out.println(Arrays.toString(arr));
        // for (int i = 0; i < arr.length; i++) 
        // {
        //     System.out.print(arr[i] + " ");
        // }
        
    }
}