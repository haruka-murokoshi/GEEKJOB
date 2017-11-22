
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class User extends Human{

        @Override
    //mycardsの合計値
    public int open() {
        int all = 0;
        for (int i = 0; i <= myCards.size();i++) {
            
            all = all + myCards.get(i);
        }
        return all;
    }


    @Override
    //21以上かの判定
    boolean checkSum() {
        if (open()< 21) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    //ArrayListの数値をMyCardに入れる
    public void setCard(ArrayList<Integer> set) {
        for (int i = 0; i < set.size(); i++) {
            myCards.add(set.get(i));

        }
    }
}

    
     
    

