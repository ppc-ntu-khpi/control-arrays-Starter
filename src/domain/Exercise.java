package domain;
/**
 * class with method Calculate which contain algorithm for task
 * @author Дом
 */
public class Exercise {
    public static int Calculate(){
    int[] a = {24,90,55,96};
    int max1 = a[0];
    int max2 = a[1];
    for (int i = 2; i < a.length; i++){
        if (a[i] > max2){
            max2 = a[i];
        }
        if (max2 > max1){
            int temp = max1;
            max1 = max2;
            max2 = temp;
        }
    }
     return max2;
    }
}
