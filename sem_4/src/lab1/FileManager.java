package lab1;

import java.io.*;
import java.util.*;

public class FileManager {

    void saveBooks(List<Book> books){
        try {
            FileOutputStream fos = new FileOutputStream("library.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(books);
            oos.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    List<Book> loadBooks(){
        try{
            FileInputStream fis = new FileInputStream("library.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Book> books = (List<Book>) ois.readObject();
            ois.close();
            return books;
        }
        catch (Exception e){
            return new ArrayList<>();
        }
    }
}
