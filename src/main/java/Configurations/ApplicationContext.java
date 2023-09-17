package Configurations;

import Implimentation.CDPlayer;
import Implimentation.SgtPeppers;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContext {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(CDPlayerConfig.class);
        ctx.refresh();
       final SgtPeppers sgtPeppers = ctx.getBean(SgtPeppers.class);
       final CDPlayer cdPlayer = ctx.getBean(CDPlayer.class);
        sgtPeppers.play();
        cdPlayer.play();
        ctx.close();
    }

}
