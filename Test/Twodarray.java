import java.util.*;
class Twodarray
{
    public static void main(String args[])
    {
        int[][] a = new int[3][3];
int count = 0;
for (int row = 0; row < a.length; row++) {
    for (int col = 0; col < a[row].length; col++) {
        a[row][col] = count;
        count++;
    }
}
for (int row = 0; row < a.length; row++) {
    for (int col = 0; col < a[row].length; col++) {
        System.out.println(Arrays.toString(a));
    }
    
}

}
}