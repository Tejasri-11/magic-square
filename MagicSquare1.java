import java.util.*;
import javax.swing.*; 
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.*;
import java.awt.event.*; 

public class MagicSquare1 extends JFrame {

   
    JPanel q;
    JButton jt[];
    MagicSquare1(int n) {
    	
                int i,j;
                int[][] a=new int[n][n];
                for (i = 0; i < n; i++) {
                    for (j = 0; j < n; j++) {
                        a[i][j] = 0;
                    }
                }
		
                i = 0;
                j = n / 2;
                a[i][j] = 1;
                if (n % 2 == 0) {
                     System.out.print("enter an odd order matrix");
                     }
                     }
