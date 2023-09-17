import Implimentation.SgtPeppers;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContext {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(CDPlayerConfig.class);
        ctx.refresh();
       final SgtPeppers greetService = ctx.getBean(SgtPeppers.class);
       greetService.play();
        ctx.close();
    }

}
