package Implimentation;

import interfaces.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
      //  System.out.println(" the injected bean in"+cd.getClass());
        this.cd = cd;
    }
    public void play() {
        cd.play();
    }
}
