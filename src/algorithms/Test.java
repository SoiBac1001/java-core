package algorithms;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] inputArray1 = new int[]{11, 5, 3, 12, 6, 8, 1, 7, 4};
        int[] inputArray2 = new int[]{10, 14, 12, 1000, 11, 15, 13, 1};
        int[] inputArray3 = new int[]{4, 5, 7, 10, 10, 12, 12, 12};
        int[] inputArray4 = new int[]{5, 10, 10, 5, 5};
        int[] inputArray5 = new int[]{6, 7, 8, 9, 12, 12, 12};
        int[] inputArray6 = new int[]{10, 14, 12, 999, 1000, 11, 15, 13, 1};
        int[] inputArray7 = new int[]{10, 14, 12, 999, 1000, 11, 15, 13};
        int[] inputArray8 = new int[]{10, 14, 12, 16, 11, 15, 13};
        int[] inputArray9 = new int[]{14, 12, 16, 11, 15, 13};
        int[] inputArray10 = new int[]{6, 7, 8, 11, 15};
        
        System.out.println("The maximum of these differences as small as possible: " + splitArray(inputArray1));
        System.out.println("The maximum of these differences as small as possible: " + splitArray(inputArray2));
        System.out.println("The maximum of these differences as small as possible: " + splitArray(inputArray3));
        System.out.println("The maximum of these differences as small as possible: " + splitArray(inputArray4));
        System.out.println("The maximum of these differences as small as possible: " + splitArray(inputArray5));
        System.out.println("The maximum of these differences as small as possible: " + splitArray(inputArray6));
        System.out.println("The maximum of these differences as small as possible: " + splitArray(inputArray7));
        System.out.println("The maximum of these differences as small as possible: " + splitArray(inputArray8));
        System.out.println("The maximum of these differences as small as possible: " + splitArray(inputArray9));
        System.out.println("The maximum of these differences as small as possible: " + splitArray(inputArray10));

        /*// Given array arr[]
        int arr[] = {11,5,3,12,6,8,1,7,4};
//        int arr[] = {4,5,7,10,10,12,12,12};

        int N = arr.length;

        // Given K
        int K = 3;

        // Function Call
        System.out.print(find(arr, N, K) + "\n");*/
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

    private static int splitArray(int[] inputArray) {
        int[] newInputArray = Arrays.stream(inputArray).distinct().toArray();
        if(newInputArray.length < 3) {
            return 0;
        }
        Arrays.sort(newInputArray);
        int lengthOfInputArray = newInputArray.length;
        int maxSizeEachGroup = lengthOfInputArray - 2;
        List<Integer> g1 = new ArrayList<>();
        List<Integer> g2 = initG2(newInputArray);
        List<Integer> expectedG2 = new ArrayList<>(g2);
        List<Integer> g3 = new ArrayList<>();

        g1.add(newInputArray[0]);
        List<Integer> expectedG1 = new ArrayList<>(g1);
        int maxDiff1 = 0;
        int maxDiff2 = newInputArray[maxSizeEachGroup] - newInputArray[1];
        int maxIndexOfInput = lengthOfInputArray - 1;
        g3.add(newInputArray[maxIndexOfInput]);
        List<Integer> expectedG3 = new ArrayList<>(g3);
        int maxDiff3 = 0;
        int smallestMaxDiff = findMax(maxDiff1 , maxDiff2, maxDiff3);
        int newSmallMaxDiff;

        // array giữa (G2): san đều 2 bên
        int halfSize = lengthOfInputArray % 2 == 0 ? lengthOfInputArray / 2 : (lengthOfInputArray / 2) + 1;
        for(int i = 1; i < halfSize; i++) {
            int elementForG2 = newInputArray[i];
            g1.add(elementForG2);
            g2.remove(Integer.valueOf(elementForG2));

            int elementForG3 = newInputArray[maxIndexOfInput - i];
            g3.add(elementForG3);
            g2.remove(Integer.valueOf(elementForG3));

            if(g2.size() <= 0) {
                break;
            }
            maxDiff1 = diffMinMax(g1);
            maxDiff2 = diffMinMax(g2);
            maxDiff3 = diffMaxMin(g3);
            newSmallMaxDiff = findMax(maxDiff1, maxDiff2, maxDiff3);
            if(newSmallMaxDiff <= smallestMaxDiff) {
                smallestMaxDiff = newSmallMaxDiff;
                expectedG1 = new ArrayList<>(g1);
                expectedG2 = new ArrayList<>(g2);
                expectedG3 = new ArrayList<>(g3);
            } else {
                maxDiff1 = diffMinMax(expectedG1);
                maxDiff2 = diffMinMax(expectedG2);
                maxDiff3 = diffMaxMin(expectedG3);
                break;
            }
            if(g2.size() <= 1) {
                break;
            }
        }

        // array đầu (G1): san phải
        if(smallestMaxDiff == maxDiff1) {
            if(expectedG1.size() == 1) {
                return smallestMaxDiff;
            }
            Integer forwardElement = expectedG1.get(expectedG1.size() - 1);
            Integer maxNumberOfG2 = expectedG2.get(expectedG2.size() - 1);
            expectedG2.add(forwardElement);
            expectedG1.remove(forwardElement);
            maxDiff1 = diffMinMax(expectedG1);
            maxDiff2 = maxNumberOfG2 - forwardElement;
            newSmallMaxDiff = findMax(maxDiff1, maxDiff2, maxDiff3);
            if(newSmallMaxDiff < smallestMaxDiff) {
                smallestMaxDiff = newSmallMaxDiff;
                List<Integer> cloneG2 = new ArrayList<>(expectedG2);
                Collections.sort(cloneG2);
                List<Integer> cloneG3 = new ArrayList<>(expectedG3);
                int newSmallMaxDiffL2;
                int max1 = diffMinMax(expectedG1);

                // array giữa (G2): san phải
                do {
                    forwardElement = cloneG2.get(cloneG2.size() - 1);
                    cloneG3.add(forwardElement);
                    cloneG2.remove(forwardElement);
                    maxDiff2 = diffMinMax(cloneG2);
                    maxDiff3 = diffMaxMin(cloneG3);
                    newSmallMaxDiffL2 = findMax(max1, maxDiff2, maxDiff3);
                    if(newSmallMaxDiffL2 < smallestMaxDiff) {
                        smallestMaxDiff = newSmallMaxDiffL2;
                    } else {
                        break;
                    }
                } while (true);
            }
        } else if (smallestMaxDiff == maxDiff2) {
            if(expectedG2.size() <= 1) {
                return smallestMaxDiff;
            }
            List<Integer> cloneG1 = new ArrayList<>(expectedG1);
            List<Integer> cloneG2 = new ArrayList<>(expectedG2);
            int newSmallMaxDiffL1;
            int max3 = diffMaxMin(expectedG3);

            // array giữa (G2): san trái
            do {
                Integer forwardElement = cloneG2.get(0);
                cloneG1.add(forwardElement);
                cloneG2.remove(forwardElement);
                maxDiff1 = diffMinMax(cloneG1);
                maxDiff2 = diffMinMax(cloneG2);
                newSmallMaxDiffL1 = findMax(maxDiff1, maxDiff2, max3);
                if(newSmallMaxDiffL1 < smallestMaxDiff) {
                    smallestMaxDiff = newSmallMaxDiffL1;
                } else {
                    break;
                }

                if(cloneG2.size() <= 1) {
                    break;
                }
            } while (true);

            cloneG2 = new ArrayList<>(expectedG2);
            List<Integer> cloneG3 = new ArrayList<>(expectedG3);
            int newSmallMaxDiffL2;
            int max1 = diffMinMax(expectedG1);

            // array giữa (G2): san phải
            do {
                Integer forwardElement = cloneG2.get(cloneG2.size() - 1);
                cloneG3.add(forwardElement);
                cloneG2.remove(forwardElement);
                maxDiff2 = diffMinMax(cloneG2);
                maxDiff3 = diffMaxMin(cloneG3);
                newSmallMaxDiffL2 = findMax(max1, maxDiff2, maxDiff3);
                if(newSmallMaxDiffL2 < smallestMaxDiff) {
                    smallestMaxDiff = newSmallMaxDiffL2;
                } else {
                    break;
                }

                if(cloneG2.size() <= 1) {
                    break;
                }
            } while (true);

            return smallestMaxDiff;

        } else {
            // array cuối (G3): san trái
            if(expectedG3.size() == 1) {
                return smallestMaxDiff;
            }
            Integer forwardElement = expectedG3.get(expectedG3.size() - 1);
            expectedG2.add(forwardElement);
            expectedG3.remove(forwardElement);
            maxDiff2 = diffMinMax(expectedG2);
            maxDiff3 = diffMaxMin(expectedG3);
            newSmallMaxDiff = findMax(maxDiff1, maxDiff2, maxDiff3);
            if(newSmallMaxDiff < smallestMaxDiff) {
                smallestMaxDiff = newSmallMaxDiff;

                List<Integer> cloneG1 = new ArrayList<>(expectedG1);
                List<Integer> cloneG2 = new ArrayList<>(expectedG2);
                int newSmallMaxDiffL1;
                int max3 = diffMaxMin(expectedG3);

                // array giữa (G2): san trái
                do {
                    forwardElement = cloneG2.get(0);
                    cloneG1.add(forwardElement);
                    cloneG2.remove(forwardElement);

                    maxDiff1 = diffMinMax(cloneG1);
                    maxDiff2 = diffMinMax(cloneG2);
                    newSmallMaxDiffL1 = findMax(maxDiff1, maxDiff2, max3);
                    if(newSmallMaxDiffL1 < smallestMaxDiff) {
                        smallestMaxDiff = newSmallMaxDiffL1;
                    } else {
                        break;
                    }
                    if(cloneG2.size() <= 1) {
                        break;
                    }
                } while (true);
            }
        }

        return smallestMaxDiff;
    }

    private static List<Integer> initG2(int[] inputArray) {
        List<Integer> g2 = new ArrayList<>();
        for(int i = 1; i < inputArray.length - 1; i++) {
            g2.add(inputArray[i]);
        }

        return g2;
    }
    
    private static int diffMinMax(List<Integer> inputArray) {
        return inputArray.get(inputArray.size() - 1) - inputArray.get(0);
    }

    private static int diffMaxMin(List<Integer> inputArray) {
        return inputArray.get(0) - inputArray.get(inputArray.size() - 1);
    }
    
    private static int findMax(int max1, int max2, int max3) {
        int max = max1;
        if(max2 > max) {
            max = max2;
        }
        
        if(max3 > max) {
            max = max3;
        }
        
        return max;
    }

    private static int findMin(int max1, int max2, int max3) {
        int min = max1;
        if(max2 < min) {
            min = max2;
        }

        if(max3 < min) {
            min = max3;
        }

        return min;
    }
}
