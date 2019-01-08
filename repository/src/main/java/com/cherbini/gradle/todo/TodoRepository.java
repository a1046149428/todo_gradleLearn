package com.cherbini.gradle.todo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cherbini
 * 2019/1/6 21:44
 */
public class TodoRepository
{
    private static Map<String,TodoItem> items=new HashMap<>();
    public void save(TodoItem item){
        System.out.println(""+item);
        items.put(item.getName(),item);
    }
}
