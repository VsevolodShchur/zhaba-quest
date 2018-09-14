import java.util.ArrayList;

public class Player {
    private int Health;
    private int MaxHealth = 100;
    private int Money;
    private Item ActiveItem;
    private ArrayList<Item> ItemList;

    public Player(){
        Health = MaxHealth;
        Money = 0;
    }
}
