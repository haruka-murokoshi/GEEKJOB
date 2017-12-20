/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;

import java.io.Serializable;
//🌸JavaBeansルール🌸
//java.io.Serializableを実装している
//クラスはpublicでパッケージに所属している 
//publicで引数のないコンストラクタを持つ 
//フィールドはカプセル化(private)されている。 
//getter/setterをもつ。
/**
 *
 * @author user
 */

//シリアライズ（データ変換し、ファイル保存やネットワーク送信できる）可能
public class UserDataBeans implements Serializable {
    
    //Publicで引数なしのコンストラクタ
    public UserDataBeans(){}
    
    //フィールドは隠匿されている(private) フィールド作成
    private String name ="";
    private String year ="";        
    private String month ="";
    private String day ="";
    private String type ="";
    private String tell ="";
    private String comment ="";
    
    //getter/setterをもつ。
    public String getName(){
          return this.name;
    }    
    public void setName(String n){
        this.name=n;
    }
    
    
    public String getYear(){
        return this.year;
    }
    public void setYear(String y){
        this.year=y;
    }
    
    public String getMonth(){
        return this.month;
    }
    public void setMonth(String m){
        this.month=m;
    }
    
    public String getDay(){
        return this.day;
    }
    public void setDay(String d){
        this.day=d;
    }
    
    public String getType(){
        return this.type;
    }
    public void setType(String t){
        this.type=t;
    }
    
    public String getTell(){
        return this.tell;
    }
    public void setTell(String te){
        this.tell=te;
    }
    
    public String getComment(){
        return this.comment;
    }
    public void setComment(String c){
        this.comment=c;
    }
}
