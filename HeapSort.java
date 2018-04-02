package algorithmpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class HeapManager {
    
    public List<String> heapArray = new ArrayList<String>();
    public List<String> resultArray = new ArrayList<String>();
    
    public String executeHeapSort(String target) {
        
        List<String> targetArray = new ArrayList<String>(Arrays.asList(target.split("")));
        insert(targetArray);
        extract_min();
        return toString();
    }
    
    public void insert(List<String> targetArray) {
        for (String s : targetArray) {
            heapArray.add(s);
            int added_index = heapArray.size() - 1;
            bubble_up(added_index);
        }
    }
    
    public void extract_min() {
        
        while (heapArray.size() > 0) {
            
            int size = heapArray.size();
            resultArray.add(heapArray.get(0));
            // 単に先頭の要素を削除するだけでは全ての要素のインデックスが一つずつずれてしまうため、
            // 先頭と最後尾を入れ替えてから削除を行う
            swapHeapValue(0, size - 1);
            heapArray.remove(size - 1);
            bubble_down(0);
            
        }
        
    }
    
    public void bubble_up(int index) {
       
        while (index > 0) {
            
            int parent_index = Math.floorDiv(index + 1, 2) - 1;
            
            if (hasSmallerValue(index, parent_index)) {
                swapHeapValue(index, parent_index);
                index = parent_index;
            }
                
            else return;
        
        }
        
    }
    
    public void bubble_down(int index) {
        
        while (true) {
            int left_child_index = index * 2 + 1;
            int right_child_index = left_child_index + 1;
            int min_child_index;
            
            if (left_child_index > heapArray.size() - 1) {
                break;
            }
            else if (right_child_index > heapArray.size() - 1) {
                min_child_index = left_child_index;
            }            
            else {
                if (hasSmallerValue(left_child_index, right_child_index)) {
                    min_child_index = left_child_index;
                }
                else min_child_index = right_child_index;
            }
            
            if (hasSmallerValue(min_child_index, index)) {
                swapHeapValue(min_child_index, index);
                index = min_child_index;
            }
            else break;
            
        }
        
    }
    
    public boolean hasSmallerValue(int i, int j) {
        if (heapArray.get(i).compareToIgnoreCase(heapArray.get(j)) < 0) {
            return true;
        }

        return false;
    }
    
    public void swapHeapValue(int i, int j) {
        String temp = heapArray.get(i);
        heapArray.set(i, heapArray.get(j));
        heapArray.set(j, temp);
    }
    
    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        for (String str: resultArray) {
            buf.append(str);
        }
        return buf.toString();
    }
    
}

public class HeapSort {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        String target = stdIn.next();
        stdIn.close();
        
        HeapManager heap = new HeapManager();
        System.out.println(heap.executeHeapSort(target));
        
    }
    
}