public class Hain {
  private static final String GREETING = "Hello World";
  private static final String MEANNESS = "Go Away World";
  public static void main(String[] args) {
    float curCharisma = (float) Math.random();
    float chaThresh = 0.09f;
    float currentAmicab = (float) Math.random(); //generates a number representing how amicable the machine is
    float amicabThresh = 0.3f; //how amicable it needs to be to greet
    double creativity = Math.random(); //how much the machine creates
    if (currentAmicab > amicabThresh) {
      System.out.println(GREETING);
    } else if (curCharisma > chaThresh) {
      System.out.println(MEANNESS);
    } else {
    }
    System.out.println("... anyhow I built something");
    universe1 = new Universe(17, 3, 69);
  }
}
