package com.github.jiahut.jackson;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

       ObjectMapper mapper = new ObjectMapper();

       var apple = new Apple();
       apple.setName("apple01");
       apple.setSize(9);

       var appleStr = mapper.writeValueAsString(apple);
       System.out.println(appleStr);


       var peach = new Peach();
       peach.setName("peach01");
       peach.setWeight(10);

       var peachStr = mapper.writeValueAsString(peach);

       System.out.println(peachStr);

       var apple1 = (Apple)mapper.readValue(appleStr, Fruit.class);
       var peach1 = (Peach) mapper.readValue(peachStr, Fruit.class);

       System.out.printf("apple .name = %s .size = %d \n", apple1.getName(), apple1.getSize());
       System.out.printf("petch.name = %s .weight = %d \n", peach1.getName(), peach1.getWeight());

    }
}
