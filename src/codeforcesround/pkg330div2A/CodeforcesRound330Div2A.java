/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeforcesround.pkg330div2A;

import java.util.*;

/**
 *
 * @author mazenbadr
 */
public class CodeforcesRound330Div2A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][]flats = new int[n*m][2];
        for(int i = 0;i<n*m;i++){
            for(int j = 0;j<2;j++){
                flats[i][j] = in.nextInt();
            }
        }
        int counter = 0;
        for(int i = 0;i<flats.length;i++){
            if(flats[i][0] == 1 || flats[i][1] == 1){
                counter ++;
            }
        }
        System.out.println(counter);
        
    }
    
    
    
}
