package chedieck.bryan.injecaodependencia.model;

import chedieck.bryan.injecaodependencia.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Bryan Chedieck Pires
 * @version 1.0
 * @since 16/04/2020
 */
@Component
@Qualifier("cat")
public class Cat implements IAnimal {

    @Override
    public void comunicar() {
        // TODO AUTO-generated method stub
        System.out.println("miauuuu");
    }
}
