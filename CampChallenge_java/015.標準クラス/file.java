/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.io.File;
import java.io.FileWriter;
/**
 *
 * @author user
 */
public class file {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException  {
          //ファイルオープン
          
         File mine = new File("test.txt");
         
         FileWriter fw = new FileWriter(mine);
         
         fw.write("むろこし　5/26　双子座");
         
         fw.close();

         
      }
}
