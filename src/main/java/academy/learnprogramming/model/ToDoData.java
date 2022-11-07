package academy.learnprogramming.model;

import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToDoData {

    public static int idValue = 1;

    private final List<ToDoItem> items = new ArrayList<>();

    public ToDoData() {
        addItem(new ToDoItem("first", "first details", LocalDate.now()));
        addItem(new ToDoItem("second", "second details", LocalDate.now()));
        addItem(new ToDoItem("third", "third details", LocalDate.now()));
        addItem(new ToDoItem("fourth", "fourth details", LocalDate.now()));
    }

    public List<ToDoItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(@NonNull ToDoItem toAdd) {
        toAdd.setId(idValue);
        items.add(toAdd);
        idValue++;
    }

    public void removeItem(int id) {
        items.removeIf(item -> item.getId() == id);
    }

    public ToDoItem getItem(int id) {
        return items.stream().filter(item -> item.getId() == id).findAny().orElse(null);
    }

    public void updateItem(@NonNull ToDoItem toUpdate) {
        items.set(items.indexOf(toUpdate), toUpdate);
    }
}
