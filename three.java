/**
 * Created by gobran on 08/02/2021.
 */
public class three {
    public static void main(String[] args) {
        int x[]={22,85,28,71,98};

        int position = 3;
        int i;
        for (i=position+1; i<x.length;i++){
            x[i-1]=x[i];
        }
        i--;
        System.out.println(x[3]);
        System.out.println(i);
    }
}