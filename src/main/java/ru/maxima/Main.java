package ru.maxima;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        RadioPlayer player = context.getBean("radioPlayer", RadioPlayer.class);
        player.playRadio();

    }
}
