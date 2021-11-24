public class Hain {
  public static void main(String[] args) {
    String greeting = "Hello World";
    String meanness = "Go Away World";
    float currentAmicab = (float) Math.random();
    float amicabThresh = 0.3
    if (currentAmicab > amicabThresh) {
      System.out.println(greeting);
    } else {
      System.out.println(meanness);
    }
  }
}
