package algorithmpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class HeapManager {
    
    List<String> heapArray = new ArrayList<String>();
    
    public void insert(List<String> targetArray) {
        for (String s : targetArray) {
            heapArray.add(s);
            int added_index = heapArray.size() - 1;
            bubble_up(added_index);
        }
    }
    
    public void bubble_up(int index) {
        while (index > 0) {
            int parent_index = Math.floorDiv(index + 1, 2) - 1;
            if (heapArray.get(index).compareToIgnoreCase(heapArray.get(parent_index)) < 0) {
                swapValue(index, parent_index);
                index = parent_index;
            }
            else return;
        }
    }
    
    public void swapValue(int i, int j) {
        String temp = heapArray.get(i);
        heapArray.set(i, heapArray.get(j));
        heapArray.set(j, temp);
    }
    
    @Override
    public String toString() {
        return heapArray.toString();
    }
    
}

public class HeapSort {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        String target = stdIn.next();
        stdIn.close();
        
        List<String> targetArray = new ArrayList<String>(Arrays.asList(target.split("")));
        
        HeapManager heap = new HeapManager();
        heap.insert(targetArray);
        System.out.println(heap.toString());
        
    }
    
}