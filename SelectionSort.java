package algorithmpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * 入力した英単語の文字を辞書順に並べ替える
 */
public class SelectionSort {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        String target = stdIn.next();
        List<String> targetarray= new ArrayList<String>(Arrays.asList(target.split(""))); 
        stdIn.close();
        
        int min;
        String tmp;
        
        for (int i=0; i<targetarray.size(); i++) {
            min = i;
            for (int j=i+1; j<targetarray.size(); j++) {
                if (targetarray.get(j).compareToIgnoreCase(targetarray.get(min)) < 0) {
                    min = j;
                }
            }
            tmp = targetarray.get(i);
            targetarray.set(i, targetarray.get(min));
            targetarray.set(min, tmp);
        }
        
        StringBuilder sb = new StringBuilder();
        for (String s : targetarray) {
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
    
}
