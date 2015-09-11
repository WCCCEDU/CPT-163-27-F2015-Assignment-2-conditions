
 */
package inclass9915;
import java.util.Scanner;
/**
 *
 * @author Zachary
 */
public class Inclass9915 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        String word = chosenWord();
        int sum = 0;
        for (int i =0; i < word.length(); i++){
          int letter = word.charAt(i);
          sum += letter;
          //sum=sum+letter
          hello();
        }
            print(sum+"");
        }
      
    public static void hello(){
        System.out.println("hello");
    }
    
    
    public static String chosenWord(){
        String another = "anotherString";
        return another + "Thing";
    }
    
    public static void print(String str){                    //replace print
        System.out.println(str);
    }
}
