package sources;

import java.util.*;

public class ZOO {
    private String nume;
    private IngrijitorZOO ingrijitorZOO;
    List<Animal> animale;

    public ZOO(String nume, IngrijitorZOO ingrijitorZOO) {
        this.nume = nume;
        this.ingrijitorZOO = ingrijitorZOO;
        this.animale = new ArrayList<>();
    }



    public List<Animal> getAnimale(){
        return animale;
    }

    public void adaugaAnimal(Animal animal){
        animale.add(animal);}

    public void hranesteAnimale(){
        for(Animal a: animale)
        ingrijitorZOO.hranesteAnimal(a, "iarba"); }
}
