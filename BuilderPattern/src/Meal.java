import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public Meal addItem(Item item) {
        items.add(item);
        return this;
    }

    public float getCost() {
        return items.stream().map(Item::price).reduce((price1, price2) -> price1 + price2).orElse(0f);
    }

    public void showItems(){
        items.forEach(item -> {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        });
    }
}
