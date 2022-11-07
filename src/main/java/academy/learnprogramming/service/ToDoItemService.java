package academy.learnprogramming.service;

import academy.learnprogramming.model.ToDoData;
import academy.learnprogramming.model.ToDoItem;

public interface ToDoItemService {

    void addItem(ToDoItem toDoItem);

    void removeItem(int id);

    ToDoItem getItem(int id);

    void updateItem(ToDoItem toDoItem);

    ToDoData getData();
}
