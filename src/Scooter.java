public class Scooter extends Car {

    public Scooter(String id) {
        this.id = ("scooter_" + id);
        length = super.getLength() * 0.75f;
    }

}