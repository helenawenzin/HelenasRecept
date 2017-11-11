package se.wenzin.HelenasRecept;

import lombok.Builder;
import lombok.Value;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "recipe", schema = "helenasrecept")
@Builder
@Value
public class Recipe {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="nrOfPeople")
    private int numberOfPeople;

    @Column(name="nrOfUnits")
    private int numberOfUnits;


    //private List<Ingrediens> ingredientsForRecipe;

    @Column(name="description")
    private String description;



}
