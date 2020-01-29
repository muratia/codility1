/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codilitytask1;

/**
 *
 * @author ahmet
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String names = "Ahmet Murati; Ahmet Naman Murati; Prarim Hoxha; Prarim Artan Hoxha; Ahmet Sadik Murati; Ahmet Hoxha-Murati";

        String domain = "Example";
        Solution solution = new Solution();
        String list = solution.solution(names, domain.toLowerCase());
         
        System.out.println(  list);
    }
    
}
