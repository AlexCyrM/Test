public class Hain {
  private static final String GREETING = "Hello World"; // these are both outside the thingy because Jack highlighted how this is better future-proofing for if I make multiple instance of this class
  private static final String MEANNESS = "Go Away World";
  public static void main(String[] args) {
    float currentAmicab = (float) Math.random(); //this generates a float -- it's yote away the extra data from a double -- to represent how amicable the machine is
    float amicabThresh = 0.3 //this determines how low the amicability must go for the machine to be mean
    String response = (currentAmicab > amicabThresh) ? GREETING : MEANNESS; 
    System.out.println(response);
  }
}
