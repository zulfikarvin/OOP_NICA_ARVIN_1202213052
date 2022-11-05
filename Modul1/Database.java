package Modul1;
import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class (CREATE LIST)
    list<menu> listmenu = new ArrayList<>();
    

    // TODO Create Method to Insert Menu to Database
    public void insertMenu(){
        listmenu.add(menu);
    }
    // TODO Create Method to Show Menu from Database
    public void showMenu(){
        System.out.println("Menu : ");
        System.out.println("======================");
        for(int i = 0; i<listmenu.get(i).name +"( " + listmenu.get(i).category +")")
    }
    // TODO Create Method to Search Menu from Database
    public void searchMenu(){

    }

}
