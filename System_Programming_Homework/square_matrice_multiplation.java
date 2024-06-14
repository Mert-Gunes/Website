package System_Programming_Homework;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author mert1
 */

public class square_matrice_multiplation {
     /**
     *
     * @param args
     */
    public static void main(String[] args) throws IOException { 
        System.out.print("Please Use Matrice.txt file to enter your matrice parameters. if you do so:\n" );
        System.out.print("Please Choose your square matrice's dimensions with 'axa' format.\n" );
        
        Scanner input = new Scanner(System.in);
        String together;
        char x,y;
        together = input.next();
        char[] charArray = together.toCharArray();
        x = charArray[0];
        y = charArray[2];

        boolean matrice_shape = true;
        while (matrice_shape == true) { 
        if (x==y) { 
            matrice_shape = false;
        } else {
            System.out.print("Invalid Square Matrice. Please Choose your square matrice's dimensions with 'axa' format.\n" );
        together = input.next();
        x = charArray[0];
        y = charArray[2];
        }
        File file = new File("C:\\Users\\mert1\\Codes\\System_Programming_Homework\\matrice.txt");
        List<String> content = Files.readAllLines(Paths.get("matrice.txt"), StandardCharsets.UTF_8);
        System.out.print(content);
        
    }

    class threads implements Runnable{  
        public void run(){  
        System.out.print("thread is running..." );
        } 
    }

    threads m1=new threads();  
    

    int spread = Integer.parseInt(String.valueOf(x));
    int location = 0;
    for (; spread>0 ; spread--) {
        Thread thread =new Thread(m1);
        
        thread.run();  
    }




}
}
