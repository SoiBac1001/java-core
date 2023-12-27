package algorithms;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        // Given array arr[]
        int arr[] = {11,5,3,12,6,8,1,7,4};
//        int arr[] = {4,5,7,10,10,12,12,12};

        int N = arr.length;

        // Given K
        int K = 3;

        // Function Call
        System.out.print(find(arr, N, K) + "\n");
        Map<Integer, Integer> monthHas5Sunday = getMonthHas5Sunday();
        System.out.println("monthHas5Sunday: " + monthHas5Sunday);
    }

    private static Map<Integer, Integer> getMonthHas5Sunday() {
        Map<Integer, Integer> result = new HashMap<>();
        LocalDate firstDay = LocalDate.parse("2023-01-01");
        for(int i = 0; i < 365; i++) {
            LocalDate currentDay = firstDay.plusDays(i);
            if(isSunday(currentDay)) {
                int monthValue = currentDay.getMonthValue();
                Integer value = result.computeIfPresent(monthValue, (key, val) -> val + 1);
                if(value == null) {
                    int prevMonth = monthValue - 1;
                    Integer prevValue = result.get(prevMonth);
                    if(prevValue != null && prevValue < 5) {
                        result.remove(prevMonth);
                    }
                }
                result.putIfAbsent(monthValue, 1);
            }
        }
        Integer value = result.get(12);
        if(value != null && value < 5) {
            result.remove(12);
        }

        return result;
    }

    private static boolean isSunday(LocalDate date) {
        DayOfWeek dayOfWeek = DayOfWeek.of(date.get(ChronoField.DAY_OF_WEEK));

        return DayOfWeek.SUNDAY.equals(dayOfWeek);
    }

    private static int find(int[] n) {
        return 0;
    }

    static int find(int a[], int n, int k)
    {
        Vector<Integer> v = new Vector<Integer>();
        Arrays.sort(a);

        // Add the difference to vectors
        for(int i = 1; i < n; ++i)
        {
            v.add(a[i - 1] - a[i]);
        }

        // Sort vector to find minimum k
        Collections.sort(v);

        // Initialize result
        int res = a[n - 1] - a[0];

        // Adding first k-1 values
        for(int i = 0; i < k - 1; ++i)
        {
            res += v.get(i);
        }

        // Return the minimized sum
        return res;
    }

    // Function to find  minimum sum of
    // difference between the maximum
    // and the minimum element of each subarray
    static int minimumSum(int arr[], int n, int k)
    {
        // Calculate the difference
        // between the adjacent elements
        // and store it in diff array
        int[] diff = new int[n - 1];

        for (int i = 0; i < n - 1; i++)
            diff[i] = (arr[i] - arr[i + 1]);

        Arrays.sort(diff);

        int sum = arr[n - 1] - arr[0];

        for (int i = 0; i < k - 1; i++)
            sum += diff[i];

        // Return the required sum
        return sum;
    }
}
