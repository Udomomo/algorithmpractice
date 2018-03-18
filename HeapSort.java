package algorithmpractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class HeapManager {
    
    List<String> targetArray;
    List<String> heapArray;
    
    public HeapManager(String str) {
        targetArray = new ArrayList<String>(Arrays.asList(str.split("")));
        heapArray = new ArrayList<String>();
    }
    
    public void heap_insert(String s) {
        targetArray.add(s);
        int added_index = targetArray.size() - 1;
        bubble_up(added_index);
    }
    
    public void bubble_up(int index) {
        int parent_index = Math.floorDiv(index + 1, 2) - 1;
        if (parent_index > 0) {
            
        }
    }
    
    
    public boolean isSmaller(int i, int j) {
        
    }
    
}

public class HeapSort {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        String target = stdIn.next();
        stdIn.close();
        
        HeapManager heap = new HeapManager(target);
        
        
    }
    
}