package com.cherbini.gradle.todo;

/**
 * @author cherbini
 * 2019/1/4 16:17
 */
public class TodoItem
{
    private String name;
    private boolean hasDone;
    public TodoItem(String name){
        this.name=name;
    }

    @Override
    public String toString()
    {
        return "TodoItem{" + "name='" + name + '\'' + ", hasDone=" + hasDone + '}';
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isHasDone()
    {
        return hasDone;
    }

    public void setHasDone(boolean hasDone)
    {
        this.hasDone = hasDone;
    }
}
