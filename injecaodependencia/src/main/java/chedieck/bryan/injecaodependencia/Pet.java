package chedieck.bryan.injecaodependencia;

import chedieck.bryan.injecaodependencia.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Bryan Chedieck Pires
 * @version 1.0
 * @since 16/04/2020
 */
@Component
public class Pet {

    @Autowired
    @Qualifier("cat")
    private IAnimal iAnimal;

    public void execute() { iAnimal.comunicar(); }
}
