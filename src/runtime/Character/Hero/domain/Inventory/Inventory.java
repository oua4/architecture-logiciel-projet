package runtime.Character.Hero.domain.Inventory;

import runtime.Character.Hero.domain.exceptions.InventoryFullException;
import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private static final int MAX_CAPACITY = 10;

    private final List<Object> items = new ArrayList<>();

    public void addItem(Object item) {
        if (isFull()) {
            throw new InventoryFullException();
        }
        items.add(item);
    }

    public void removeItem(Object item) {
        items.remove(item);
    }

    public boolean contains(Object item) {
        return items.contains(item);
    }

    public boolean isFull() {
        return items.size() >= MAX_CAPACITY;
    }

    // Combien d'objets sont dans le sac en ce moment.
    public int getItemCount() {
        return items.size();
    }

    public List<Object> getItems() {
        return items;
    }
}