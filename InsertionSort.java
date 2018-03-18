package algorithmpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * 入力した英単語の文字を辞書順に並べ替える
 */
public class InsertionSort {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        String target = stdIn.next();
        List<String> targetarray= new ArrayList<String>(Arrays.asList(target.split(""))); 
        stdIn.close();
        
        String tmp;
        
        for (int i=1; i<targetarray.size(); i++) {
            int j = i;
            while (j>0 && (targetarray.get(j).compareToIgnoreCase(targetarray.get(j-1))<0)) {
                tmp = targetarray.get(j-1);
                targetarray.set(j-1, targetarray.get(j));
                targetarray.set(j, tmp);
                j = j -1;
            }
        }
    
        StringBuilder sb = new StringBuilder();
        for (String s : targetarray) {
            sb.append(s);
        }
        System.out.println(sb.toString());
    }

}
