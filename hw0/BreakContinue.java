public class BreakContinue {
    public static void windowPosSum(int[] a, int n)
    {
        /** your code here */
        //first loop is control the index
        for(int index = 0; index < a.length;index++)
        {
            //control the value is positive
            if (a[index]>= 0)
            {
                //second loop is control the sum
                for(int i = 1;i <= n;i++)
                {
                    //control the range
                    if(index+i <= a.length-1)
                        a[index] = a[index] + a[(index+i)];
                    else
                        break;
                }
            }
            else
            {
                continue;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}
