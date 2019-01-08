package com.cherbini.gradle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * @author cherbini
 * 2019/1/4 16:17
 */
public class App
{
    static Logger logger= LoggerFactory.getLogger(App.class);
    public static void main(String[] args)
    {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (++i > 0)
        {
           logger.info(i+". please input todo item name");
            TodoItem item=new TodoItem(scanner.nextLine());
            logger.info(item.toString());
        }
    }
}
