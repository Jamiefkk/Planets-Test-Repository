public class Runner {
    public static void main(String[] args) {
        Planet mars = new Planet("Mars", 909090);
        System.out.println(mars.getName() + " is " + mars.getSize() + " big!");
        mars.explode();
    }

}
