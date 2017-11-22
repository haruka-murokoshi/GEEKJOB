
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Dealer extends Human {

    //ArrayListに1－13*4まで入れる。
    //エース＝1　11.12.13は10とみなす。
    ArrayList<Integer> Cards = new ArrayList<Integer>();

    public Dealer() {
        for (int n = 1; n <= 4; n++) {
            for (int i = 1; i <= 13; i++) {
                if (i > 10) {
                    Cards.add(10);
                } else {
                    Cards.add(i);
                }
            }
        }
    }

    public ArrayList<Integer> Deal() {
        ArrayList<Integer> Dealcards = new ArrayList<Integer>();

        for (int i = 1; i <= 2; i++) {
            Random rand = new Random();
            Integer index = rand.nextInt(Cards.size());
            Dealcards.add( Cards.get(index));
            Cards.remove( Cards.get(index));
        }
        return Dealcards;
    }

    public ArrayList<Integer> Hit() {
        ArrayList<Integer> Hitcards = new ArrayList<Integer>();
        Random rand = new Random();
        Integer index = rand.nextInt(Cards.size());
        Hitcards.add(Cards.get(index));
        Cards.remove(index);

        return Hitcards;
    }

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
    //20以上かの判定
    boolean checkSum() {
        if (open()< 20) {
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
