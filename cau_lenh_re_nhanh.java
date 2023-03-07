
import java.util.Arrays;
import java.util.Scanner;
import static javaapplication2.sapxepvatimkiem.mang;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class cau_lenh_re_nhanh {  
    public static void main(String[] args) {  
         int j, k;  
          
        // Labeling the outermost loop as outerMost     
        outerMost:  
        for(j=1; j<5; j++) {  
  
            // Labeling the innermost loop as innerMost  
            innerMost:  
            for(k=1; k<3; k++ ) {  
                System.out.println("j = " + j + " and k = " +k);  
               
                // Terminating the outemost loop   
                if ( j == 3)  
                    break outerMost;  
            }  
        }  
    Scanner sc = new Scanner(System.in);
    String input= sc.nextLine();
    int n= Integer.parseInt(input);
    if(n>9){
        System.out.println("xep loai gioi");
    } 
    else if (n>6){
        System.out.println("xep loai kha");
    }
    else{
        System.out.println("xep loai trung binh");
    }
    
    
//        int[] mang1= new int[]{1,3,5,6,1};
//        String mang = Arrays.toString(mang1);
       

}

    }
 