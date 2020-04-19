package chedieck.bryan.injecaodependencia.model;

import chedieck.bryan.injecaodependencia.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Bryan Chedieck Pires
 * @version 1.0
 * @since 16/04/2020
 */
@Component
@Primary
@Qualifier
public class Dog implements IAnimal {

    @Override
    public void comunicar() {
        // TODO Auto-generated method stub
        System.out.println("au auuuu");
    }
}
