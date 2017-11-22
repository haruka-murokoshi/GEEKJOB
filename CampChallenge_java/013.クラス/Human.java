
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
abstract class Human {
     //抽象クラス
          //合計値計算    
          abstract public int open();
          
          //自分の手札としてセット
          abstract public void setCard( ArrayList<Integer> set);
          
          //自分の手札と21を比べて判定
          abstract boolean checkSum();
          
          //自分の手札管理
          ArrayList<Integer> myCards=new ArrayList<Integer>();   
     
}
