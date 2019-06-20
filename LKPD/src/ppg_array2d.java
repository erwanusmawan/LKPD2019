/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CodeX212
 */
public class ppg_array2d {
    public static void main(String[] args){
        String kontak[][]={{"erwan","085710933252"},
                           {"tari","085719930745"},
                           {"qaireenu","0895704280954"}};
        int i;
        for(i=0;i<kontak.length ;i++){
            System.out.println("Nama anda     = " + kontak[i][0]);
            System.out.println("Nomer HP anda = " + kontak[i][1]);
            System.out.println("-------------------------------");
        }
    }    
}
