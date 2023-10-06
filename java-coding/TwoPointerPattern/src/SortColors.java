import java.util.*;

public class SortColors {
    public static int[] sortColors (int[] colors) {

        // Replace this placeholder return statement with your code
        int red = 0;
        int white = 0;
        int blue = colors.length - 1;

        while (white<=blue){
            if (colors[white] == 0){
                colors[white] = colors[red];
                colors[red] = 0;
                white++;
                red++;
            }
            else if (colors[white] == 1){
                white++;
            }
            else{
                colors[white] = colors[blue];
                colors[blue] = 2;
                blue--;
            }
        }


        return colors;
    }
}