package sorting;

import java.util.ArrayList;
import java.util.List;

public class BucketSort {
	
	
	public static void main(String[] args) {
		Integer[] arr={44,45,58,55,73,71,23,25,26,33,35,37,67,68};
		sort(arr);
		System.out.println(arr);
	}
    private static final int DEFAULT_BUCKET_SIZE = 5;

    public static void sort(Integer[] array) {
        sort(array, DEFAULT_BUCKET_SIZE);
    }

    public static void sort(Integer[] array, int bucketSize) {
        if (array.length == 0) {
            return;
        }

        // Determine minimum and maximum values
        Integer minValue = array[0];
        Integer maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            } else if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        // Initialise buckets
        int bucketCount = (maxValue - minValue) / bucketSize + 1;
        List<List<Integer>> buckets = new ArrayList<List<Integer>>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<Integer>());
        }

        // Distribute input array values into buckets
        for (int i = 0; i < array.length; i++) {
            buckets.get((array[i] - minValue) / bucketSize).add(array[i]);
        }

        // Sort buckets and place back into input array
        int currentIndex = 0;
        for (int i = 0; i < buckets.size(); i++) {
            Integer[] bucketArray = new Integer[buckets.get(i).size()];
            bucketArray = buckets.get(i).toArray(bucketArray);
            // change Integer[] to int []
            int [] intBucketArr = new int[bucketArray.length];
            int cnt=0;
            for(Integer val : bucketArray){
            	intBucketArr[cnt]=val;
            	cnt++;
            }
            
            InsertionSort.insertionSort(intBucketArr);
            
            // change int [] to Integer[]
            
            for(int x=0;x<intBucketArr.length;x++){
            	bucketArray[x]=intBucketArr[x];
            }
            
            for (int j = 0; j < bucketArray.length; j++) {
                array[currentIndex++] = bucketArray[j];
            }
        }
    }
}
