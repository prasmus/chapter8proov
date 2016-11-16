/**
 * Created by opilane on 16.11.2016.
 */
public class chapter8proov {
    public static void main(String[] args) {
       /*
        massiiv1 = {10, 100, 1000, 10000, 100000, 1000000};
        int[] massiiv = new int[6];
        int = massiiv 1[3]*5;

        int[] massiiv2 = {10, 100, 1000, 10000, 100000, 1000000}; int asemel võib ka double ja string olla

        for(int i = 0; i < massiiv1.length; i++) {
        massiiv1[i] = massiiv2[i];
        */

        /*int size = 6;
        int [] massiiv1 = new int[size];
        massiiv1[0] = 10;
        massiiv1[1] = 100;
        massiiv1[2] = 1000;
        massiiv1[3] = 10000;
        massiiv1[4] = 100000;
        massiiv1[5] = 1000000;
        for(int i = 0; i < size; i++) {
            System.out.println(massiiv1[i]);
        */

        /*
        int m = 0;
        int size = 6;
        int [] massiiv1 = new int[size];
        massiiv1[0] = 10;
        massiiv1[1] = 100;
        massiiv1[2] = 1000;
        massiiv1[3] = 10000;
        massiiv1[4] = 100000;
        massiiv1[5] = 1000000;
        for(int n : massiiv1) { //for each tüüpi loop
            m = n/10;
            System.out.println(m);

        }
        */

        int target = 10000;
        int size = 6;
        int[] massiiv1 = new int[size];
        massiiv1[0] = 10;
        massiiv1[1] = 100;
        massiiv1[2] = 1000;
        massiiv1[3] = 10000;
        massiiv1[4] = 100000;
        massiiv1[5] = 1000000;
        int ans = search(massiiv1, 10000);
        search(massiiv1, target);
        System.out.println(ans);
    }

    public static int search(int[] massiiv1, int target) {
        for (int i = 0; i < massiiv1.length; i++) {
            if (massiiv1[i] == target) {
                return i;
            }
            } System.out.println("Sorry, ei leidnud");
            return -1;
            }
        }


