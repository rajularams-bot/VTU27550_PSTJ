import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Reading the lines
        for (int i = 0; i < n; i++) {
            int size = sc.nextInt();

            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < size; j++) {
                row.add(sc.nextInt());
            }

            list.add(row);
        }

        int queries = sc.nextInt();

        // Processing queries
        while (queries-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            try {
                System.out.println(list.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}
