package section8_OOP.keyWordStatic.exercise;

public class Item {

    public static int numItems = 0;
    public static int ID;

    public Item(int id){
        ID = id;
    }

    public static int getNextId(){
        return numItems++;

    }

    public static Item getItem(){
        int id = Item.getNextId();
        return new Item(id);
    }

    public static void printNumItems(){
        System.out.println("Num Items: "+Item.numItems);
    }

    public void printId(){
        System.out.println("ID: "+this.ID);
    }

    public static void main(String[]args){
        Item item1 = Item.getItem();
        Item item2 = Item.getItem();
        Item item3 = Item.getItem();

        Item.printNumItems();

        System.out.println("- - - - - - - - - - ");

        for(int i =0; i < 3; i++){
            Item item = Item.getItem();
            item.printId();
        }

    }

}
