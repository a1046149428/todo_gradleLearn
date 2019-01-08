package com.cherbini.gradle.todo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author cherbini
 * 2019/1/8 23:26
 */
public class TodoItemTest
{
    @Test
    public void testItem()
    {
     TodoItem todoItem =new TodoItem("to");
     assert todoItem.getName().equals("to");
    }
}