import java.util.ArrayList;

public class ReverseArray {
    public static void reverseArray(ArrayList<Integer> ar) {
        int left = 0;
        int right = ar.size() - 1;

        while (left < right) {
            Integer temp = ar.get(left);
            ar.set(left, ar.get(right));
            ar.set(right, temp);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        reverseArray(ar);
        System.out.println(ar);
    }
}

