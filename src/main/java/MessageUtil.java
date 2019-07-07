public class MessageUtil {
  private String message;

  public MessageUtil(String message) {
    this.message = message;
  }

  public String printMessage() {
    System.out.println(message);
    return message;
  }

  public String salutationMessage() {
    String temp = "Hi! " + message;
    System.out.println(temp);
    return temp;
  }
}
