package section8_OOP.singleton;

/*
    Przykładem użycia Singletona może być np zarejstrowane połączenie do bazy danych.
 */

public class DBConnection {

    private static DBConnection instance;

    private DBConnection(){

    }

    public static DBConnection getInstance(){
        if(instance == null){
            instance = new DBConnection();
        }

        return instance;
    }

    public void getFromDB(){
        System.out.println("DB connected!");
    }

}
