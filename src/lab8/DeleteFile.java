package lab8;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args){
        File myObj = new File("text.txt");
        if (myObj.delete()){
            System.out.println("Stergere fisier: "+ myObj.getName());
        }else{
            System.out.println("Nu s-a reusit stergerea");
        }
    }
}
