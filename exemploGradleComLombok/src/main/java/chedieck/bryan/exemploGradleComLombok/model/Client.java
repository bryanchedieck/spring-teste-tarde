package chedieck.bryan.exemploGradleComLombok.model;

import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@ToString(exclude="lastName")
@Getter @Setter
/**
 * @author Bryan Chedieck Pires
 * @version 1.0
 * @since 15/04/2020
 */
public class Client {

    private String name;
    private String lastName;
    private String email;
}
