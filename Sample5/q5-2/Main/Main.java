public class Main {
  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました。");
    System.out.println("件名:" + title);
    System.out.println("本文:" + text);
  }

  public static void main(String[] args) {
    String title = "配達";
    String address = "sample@example.com";
    String text = "明日届きます";
    email(title, address, text);
  }
}
