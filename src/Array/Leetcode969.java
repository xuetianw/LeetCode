package Array;

import java.util.ArrayList;
import java.util.List;

public class Leetcode969 {
    public List<Integer> pancakeSort(int[] A) {
        List<Integer> ret = new ArrayList<>();
        int curLength = A.length;
        while(curLength > 1){
            if(isSorted(A)){
                break;
            }
            int maxIndex = findMax(A, curLength);
            flipArr(A, maxIndex+1);
            ret.add(maxIndex+1);
            flipArr(A, curLength);
            ret.add(curLength);
            curLength--;
        }
        return ret;
    }

    public int findMax(int[] A, int lastIndex){
        int max = Integer.MIN_VALUE;
        int retIndex = -1;
        for(int i=0; i<lastIndex; i++){
            if(A[i] >= max){
                max = A[i];
                retIndex = i;
            }
        }
        return retIndex;
    }

    public void flipArr(int[] A, int k){
        int i = 0;
        int j = k-1;
        while(i < j){
            swap(A, i, j);
            i++;
            j--;
        }
    }

    public void swap(int[] A, int index1, int index2){
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
        return;
    }

    public boolean isSorted(int[] A){
        for(int i=0; i<A.length-1; i++){
            if(A[i] > A[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        Leetcode969 leetcode969 = new Leetcode969();
        leetcode969.pancakeSort(new int[] {4,3,2,1});
    }
}
