public class Hain {
  private static final String GREETING = "Hello World";
  private static final String MEANNESS = "Go Away World";
  public static void main(String[] args) {
    float currentAmicab = (float) Math.random();
    float amicabThresh = 0.3
    if (currentAmicab > amicabThresh) {
      System.out.println(GREETING);
    } else {
      System.out.println(MEANNESS);
    }
  }
}
