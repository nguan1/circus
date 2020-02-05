package circus.stuff;
<<<<<<< HEAD:src/main/java/circus/stuff/Cannon.java
=======

>>>>>>> origin/improved:src/main/java/Cannon.java
public class Cannon extends Equipment {

    public Cannon(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 3;
    }
}
